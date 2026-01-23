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
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BM\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextWithAction;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "", "text", "Lmicrogram/ui/sdui/SduiThemedColor;", "textColorOverride", "Lmicrogram/ui/sdui/SduiWebPopover;", "webPopover", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiWebPopover;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTextWithAction;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Ljava/lang/String;", "getText", "Lmicrogram/ui/sdui/SduiThemedColor;", "getTextColorOverride", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getTextColorOverride$annotations", "()V", "Lmicrogram/ui/sdui/SduiWebPopover;", "getWebPopover", "()Lmicrogram/ui/sdui/SduiWebPopover;", "getWebPopover$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTextWithAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiAction action;
    private final String text;
    private final SduiThemedColor textColorOverride;
    private final SduiWebPopover webPopover;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTextWithAction)) {
            return false;
        }
        SduiTextWithAction sduiTextWithAction = (SduiTextWithAction) other;
        return Intrinsics.areEqual(this.action, sduiTextWithAction.action) && Intrinsics.areEqual(this.text, sduiTextWithAction.text) && Intrinsics.areEqual(this.textColorOverride, sduiTextWithAction.textColorOverride) && Intrinsics.areEqual(this.webPopover, sduiTextWithAction.webPopover);
    }

    public int hashCode() {
        int iHashCode = ((this.action.hashCode() * 31) + this.text.hashCode()) * 31;
        SduiThemedColor sduiThemedColor = this.textColorOverride;
        int iHashCode2 = (iHashCode + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiWebPopover sduiWebPopover = this.webPopover;
        return iHashCode2 + (sduiWebPopover != null ? sduiWebPopover.hashCode() : 0);
    }

    public String toString() {
        return "SduiTextWithAction(action=" + this.action + ", text=" + this.text + ", textColorOverride=" + this.textColorOverride + ", webPopover=" + this.webPopover + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextWithAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextWithAction;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTextWithAction> serializer() {
            return SduiTextWithAction$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTextWithAction(int i, SduiAction sduiAction, String str, @SerialName("text_color_override") SduiThemedColor sduiThemedColor, @SerialName("web_popover") SduiWebPopover sduiWebPopover, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiTextWithAction$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        this.text = str;
        if ((i & 4) == 0) {
            this.textColorOverride = null;
        } else {
            this.textColorOverride = sduiThemedColor;
        }
        if ((i & 8) == 0) {
            this.webPopover = null;
        } else {
            this.webPopover = sduiWebPopover;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTextWithAction self, Encoding3 output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        output.encodeStringElement(serialDesc, 1, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.textColorOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.textColorOverride);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.webPopover == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SduiWebPopover$$serializer.INSTANCE, self.webPopover);
    }
}
