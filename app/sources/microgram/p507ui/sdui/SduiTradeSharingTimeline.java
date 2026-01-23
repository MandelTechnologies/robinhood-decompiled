package microgram.p507ui.sdui;

import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010*\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010,¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTradeSharingTimeline;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "Lmicrogram/ui/sdui/SduiTradeSharingTimelineRow;", "rows", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "", "trailingEnd", "trailingStart", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lmicrogram/ui/sdui/SduiComponentType;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTradeSharingTimeline;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "()V", "Z", "getTrailingEnd", "()Z", "getTrailingEnd$annotations", "getTrailingStart", "getTrailingStart$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTradeSharingTimeline extends SduiComponent {
    private final List<SduiTradeSharingTimelineRow> rows;
    private final SduiComponentType sduiComponentType;
    private final boolean trailingEnd;
    private final boolean trailingStart;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SduiTradeSharingTimelineRow$$serializer.INSTANCE), SduiComponentType.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTradeSharingTimeline)) {
            return false;
        }
        SduiTradeSharingTimeline sduiTradeSharingTimeline = (SduiTradeSharingTimeline) other;
        return Intrinsics.areEqual(this.rows, sduiTradeSharingTimeline.rows) && this.sduiComponentType == sduiTradeSharingTimeline.sduiComponentType && this.trailingEnd == sduiTradeSharingTimeline.trailingEnd && this.trailingStart == sduiTradeSharingTimeline.trailingStart;
    }

    public int hashCode() {
        return (((((this.rows.hashCode() * 31) + this.sduiComponentType.hashCode()) * 31) + Boolean.hashCode(this.trailingEnd)) * 31) + Boolean.hashCode(this.trailingStart);
    }

    public String toString() {
        return "SduiTradeSharingTimeline(rows=" + this.rows + ", sduiComponentType=" + this.sduiComponentType + ", trailingEnd=" + this.trailingEnd + ", trailingStart=" + this.trailingStart + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTradeSharingTimeline$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTradeSharingTimeline;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTradeSharingTimeline> serializer() {
            return SduiTradeSharingTimeline$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTradeSharingTimeline(int i, List list, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("trailing_end") boolean z, @SerialName("trailing_start") boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiTradeSharingTimeline$$serializer.INSTANCE.getDescriptor());
        }
        this.rows = list;
        if ((i & 2) == 0) {
            this.sduiComponentType = SduiComponentType.TRADE_SHARING_TIMELINE;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 4) == 0) {
            this.trailingEnd = false;
        } else {
            this.trailingEnd = z;
        }
        if ((i & 8) == 0) {
            this.trailingStart = false;
        } else {
            this.trailingStart = z2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTradeSharingTimeline self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.rows);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.sduiComponentType != SduiComponentType.TRADE_SHARING_TIMELINE) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.trailingEnd) {
            output.encodeBooleanElement(serialDesc, 2, self.trailingEnd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.trailingStart) {
            output.encodeBooleanElement(serialDesc, 3, self.trailingStart);
        }
    }
}
