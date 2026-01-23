package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRichTextAttribute;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiThemedColor;", "highlightColor", "", "length", "", "link", "location", "Lmicrogram/ui/sdui/SduiRichTextStyle;", ResourceTypes.STYLE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiThemedColor;JLjava/lang/String;JLmicrogram/ui/sdui/SduiRichTextStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRichTextAttribute;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getHighlightColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getHighlightColor$annotations", "()V", "J", "getLength", "()J", "Ljava/lang/String;", "getLink", "getLocation", "Lmicrogram/ui/sdui/SduiRichTextStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiRichTextStyle;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRichTextAttribute {
    private final SduiThemedColor highlightColor;
    private final long length;
    private final String link;
    private final long location;
    private final SduiRichTextStyle style;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, SduiRichTextStyle.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRichTextAttribute)) {
            return false;
        }
        SduiRichTextAttribute sduiRichTextAttribute = (SduiRichTextAttribute) other;
        return Intrinsics.areEqual(this.highlightColor, sduiRichTextAttribute.highlightColor) && this.length == sduiRichTextAttribute.length && Intrinsics.areEqual(this.link, sduiRichTextAttribute.link) && this.location == sduiRichTextAttribute.location && this.style == sduiRichTextAttribute.style;
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.highlightColor;
        int iHashCode = (((sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31) + Long.hashCode(this.length)) * 31;
        String str = this.link;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.location)) * 31) + this.style.hashCode();
    }

    public String toString() {
        return "SduiRichTextAttribute(highlightColor=" + this.highlightColor + ", length=" + this.length + ", link=" + this.link + ", location=" + this.location + ", style=" + this.style + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRichTextAttribute$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRichTextAttribute;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRichTextAttribute> serializer() {
            return SduiRichTextAttribute$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiRichTextAttribute(int i, @SerialName("highlight_color") SduiThemedColor sduiThemedColor, long j, String str, long j2, SduiRichTextStyle sduiRichTextStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (26 != (i & 26)) {
            PluginExceptions.throwMissingFieldException(i, 26, SduiRichTextAttribute$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.highlightColor = null;
        } else {
            this.highlightColor = sduiThemedColor;
        }
        this.length = j;
        if ((i & 4) == 0) {
            this.link = null;
        } else {
            this.link = str;
        }
        this.location = j2;
        this.style = sduiRichTextStyle;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRichTextAttribute self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.highlightColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.highlightColor);
        }
        output.encodeLongElement(serialDesc, 1, self.length);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.link != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.link);
        }
        output.encodeLongElement(serialDesc, 3, self.location);
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.style);
    }
}
