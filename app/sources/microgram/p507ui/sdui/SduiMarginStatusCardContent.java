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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287Bg\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u001dR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010$\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010/R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b4\u0010*\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b6\u0010\u001d¨\u00069"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginStatusCardContent;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "description", "Lmicrogram/ui/sdui/SduiMoney;", "marginBufferAmount", "marginBufferPercentage", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "showCta", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiMoney;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarginStatusCardContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "Lmicrogram/ui/sdui/SduiMoney;", "getMarginBufferAmount", "()Lmicrogram/ui/sdui/SduiMoney;", "getMarginBufferAmount$annotations", "()V", "getMarginBufferPercentage", "getMarginBufferPercentage$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Z", "getShowCta", "()Z", "getShowCta$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarginStatusCardContent extends SduiComponent {
    private final String description;
    private final SduiMoney marginBufferAmount;
    private final String marginBufferPercentage;
    private final SduiComponentType sduiComponentType;
    private final boolean showCta;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarginStatusCardContent)) {
            return false;
        }
        SduiMarginStatusCardContent sduiMarginStatusCardContent = (SduiMarginStatusCardContent) other;
        return Intrinsics.areEqual(this.description, sduiMarginStatusCardContent.description) && Intrinsics.areEqual(this.marginBufferAmount, sduiMarginStatusCardContent.marginBufferAmount) && Intrinsics.areEqual(this.marginBufferPercentage, sduiMarginStatusCardContent.marginBufferPercentage) && this.sduiComponentType == sduiMarginStatusCardContent.sduiComponentType && this.showCta == sduiMarginStatusCardContent.showCta && Intrinsics.areEqual(this.subtitle, sduiMarginStatusCardContent.subtitle) && Intrinsics.areEqual(this.title, sduiMarginStatusCardContent.title);
    }

    public int hashCode() {
        return (((((((((((this.description.hashCode() * 31) + this.marginBufferAmount.hashCode()) * 31) + this.marginBufferPercentage.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + Boolean.hashCode(this.showCta)) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiMarginStatusCardContent(description=" + this.description + ", marginBufferAmount=" + this.marginBufferAmount + ", marginBufferPercentage=" + this.marginBufferPercentage + ", sduiComponentType=" + this.sduiComponentType + ", showCta=" + this.showCta + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginStatusCardContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginStatusCardContent;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarginStatusCardContent> serializer() {
            return SduiMarginStatusCardContent$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarginStatusCardContent(int i, String str, @SerialName("margin_buffer_amount") SduiMoney sduiMoney, @SerialName("margin_buffer_percentage") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("show_cta") boolean z, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (103 != (i & 103)) {
            PluginExceptions.throwMissingFieldException(i, 103, SduiMarginStatusCardContent$$serializer.INSTANCE.getDescriptor());
        }
        this.description = str;
        this.marginBufferAmount = sduiMoney;
        this.marginBufferPercentage = str2;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.MARGIN_STATUS_CARD_CONTENT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.showCta = false;
        } else {
            this.showCta = z;
        }
        this.subtitle = str3;
        this.title = str4;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarginStatusCardContent self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.description);
        output.encodeSerializableElement(serialDesc, 1, SduiMoney$$serializer.INSTANCE, self.marginBufferAmount);
        output.encodeStringElement(serialDesc, 2, self.marginBufferPercentage);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.MARGIN_STATUS_CARD_CONTENT) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showCta) {
            output.encodeBooleanElement(serialDesc, 4, self.showCta);
        }
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeStringElement(serialDesc, 6, self.title);
    }
}
