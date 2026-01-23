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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BE\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b-\u0010,¨\u00060"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowHeader;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "image", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowHeader;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "getImage", "()Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowHeader extends SduiComponent {
    private final SduiInvestFlowThemedImageSource image;
    private final SduiComponentType sduiComponentType;
    private final SduiMarkdownText subtitle;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowHeader)) {
            return false;
        }
        SduiInvestFlowHeader sduiInvestFlowHeader = (SduiInvestFlowHeader) other;
        return Intrinsics.areEqual(this.image, sduiInvestFlowHeader.image) && this.sduiComponentType == sduiInvestFlowHeader.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiInvestFlowHeader.subtitle) && Intrinsics.areEqual(this.title, sduiInvestFlowHeader.title);
    }

    public int hashCode() {
        SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource = this.image;
        int iHashCode = (((sduiInvestFlowThemedImageSource == null ? 0 : sduiInvestFlowThemedImageSource.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiMarkdownText sduiMarkdownText = this.subtitle;
        return ((iHashCode + (sduiMarkdownText != null ? sduiMarkdownText.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowHeader(image=" + this.image + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowHeader$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowHeader;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowHeader> serializer() {
            return SduiInvestFlowHeader$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiInvestFlowHeader(int i, SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (8 != (i & 8)) {
            PluginExceptions.throwMissingFieldException(i, 8, SduiInvestFlowHeader$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.image = null;
        } else {
            this.image = sduiInvestFlowThemedImageSource;
        }
        if ((i & 2) == 0) {
            this.sduiComponentType = SduiComponentType.INVEST_FLOW_HEADER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiMarkdownText;
        }
        this.title = sduiMarkdownText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowHeader self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.image != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiInvestFlowThemedImageSource$$serializer.INSTANCE, self.image);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sduiComponentType != SduiComponentType.INVEST_FLOW_HEADER) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiMarkdownText$$serializer.INSTANCE, self.subtitle);
        }
        output.encodeSerializableElement(serialDesc, 3, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
