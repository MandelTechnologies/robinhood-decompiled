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
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:Bg\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b\u0006\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010.R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00102\u0012\u0004\b5\u0010+\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b9\u00108¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAccordionRow;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "content", "", "isOpen", "Lmicrogram/ui/sdui/SduiText;", "metadataSubtitle", "metadataTitle", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiComponent;ZLmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiText;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiAccordionRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiComponent;", "getContent", "()Lmicrogram/ui/sdui/SduiComponent;", "Z", "()Z", "isOpen$annotations", "()V", "Lmicrogram/ui/sdui/SduiText;", "getMetadataSubtitle", "()Lmicrogram/ui/sdui/SduiText;", "getMetadataSubtitle$annotations", "getMetadataTitle", "getMetadataTitle$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiAccordionRow extends SduiComponent {
    private final SduiComponent content;
    private final boolean isOpen;
    private final SduiText metadataSubtitle;
    private final SduiText metadataTitle;
    private final SduiComponentType sduiComponentType;
    private final SduiMarkdownText subtitle;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiAccordionRow)) {
            return false;
        }
        SduiAccordionRow sduiAccordionRow = (SduiAccordionRow) other;
        return Intrinsics.areEqual(this.content, sduiAccordionRow.content) && this.isOpen == sduiAccordionRow.isOpen && Intrinsics.areEqual(this.metadataSubtitle, sduiAccordionRow.metadataSubtitle) && Intrinsics.areEqual(this.metadataTitle, sduiAccordionRow.metadataTitle) && this.sduiComponentType == sduiAccordionRow.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiAccordionRow.subtitle) && Intrinsics.areEqual(this.title, sduiAccordionRow.title);
    }

    public int hashCode() {
        int iHashCode = ((this.content.hashCode() * 31) + Boolean.hashCode(this.isOpen)) * 31;
        SduiText sduiText = this.metadataSubtitle;
        int iHashCode2 = (iHashCode + (sduiText == null ? 0 : sduiText.hashCode())) * 31;
        SduiText sduiText2 = this.metadataTitle;
        int iHashCode3 = (((iHashCode2 + (sduiText2 == null ? 0 : sduiText2.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiMarkdownText sduiMarkdownText = this.subtitle;
        return ((iHashCode3 + (sduiMarkdownText != null ? sduiMarkdownText.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiAccordionRow(content=" + this.content + ", isOpen=" + this.isOpen + ", metadataSubtitle=" + this.metadataSubtitle + ", metadataTitle=" + this.metadataTitle + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiAccordionRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiAccordionRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiAccordionRow> serializer() {
            return SduiAccordionRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiAccordionRow(int i, SduiComponent sduiComponent, @SerialName("is_open") boolean z, @SerialName("metadata_subtitle") SduiText sduiText, @SerialName("metadata_title") SduiText sduiText2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (65 != (i & 65)) {
            PluginExceptions.throwMissingFieldException(i, 65, SduiAccordionRow$$serializer.INSTANCE.getDescriptor());
        }
        this.content = sduiComponent;
        if ((i & 2) == 0) {
            this.isOpen = false;
        } else {
            this.isOpen = z;
        }
        if ((i & 4) == 0) {
            this.metadataSubtitle = null;
        } else {
            this.metadataSubtitle = sduiText;
        }
        if ((i & 8) == 0) {
            this.metadataTitle = null;
        } else {
            this.metadataTitle = sduiText2;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.ACCORDION_ROW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiMarkdownText;
        }
        this.title = sduiMarkdownText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiAccordionRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiComponentSerializer.INSTANCE, self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isOpen) {
            output.encodeBooleanElement(serialDesc, 1, self.isOpen);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.metadataSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiText$$serializer.INSTANCE, self.metadataSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.metadataTitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiText$$serializer.INSTANCE, self.metadataTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.ACCORDION_ROW) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiMarkdownText$$serializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 6, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
