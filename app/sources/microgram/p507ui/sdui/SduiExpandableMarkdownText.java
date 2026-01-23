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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298Bc\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001cR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001cR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b1\u0010(\u001a\u0004\b/\u00100R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010.\u0012\u0004\b3\u0010(\u001a\u0004\b2\u00100R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00104\u0012\u0004\b7\u0010(\u001a\u0004\b5\u00106¨\u0006:"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiExpandableMarkdownText;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "buttonColorOverride", "", "collapseButtonText", "expandButtonText", "Lmicrogram/ui/sdui/SduiMarkdownText;", "fullTextMarkdown", "previewTextMarkdown", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiExpandableMarkdownText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getButtonColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getButtonColorOverride$annotations", "()V", "Ljava/lang/String;", "getCollapseButtonText", "getCollapseButtonText$annotations", "getExpandButtonText", "getExpandButtonText$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getFullTextMarkdown", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getFullTextMarkdown$annotations", "getPreviewTextMarkdown", "getPreviewTextMarkdown$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiExpandableMarkdownText extends SduiComponent {
    private final SduiThemedColor buttonColorOverride;
    private final String collapseButtonText;
    private final String expandButtonText;
    private final SduiMarkdownText fullTextMarkdown;
    private final SduiMarkdownText previewTextMarkdown;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiExpandableMarkdownText)) {
            return false;
        }
        SduiExpandableMarkdownText sduiExpandableMarkdownText = (SduiExpandableMarkdownText) other;
        return Intrinsics.areEqual(this.buttonColorOverride, sduiExpandableMarkdownText.buttonColorOverride) && Intrinsics.areEqual(this.collapseButtonText, sduiExpandableMarkdownText.collapseButtonText) && Intrinsics.areEqual(this.expandButtonText, sduiExpandableMarkdownText.expandButtonText) && Intrinsics.areEqual(this.fullTextMarkdown, sduiExpandableMarkdownText.fullTextMarkdown) && Intrinsics.areEqual(this.previewTextMarkdown, sduiExpandableMarkdownText.previewTextMarkdown) && this.sduiComponentType == sduiExpandableMarkdownText.sduiComponentType;
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.buttonColorOverride;
        return ((((((((((sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31) + this.collapseButtonText.hashCode()) * 31) + this.expandButtonText.hashCode()) * 31) + this.fullTextMarkdown.hashCode()) * 31) + this.previewTextMarkdown.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiExpandableMarkdownText(buttonColorOverride=" + this.buttonColorOverride + ", collapseButtonText=" + this.collapseButtonText + ", expandButtonText=" + this.expandButtonText + ", fullTextMarkdown=" + this.fullTextMarkdown + ", previewTextMarkdown=" + this.previewTextMarkdown + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiExpandableMarkdownText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiExpandableMarkdownText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiExpandableMarkdownText> serializer() {
            return SduiExpandableMarkdownText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiExpandableMarkdownText(int i, @SerialName("button_color_override") SduiThemedColor sduiThemedColor, @SerialName("collapse_button_text") String str, @SerialName("expand_button_text") String str2, @SerialName("full_text_markdown") SduiMarkdownText sduiMarkdownText, @SerialName("preview_text_markdown") SduiMarkdownText sduiMarkdownText2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (30 != (i & 30)) {
            PluginExceptions.throwMissingFieldException(i, 30, SduiExpandableMarkdownText$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.buttonColorOverride = null;
        } else {
            this.buttonColorOverride = sduiThemedColor;
        }
        this.collapseButtonText = str;
        this.expandButtonText = str2;
        this.fullTextMarkdown = sduiMarkdownText;
        this.previewTextMarkdown = sduiMarkdownText2;
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.EXPANDABLE_MARKDOWN_TEXT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiExpandableMarkdownText self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.buttonColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.buttonColorOverride);
        }
        output.encodeStringElement(serialDesc, 1, self.collapseButtonText);
        output.encodeStringElement(serialDesc, 2, self.expandButtonText);
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, sduiMarkdownText$$serializer, self.fullTextMarkdown);
        output.encodeSerializableElement(serialDesc, 4, sduiMarkdownText$$serializer, self.previewTextMarkdown);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.sduiComponentType == SduiComponentType.EXPANDABLE_MARKDOWN_TEXT) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
    }
}
