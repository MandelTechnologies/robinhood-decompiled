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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconBubbleContent;", "Lmicrogram/ui/sdui/SduiBubbleContentType;", "Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "contentType", "Lmicrogram/ui/sdui/SduiIcon;", "icon", "<init>", "(Lmicrogram/ui/sdui/SduiBubbleContentStyle;Lmicrogram/ui/sdui/SduiIcon;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiBubbleContentStyle;Lmicrogram/ui/sdui/SduiIcon;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiIconBubbleContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "getContentType", "()Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "getContentType$annotations", "()V", "Lmicrogram/ui/sdui/SduiIcon;", "getIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiIconBubbleContent extends SduiBubbleContentType {
    private final SduiBubbleContentStyle contentType;
    private final SduiIcon icon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiBubbleContentStyle.INSTANCE.serializer(), SduiIcon.INSTANCE.serializer()};

    /* JADX WARN: Multi-variable type inference failed */
    public SduiIconBubbleContent() {
        this((SduiBubbleContentStyle) null, (SduiIcon) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiIconBubbleContent)) {
            return false;
        }
        SduiIconBubbleContent sduiIconBubbleContent = (SduiIconBubbleContent) other;
        return this.contentType == sduiIconBubbleContent.contentType && this.icon == sduiIconBubbleContent.icon;
    }

    public int hashCode() {
        return (this.contentType.hashCode() * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "SduiIconBubbleContent(contentType=" + this.contentType + ", icon=" + this.icon + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiIconBubbleContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiIconBubbleContent;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiIconBubbleContent> serializer() {
            return SduiIconBubbleContent$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiIconBubbleContent(int i, @SerialName("content_type") SduiBubbleContentStyle sduiBubbleContentStyle, SduiIcon sduiIcon, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.contentType = (i & 1) == 0 ? SduiBubbleContentStyle.ICON : sduiBubbleContentStyle;
        if ((i & 2) == 0) {
            this.icon = SduiIcon.LOCK_24;
        } else {
            this.icon = sduiIcon;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiIconBubbleContent self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.contentType != SduiBubbleContentStyle.ICON) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.contentType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.icon == SduiIcon.LOCK_24) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.icon);
    }

    public /* synthetic */ SduiIconBubbleContent(SduiBubbleContentStyle sduiBubbleContentStyle, SduiIcon sduiIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SduiBubbleContentStyle.ICON : sduiBubbleContentStyle, (i & 2) != 0 ? SduiIcon.LOCK_24 : sduiIcon);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiIconBubbleContent(SduiBubbleContentStyle contentType, SduiIcon icon) {
        super(null);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.contentType = contentType;
        this.icon = icon;
    }
}
