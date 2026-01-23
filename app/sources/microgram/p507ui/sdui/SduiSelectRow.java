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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b\u0007\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001fR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010+\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSelectRow;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "identifier", "", "isEnabled", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiSelectRowState;", "state", "subtitle", "title", "Lmicrogram/ui/sdui/SduiSelectRowType;", "type", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZLjava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiSelectRowState;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiSelectRowType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSelectRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "Z", "()Z", "isEnabled$annotations", "()V", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiSelectRowState;", "getState", "()Lmicrogram/ui/sdui/SduiSelectRowState;", "getSubtitle", "getTitle", "Lmicrogram/ui/sdui/SduiSelectRowType;", "getType", "()Lmicrogram/ui/sdui/SduiSelectRowType;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSelectRow extends SduiComponent {
    private final String identifier;
    private final boolean isEnabled;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiSelectRowState state;
    private final String subtitle;
    private final String title;
    private final SduiSelectRowType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null, SduiSelectRowType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSelectRow)) {
            return false;
        }
        SduiSelectRow sduiSelectRow = (SduiSelectRow) other;
        return Intrinsics.areEqual(this.identifier, sduiSelectRow.identifier) && this.isEnabled == sduiSelectRow.isEnabled && Intrinsics.areEqual(this.loggingIdentifier, sduiSelectRow.loggingIdentifier) && this.sduiComponentType == sduiSelectRow.sduiComponentType && Intrinsics.areEqual(this.state, sduiSelectRow.state) && Intrinsics.areEqual(this.subtitle, sduiSelectRow.subtitle) && Intrinsics.areEqual(this.title, sduiSelectRow.title) && this.type == sduiSelectRow.type;
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        String str = this.loggingIdentifier;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.state.hashCode()) * 31;
        String str2 = this.subtitle;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SduiSelectRow(identifier=" + this.identifier + ", isEnabled=" + this.isEnabled + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", state=" + this.state + ", subtitle=" + this.subtitle + ", title=" + this.title + ", type=" + this.type + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSelectRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSelectRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSelectRow> serializer() {
            return SduiSelectRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiSelectRow(int i, String str, @SerialName("is_enabled") boolean z, @SerialName("logging_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiSelectRowState sduiSelectRowState, String str3, String str4, SduiSelectRowType sduiSelectRowType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (65 != (i & 65)) {
            PluginExceptions.throwMissingFieldException(i, 65, SduiSelectRow$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        if ((i & 2) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z;
        }
        if ((i & 4) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str2;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.SELECT_ROW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.state = new SduiSelectRowState((SduiComponentStateType) null, false, 1, (DefaultConstructorMarker) null);
        } else {
            this.state = sduiSelectRowState;
        }
        if ((i & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        this.title = str4;
        if ((i & 128) == 0) {
            this.type = SduiSelectRowType.TOGGLE;
        } else {
            this.type = sduiSelectRowType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSelectRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.identifier);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 1, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.SELECT_ROW) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.state, new SduiSelectRowState((SduiComponentStateType) null, false, 1, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 4, SduiSelectRowState$$serializer.INSTANCE, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.subtitle);
        }
        output.encodeStringElement(serialDesc, 6, self.title);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.type == SduiSelectRowType.TOGGLE) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.type);
    }
}
