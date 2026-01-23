package microgram.p507ui.sdui;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeCell;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiCellBackgroundStyle;", "background", "", "Lmicrogram/ui/sdui/SduiComponent;", "content", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiCellBackgroundStyle;Ljava/util/List;Lmicrogram/ui/sdui/SduiComponent;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDayTradeCell;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiCellBackgroundStyle;", "getBackground", "()Lmicrogram/ui/sdui/SduiCellBackgroundStyle;", "Ljava/util/List;", "getContent", "()Ljava/util/List;", "Lmicrogram/ui/sdui/SduiComponent;", "getTitle", "()Lmicrogram/ui/sdui/SduiComponent;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDayTradeCell {
    private final SduiCellBackgroundStyle background;
    private final List<SduiComponent> content;
    private final SduiComponent title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SduiComponentSerializer.INSTANCE), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDayTradeCell)) {
            return false;
        }
        SduiDayTradeCell sduiDayTradeCell = (SduiDayTradeCell) other;
        return Intrinsics.areEqual(this.background, sduiDayTradeCell.background) && Intrinsics.areEqual(this.content, sduiDayTradeCell.content) && Intrinsics.areEqual(this.title, sduiDayTradeCell.title);
    }

    public int hashCode() {
        return (((this.background.hashCode() * 31) + this.content.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiDayTradeCell(background=" + this.background + ", content=" + this.content + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeCell$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDayTradeCell;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDayTradeCell> serializer() {
            return SduiDayTradeCell$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiDayTradeCell(int i, SduiCellBackgroundStyle sduiCellBackgroundStyle, List list, SduiComponent sduiComponent, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptions.throwMissingFieldException(i, 7, SduiDayTradeCell$$serializer.INSTANCE.getDescriptor());
        }
        this.background = sduiCellBackgroundStyle;
        this.content = list;
        this.title = sduiComponent;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDayTradeCell self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiCellBackgroundStyleSerializer.INSTANCE, self.background);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.content);
        output.encodeSerializableElement(serialDesc, 2, SduiComponentSerializer.INSTANCE, self.title);
    }
}
