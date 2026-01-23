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

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdownWithTrailingAction;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiMarkdownText;", "markdownText", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTextWithAction;", "trailingAction", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTextWithAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarkdownWithTrailingAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getMarkdownText", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getMarkdownText$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTextWithAction;", "getTrailingAction", "()Lmicrogram/ui/sdui/SduiTextWithAction;", "getTrailingAction$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarkdownWithTrailingAction extends SduiComponent {
    private final SduiMarkdownText markdownText;
    private final SduiComponentType sduiComponentType;
    private final SduiTextWithAction trailingAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiComponentType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarkdownWithTrailingAction)) {
            return false;
        }
        SduiMarkdownWithTrailingAction sduiMarkdownWithTrailingAction = (SduiMarkdownWithTrailingAction) other;
        return Intrinsics.areEqual(this.markdownText, sduiMarkdownWithTrailingAction.markdownText) && this.sduiComponentType == sduiMarkdownWithTrailingAction.sduiComponentType && Intrinsics.areEqual(this.trailingAction, sduiMarkdownWithTrailingAction.trailingAction);
    }

    public int hashCode() {
        return (((this.markdownText.hashCode() * 31) + this.sduiComponentType.hashCode()) * 31) + this.trailingAction.hashCode();
    }

    public String toString() {
        return "SduiMarkdownWithTrailingAction(markdownText=" + this.markdownText + ", sduiComponentType=" + this.sduiComponentType + ", trailingAction=" + this.trailingAction + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdownWithTrailingAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarkdownWithTrailingAction;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarkdownWithTrailingAction> serializer() {
            return SduiMarkdownWithTrailingAction$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarkdownWithTrailingAction(int i, @SerialName("markdown_text") SduiMarkdownText sduiMarkdownText, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("trailing_action") SduiTextWithAction sduiTextWithAction, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (5 != (i & 5)) {
            PluginExceptions.throwMissingFieldException(i, 5, SduiMarkdownWithTrailingAction$$serializer.INSTANCE.getDescriptor());
        }
        this.markdownText = sduiMarkdownText;
        if ((i & 2) == 0) {
            this.sduiComponentType = SduiComponentType.MARKDOWN_WITH_TRAILING_ACTION;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.trailingAction = sduiTextWithAction;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarkdownWithTrailingAction self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiMarkdownText$$serializer.INSTANCE, self.markdownText);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sduiComponentType != SduiComponentType.MARKDOWN_WITH_TRAILING_ACTION) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 2, SduiTextWithAction$$serializer.INSTANCE, self.trailingAction);
    }
}
