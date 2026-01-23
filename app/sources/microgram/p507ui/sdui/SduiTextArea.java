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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB{\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010(\u0012\u0004\b3\u0010,\u001a\u0004\b\n\u0010*R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b4\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010-\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010!R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00107\u0012\u0004\b:\u0010,\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextArea;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "hideLabel", "", "identifier", "", "initialNumLines", "isEnabled", AnnotatedPrivateKey.LABEL, "placeholderText", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextAreaState;", "state", "Lmicrogram/ui/sdui/SduiTextAreaValidators;", "validators", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZLjava/lang/String;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextAreaState;Lmicrogram/ui/sdui/SduiTextAreaValidators;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextArea;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHideLabel", "()Z", "getHideLabel$annotations", "()V", "Ljava/lang/String;", "getIdentifier", "Ljava/lang/Long;", "getInitialNumLines", "()Ljava/lang/Long;", "getInitialNumLines$annotations", "isEnabled$annotations", "getLabel", "getPlaceholderText", "getPlaceholderText$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextAreaState;", "getState", "()Lmicrogram/ui/sdui/SduiTextAreaState;", "Lmicrogram/ui/sdui/SduiTextAreaValidators;", "getValidators", "()Lmicrogram/ui/sdui/SduiTextAreaValidators;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextArea extends SduiComponent {
    private final boolean hideLabel;
    private final String identifier;
    private final Long initialNumLines;
    private final boolean isEnabled;
    private final String label;
    private final String placeholderText;
    private final SduiComponentType sduiComponentType;
    private final SduiTextAreaState state;
    private final SduiTextAreaValidators validators;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextArea)) {
            return false;
        }
        SduiTextArea sduiTextArea = (SduiTextArea) other;
        return this.hideLabel == sduiTextArea.hideLabel && Intrinsics.areEqual(this.identifier, sduiTextArea.identifier) && Intrinsics.areEqual(this.initialNumLines, sduiTextArea.initialNumLines) && this.isEnabled == sduiTextArea.isEnabled && Intrinsics.areEqual(this.label, sduiTextArea.label) && Intrinsics.areEqual(this.placeholderText, sduiTextArea.placeholderText) && this.sduiComponentType == sduiTextArea.sduiComponentType && Intrinsics.areEqual(this.state, sduiTextArea.state) && Intrinsics.areEqual(this.validators, sduiTextArea.validators);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.hideLabel) * 31) + this.identifier.hashCode()) * 31;
        Long l = this.initialNumLines;
        int iHashCode2 = (((((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.label.hashCode()) * 31;
        String str = this.placeholderText;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.state.hashCode()) * 31;
        SduiTextAreaValidators sduiTextAreaValidators = this.validators;
        return iHashCode3 + (sduiTextAreaValidators != null ? sduiTextAreaValidators.hashCode() : 0);
    }

    public String toString() {
        return "SduiTextArea(hideLabel=" + this.hideLabel + ", identifier=" + this.identifier + ", initialNumLines=" + this.initialNumLines + ", isEnabled=" + this.isEnabled + ", label=" + this.label + ", placeholderText=" + this.placeholderText + ", sduiComponentType=" + this.sduiComponentType + ", state=" + this.state + ", validators=" + this.validators + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextArea$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextArea;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextArea> serializer() {
            return SduiTextArea$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTextArea(int i, @SerialName("hide_label") boolean z, String str, @SerialName("initial_num_lines") Long l, @SerialName("is_enabled") boolean z2, String str2, @SerialName("placeholder_text") String str3, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextAreaState sduiTextAreaState, SduiTextAreaValidators sduiTextAreaValidators, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiTextArea$$serializer.INSTANCE.getDescriptor());
        }
        this.hideLabel = (i & 1) == 0 ? false : z;
        this.identifier = str;
        if ((i & 4) == 0) {
            this.initialNumLines = null;
        } else {
            this.initialNumLines = l;
        }
        if ((i & 8) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z2;
        }
        if ((i & 16) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 32) == 0) {
            this.placeholderText = null;
        } else {
            this.placeholderText = str3;
        }
        if ((i & 64) == 0) {
            this.sduiComponentType = SduiComponentType.TEXT_AREA;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 128) == 0) {
            this.state = new SduiTextAreaState((SduiComponentStateType) null, "", 1, (DefaultConstructorMarker) null);
        } else {
            this.state = sduiTextAreaState;
        }
        if ((i & 256) == 0) {
            this.validators = null;
        } else {
            this.validators = sduiTextAreaValidators;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextArea self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.hideLabel) {
            output.encodeBooleanElement(serialDesc, 0, self.hideLabel);
        }
        output.encodeStringElement(serialDesc, 1, self.identifier);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initialNumLines != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.initialNumLines);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 3, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.label, "")) {
            output.encodeStringElement(serialDesc, 4, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.placeholderText != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.placeholderText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.sduiComponentType != SduiComponentType.TEXT_AREA) {
            output.encodeSerializableElement(serialDesc, 6, kSerializerArr[6], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.state, new SduiTextAreaState((SduiComponentStateType) null, "", 1, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 7, SduiTextAreaState$$serializer.INSTANCE, self.state);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.validators == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, SduiTextAreaValidators$$serializer.INSTANCE, self.validators);
    }
}
