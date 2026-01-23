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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/BG\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-¨\u00061"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecurringInsightsHeader;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiMatchLine;", "matchLine", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiMatchLine;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRecurringInsightsHeader;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiMatchLine;", "getMatchLine", "()Lmicrogram/ui/sdui/SduiMatchLine;", "getMatchLine$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRecurringInsightsHeader extends SduiComponent {
    private final SduiMatchLine matchLine;
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
        if (!(other instanceof SduiRecurringInsightsHeader)) {
            return false;
        }
        SduiRecurringInsightsHeader sduiRecurringInsightsHeader = (SduiRecurringInsightsHeader) other;
        return Intrinsics.areEqual(this.matchLine, sduiRecurringInsightsHeader.matchLine) && this.sduiComponentType == sduiRecurringInsightsHeader.sduiComponentType && Intrinsics.areEqual(this.subtitle, sduiRecurringInsightsHeader.subtitle) && Intrinsics.areEqual(this.title, sduiRecurringInsightsHeader.title);
    }

    public int hashCode() {
        SduiMatchLine sduiMatchLine = this.matchLine;
        return ((((((sduiMatchLine == null ? 0 : sduiMatchLine.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiRecurringInsightsHeader(matchLine=" + this.matchLine + ", sduiComponentType=" + this.sduiComponentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecurringInsightsHeader$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRecurringInsightsHeader;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRecurringInsightsHeader> serializer() {
            return SduiRecurringInsightsHeader$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiRecurringInsightsHeader(int i, @SerialName("match_line") SduiMatchLine sduiMatchLine, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (12 != (i & 12)) {
            PluginExceptions.throwMissingFieldException(i, 12, SduiRecurringInsightsHeader$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.matchLine = null;
        } else {
            this.matchLine = sduiMatchLine;
        }
        if ((i & 2) == 0) {
            this.sduiComponentType = SduiComponentType.RECURRING_INSIGHTS_HEADER;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.subtitle = sduiMarkdownText;
        this.title = sduiMarkdownText2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRecurringInsightsHeader self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.matchLine != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiMatchLine$$serializer.INSTANCE, self.matchLine);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sduiComponentType != SduiComponentType.RECURRING_INSIGHTS_HEADER) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.sduiComponentType);
        }
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, sduiMarkdownText$$serializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, sduiMarkdownText$$serializer, self.title);
    }
}
