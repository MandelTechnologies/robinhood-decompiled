package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
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
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BY\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R \u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010&\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010(¨\u00064"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeBubble;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "borderColor", "Lmicrogram/ui/sdui/SduiBubbleContentType;", "content", "contentColor", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiBubbleContentType;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDayTradeBubble;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "()V", "getBorderColor", "getBorderColor$annotations", "Lmicrogram/ui/sdui/SduiBubbleContentType;", "getContent", "()Lmicrogram/ui/sdui/SduiBubbleContentType;", "getContentColor", "getContentColor$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDayTradeBubble {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiAction action;
    private final SduiThemedColor backgroundColor;
    private final SduiThemedColor borderColor;
    private final SduiBubbleContentType content;
    private final SduiThemedColor contentColor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDayTradeBubble)) {
            return false;
        }
        SduiDayTradeBubble sduiDayTradeBubble = (SduiDayTradeBubble) other;
        return Intrinsics.areEqual(this.action, sduiDayTradeBubble.action) && Intrinsics.areEqual(this.backgroundColor, sduiDayTradeBubble.backgroundColor) && Intrinsics.areEqual(this.borderColor, sduiDayTradeBubble.borderColor) && Intrinsics.areEqual(this.content, sduiDayTradeBubble.content) && Intrinsics.areEqual(this.contentColor, sduiDayTradeBubble.contentColor);
    }

    public int hashCode() {
        SduiAction sduiAction = this.action;
        int iHashCode = (((((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + this.backgroundColor.hashCode()) * 31) + this.borderColor.hashCode()) * 31;
        SduiBubbleContentType sduiBubbleContentType = this.content;
        return ((iHashCode + (sduiBubbleContentType != null ? sduiBubbleContentType.hashCode() : 0)) * 31) + this.contentColor.hashCode();
    }

    public String toString() {
        return "SduiDayTradeBubble(action=" + this.action + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", content=" + this.content + ", contentColor=" + this.contentColor + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDayTradeBubble$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDayTradeBubble;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDayTradeBubble> serializer() {
            return SduiDayTradeBubble$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiDayTradeBubble(int i, SduiAction sduiAction, @SerialName("background_color") SduiThemedColor sduiThemedColor, @SerialName("border_color") SduiThemedColor sduiThemedColor2, SduiBubbleContentType sduiBubbleContentType, @SerialName("content_color") SduiThemedColor sduiThemedColor3, SerializationConstructorMarker serializationConstructorMarker) {
        if (22 != (i & 22)) {
            PluginExceptions.throwMissingFieldException(i, 22, SduiDayTradeBubble$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = sduiAction;
        }
        this.backgroundColor = sduiThemedColor;
        this.borderColor = sduiThemedColor2;
        if ((i & 8) == 0) {
            this.content = null;
        } else {
            this.content = sduiBubbleContentType;
        }
        this.contentColor = sduiThemedColor3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDayTradeBubble self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        }
        SduiThemedColor$$serializer sduiThemedColor$$serializer = SduiThemedColor$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, sduiThemedColor$$serializer, self.backgroundColor);
        output.encodeSerializableElement(serialDesc, 2, sduiThemedColor$$serializer, self.borderColor);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiBubbleContentTypeSerializer.INSTANCE, self.content);
        }
        output.encodeSerializableElement(serialDesc, 4, sduiThemedColor$$serializer, self.contentColor);
    }
}
