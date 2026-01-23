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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimeline;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "colorOverrides", "", "maxLines", "", "Lmicrogram/ui/sdui/SduiTimelineRow;", "rows", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTimelineWebOrientation;", "webOrientation", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiTimelineColorOverride;Ljava/lang/Long;Ljava/util/List;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTimelineWebOrientation;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTimeline;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "getColorOverrides", "()Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "getColorOverrides$annotations", "()V", "Ljava/lang/Long;", "getMaxLines", "()Ljava/lang/Long;", "getMaxLines$annotations", "Ljava/util/List;", "getRows", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTimelineWebOrientation;", "getWebOrientation", "()Lmicrogram/ui/sdui/SduiTimelineWebOrientation;", "getWebOrientation$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTimeline extends SduiComponent {
    private final SduiTimelineColorOverride colorOverrides;
    private final Long maxLines;
    private final List<SduiTimelineRow> rows;
    private final SduiComponentType sduiComponentType;
    private final SduiTimelineWebOrientation webOrientation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(SduiTimelineRow$$serializer.INSTANCE), SduiComponentType.INSTANCE.serializer(), SduiTimelineWebOrientation.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTimeline)) {
            return false;
        }
        SduiTimeline sduiTimeline = (SduiTimeline) other;
        return Intrinsics.areEqual(this.colorOverrides, sduiTimeline.colorOverrides) && Intrinsics.areEqual(this.maxLines, sduiTimeline.maxLines) && Intrinsics.areEqual(this.rows, sduiTimeline.rows) && this.sduiComponentType == sduiTimeline.sduiComponentType && this.webOrientation == sduiTimeline.webOrientation;
    }

    public int hashCode() {
        SduiTimelineColorOverride sduiTimelineColorOverride = this.colorOverrides;
        int iHashCode = (sduiTimelineColorOverride == null ? 0 : sduiTimelineColorOverride.hashCode()) * 31;
        Long l = this.maxLines;
        return ((((((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.rows.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.webOrientation.hashCode();
    }

    public String toString() {
        return "SduiTimeline(colorOverrides=" + this.colorOverrides + ", maxLines=" + this.maxLines + ", rows=" + this.rows + ", sduiComponentType=" + this.sduiComponentType + ", webOrientation=" + this.webOrientation + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimeline$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTimeline;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTimeline> serializer() {
            return SduiTimeline$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTimeline(int i, @SerialName("color_overrides") SduiTimelineColorOverride sduiTimelineColorOverride, @SerialName("max_lines") Long l, List list, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("web_orientation") SduiTimelineWebOrientation sduiTimelineWebOrientation, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (4 != (i & 4)) {
            PluginExceptions.throwMissingFieldException(i, 4, SduiTimeline$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.colorOverrides = null;
        } else {
            this.colorOverrides = sduiTimelineColorOverride;
        }
        if ((i & 2) == 0) {
            this.maxLines = null;
        } else {
            this.maxLines = l;
        }
        this.rows = list;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.TIMELINE;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.webOrientation = SduiTimelineWebOrientation.VERTICAL;
        } else {
            this.webOrientation = sduiTimelineWebOrientation;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTimeline self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.colorOverrides != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiTimelineColorOverride$$serializer.INSTANCE, self.colorOverrides);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.maxLines != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, LongSerializer.INSTANCE, self.maxLines);
        }
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.rows);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.TIMELINE) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.webOrientation == SduiTimelineWebOrientation.VERTICAL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.webOrientation);
    }
}
