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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[ZB±\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#HÁ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b9\u00105\u001a\u0004\b7\u00108R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b=\u00105\u001a\u0004\b;\u0010<R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b?\u00105\u001a\u0004\b>\u00103R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010*R \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00101\u0012\u0004\bB\u00105\u001a\u0004\b\r\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010C\u0012\u0004\bF\u00105\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bG\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bI\u00105\u001a\u0004\bH\u0010*R \u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010J\u0012\u0004\bM\u00105\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010Y¨\u0006\\"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextInput;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "activateKeyboardOnAppear", "Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;", "autocapitalizationType", "Lmicrogram/ui/sdui/SduiTextInputAutoCorrectionType;", "autocorrectionType", "hideLabel", "", "identifier", "isEnabled", "Lmicrogram/ui/sdui/SduiTextInputKeyboardType;", "keyboardType", AnnotatedPrivateKey.LABEL, "placeholderText", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextInputSize;", "size", "Lmicrogram/ui/sdui/SduiTextInputState;", "state", "Lmicrogram/ui/sdui/SduiTextInputToolbar;", "toolbar", "Lmicrogram/ui/sdui/SduiTextInputValidators;", "validators", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IZLmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;Lmicrogram/ui/sdui/SduiTextInputAutoCorrectionType;ZLjava/lang/String;ZLmicrogram/ui/sdui/SduiTextInputKeyboardType;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextInputSize;Lmicrogram/ui/sdui/SduiTextInputState;Lmicrogram/ui/sdui/SduiTextInputToolbar;Lmicrogram/ui/sdui/SduiTextInputValidators;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextInput;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getActivateKeyboardOnAppear", "()Z", "getActivateKeyboardOnAppear$annotations", "()V", "Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;", "getAutocapitalizationType", "()Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;", "getAutocapitalizationType$annotations", "Lmicrogram/ui/sdui/SduiTextInputAutoCorrectionType;", "getAutocorrectionType", "()Lmicrogram/ui/sdui/SduiTextInputAutoCorrectionType;", "getAutocorrectionType$annotations", "getHideLabel", "getHideLabel$annotations", "Ljava/lang/String;", "getIdentifier", "isEnabled$annotations", "Lmicrogram/ui/sdui/SduiTextInputKeyboardType;", "getKeyboardType", "()Lmicrogram/ui/sdui/SduiTextInputKeyboardType;", "getKeyboardType$annotations", "getLabel", "getPlaceholderText", "getPlaceholderText$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextInputSize;", "getSize", "()Lmicrogram/ui/sdui/SduiTextInputSize;", "Lmicrogram/ui/sdui/SduiTextInputState;", "getState", "()Lmicrogram/ui/sdui/SduiTextInputState;", "Lmicrogram/ui/sdui/SduiTextInputToolbar;", "getToolbar", "()Lmicrogram/ui/sdui/SduiTextInputToolbar;", "Lmicrogram/ui/sdui/SduiTextInputValidators;", "getValidators", "()Lmicrogram/ui/sdui/SduiTextInputValidators;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextInput extends SduiComponent {
    private final boolean activateKeyboardOnAppear;
    private final SduiTextInputAutoCapitalizationType autocapitalizationType;
    private final SduiTextInputAutoCorrectionType autocorrectionType;
    private final boolean hideLabel;
    private final String identifier;
    private final boolean isEnabled;
    private final SduiTextInputKeyboardType keyboardType;
    private final String label;
    private final String placeholderText;
    private final SduiComponentType sduiComponentType;
    private final SduiTextInputSize size;
    private final SduiTextInputState state;
    private final SduiTextInputToolbar toolbar;
    private final SduiTextInputValidators validators;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiTextInputAutoCapitalizationType.INSTANCE.serializer(), SduiTextInputAutoCorrectionType.INSTANCE.serializer(), null, null, null, SduiTextInputKeyboardType.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer(), SduiTextInputSize.INSTANCE.serializer(), null, SduiTextInputToolbar.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextInput)) {
            return false;
        }
        SduiTextInput sduiTextInput = (SduiTextInput) other;
        return this.activateKeyboardOnAppear == sduiTextInput.activateKeyboardOnAppear && this.autocapitalizationType == sduiTextInput.autocapitalizationType && this.autocorrectionType == sduiTextInput.autocorrectionType && this.hideLabel == sduiTextInput.hideLabel && Intrinsics.areEqual(this.identifier, sduiTextInput.identifier) && this.isEnabled == sduiTextInput.isEnabled && this.keyboardType == sduiTextInput.keyboardType && Intrinsics.areEqual(this.label, sduiTextInput.label) && Intrinsics.areEqual(this.placeholderText, sduiTextInput.placeholderText) && this.sduiComponentType == sduiTextInput.sduiComponentType && this.size == sduiTextInput.size && Intrinsics.areEqual(this.state, sduiTextInput.state) && this.toolbar == sduiTextInput.toolbar && Intrinsics.areEqual(this.validators, sduiTextInput.validators);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.activateKeyboardOnAppear) * 31;
        SduiTextInputAutoCapitalizationType sduiTextInputAutoCapitalizationType = this.autocapitalizationType;
        int iHashCode2 = (iHashCode + (sduiTextInputAutoCapitalizationType == null ? 0 : sduiTextInputAutoCapitalizationType.hashCode())) * 31;
        SduiTextInputAutoCorrectionType sduiTextInputAutoCorrectionType = this.autocorrectionType;
        int iHashCode3 = (((((((iHashCode2 + (sduiTextInputAutoCorrectionType == null ? 0 : sduiTextInputAutoCorrectionType.hashCode())) * 31) + Boolean.hashCode(this.hideLabel)) * 31) + this.identifier.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        SduiTextInputKeyboardType sduiTextInputKeyboardType = this.keyboardType;
        int iHashCode4 = (((iHashCode3 + (sduiTextInputKeyboardType == null ? 0 : sduiTextInputKeyboardType.hashCode())) * 31) + this.label.hashCode()) * 31;
        String str = this.placeholderText;
        int iHashCode5 = (((((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.size.hashCode()) * 31) + this.state.hashCode()) * 31) + this.toolbar.hashCode()) * 31;
        SduiTextInputValidators sduiTextInputValidators = this.validators;
        return iHashCode5 + (sduiTextInputValidators != null ? sduiTextInputValidators.hashCode() : 0);
    }

    public String toString() {
        return "SduiTextInput(activateKeyboardOnAppear=" + this.activateKeyboardOnAppear + ", autocapitalizationType=" + this.autocapitalizationType + ", autocorrectionType=" + this.autocorrectionType + ", hideLabel=" + this.hideLabel + ", identifier=" + this.identifier + ", isEnabled=" + this.isEnabled + ", keyboardType=" + this.keyboardType + ", label=" + this.label + ", placeholderText=" + this.placeholderText + ", sduiComponentType=" + this.sduiComponentType + ", size=" + this.size + ", state=" + this.state + ", toolbar=" + this.toolbar + ", validators=" + this.validators + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextInput$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextInput;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextInput> serializer() {
            return SduiTextInput$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTextInput(int i, @SerialName("activate_keyboard_on_appear") boolean z, @SerialName("autocapitalization_type") SduiTextInputAutoCapitalizationType sduiTextInputAutoCapitalizationType, @SerialName("autocorrection_type") SduiTextInputAutoCorrectionType sduiTextInputAutoCorrectionType, @SerialName("hide_label") boolean z2, String str, @SerialName("is_enabled") boolean z3, @SerialName("keyboard_type") SduiTextInputKeyboardType sduiTextInputKeyboardType, String str2, @SerialName("placeholder_text") String str3, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTextInputSize sduiTextInputSize, SduiTextInputState sduiTextInputState, SduiTextInputToolbar sduiTextInputToolbar, SduiTextInputValidators sduiTextInputValidators, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (16 != (i & 16)) {
            PluginExceptions.throwMissingFieldException(i, 16, SduiTextInput$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.activateKeyboardOnAppear = false;
        } else {
            this.activateKeyboardOnAppear = z;
        }
        if ((i & 2) == 0) {
            this.autocapitalizationType = null;
        } else {
            this.autocapitalizationType = sduiTextInputAutoCapitalizationType;
        }
        if ((i & 4) == 0) {
            this.autocorrectionType = null;
        } else {
            this.autocorrectionType = sduiTextInputAutoCorrectionType;
        }
        if ((i & 8) == 0) {
            this.hideLabel = false;
        } else {
            this.hideLabel = z2;
        }
        this.identifier = str;
        if ((i & 32) == 0) {
            this.isEnabled = true;
        } else {
            this.isEnabled = z3;
        }
        if ((i & 64) == 0) {
            this.keyboardType = null;
        } else {
            this.keyboardType = sduiTextInputKeyboardType;
        }
        if ((i & 128) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 256) == 0) {
            this.placeholderText = null;
        } else {
            this.placeholderText = str3;
        }
        if ((i & 512) == 0) {
            this.sduiComponentType = SduiComponentType.TEXT_INPUT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 1024) == 0) {
            this.size = SduiTextInputSize.REGULAR;
        } else {
            this.size = sduiTextInputSize;
        }
        this.state = (i & 2048) == 0 ? new SduiTextInputState((SduiComponentStateType) null, "", 1, (DefaultConstructorMarker) null) : sduiTextInputState;
        this.toolbar = (i & 4096) == 0 ? SduiTextInputToolbar.DEFAULT : sduiTextInputToolbar;
        if ((i & 8192) == 0) {
            this.validators = null;
        } else {
            this.validators = sduiTextInputValidators;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextInput self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.activateKeyboardOnAppear) {
            output.encodeBooleanElement(serialDesc, 0, self.activateKeyboardOnAppear);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.autocapitalizationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.autocapitalizationType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.autocorrectionType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, kSerializerArr[2], self.autocorrectionType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hideLabel) {
            output.encodeBooleanElement(serialDesc, 3, self.hideLabel);
        }
        output.encodeStringElement(serialDesc, 4, self.identifier);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !self.isEnabled) {
            output.encodeBooleanElement(serialDesc, 5, self.isEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.keyboardType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.keyboardType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual(self.label, "")) {
            output.encodeStringElement(serialDesc, 7, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.placeholderText != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.placeholderText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.sduiComponentType != SduiComponentType.TEXT_INPUT) {
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.size != SduiTextInputSize.REGULAR) {
            output.encodeSerializableElement(serialDesc, 10, kSerializerArr[10], self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || !Intrinsics.areEqual(self.state, new SduiTextInputState((SduiComponentStateType) null, "", 1, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 11, SduiTextInputState$$serializer.INSTANCE, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.toolbar != SduiTextInputToolbar.DEFAULT) {
            output.encodeSerializableElement(serialDesc, 12, kSerializerArr[12], self.toolbar);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 13) && self.validators == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 13, SduiTextInputValidators$$serializer.INSTANCE, self.validators);
    }
}
