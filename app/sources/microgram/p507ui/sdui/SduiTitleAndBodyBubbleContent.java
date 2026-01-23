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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB;\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTitleAndBodyBubbleContent;", "Lmicrogram/ui/sdui/SduiBubbleContentType;", "Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "contentType", "", "subtitle", "title", "<init>", "(Lmicrogram/ui/sdui/SduiBubbleContentStyle;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiBubbleContentStyle;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTitleAndBodyBubbleContent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "getContentType", "()Lmicrogram/ui/sdui/SduiBubbleContentStyle;", "getContentType$annotations", "()V", "Ljava/lang/String;", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTitleAndBodyBubbleContent extends SduiBubbleContentType {
    private final SduiBubbleContentStyle contentType;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiBubbleContentStyle.INSTANCE.serializer(), null, null};

    public SduiTitleAndBodyBubbleContent() {
        this((SduiBubbleContentStyle) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTitleAndBodyBubbleContent)) {
            return false;
        }
        SduiTitleAndBodyBubbleContent sduiTitleAndBodyBubbleContent = (SduiTitleAndBodyBubbleContent) other;
        return this.contentType == sduiTitleAndBodyBubbleContent.contentType && Intrinsics.areEqual(this.subtitle, sduiTitleAndBodyBubbleContent.subtitle) && Intrinsics.areEqual(this.title, sduiTitleAndBodyBubbleContent.title);
    }

    public int hashCode() {
        int iHashCode = this.contentType.hashCode() * 31;
        String str = this.subtitle;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiTitleAndBodyBubbleContent(contentType=" + this.contentType + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTitleAndBodyBubbleContent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTitleAndBodyBubbleContent;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTitleAndBodyBubbleContent> serializer() {
            return SduiTitleAndBodyBubbleContent$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTitleAndBodyBubbleContent(int i, @SerialName("content_type") SduiBubbleContentStyle sduiBubbleContentStyle, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.contentType = (i & 1) == 0 ? SduiBubbleContentStyle.TITLE_AND_SUBTITLE : sduiBubbleContentStyle;
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTitleAndBodyBubbleContent self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.contentType != SduiBubbleContentStyle.TITLE_AND_SUBTITLE) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.contentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && Intrinsics.areEqual(self.title, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.title);
    }

    public /* synthetic */ SduiTitleAndBodyBubbleContent(SduiBubbleContentStyle sduiBubbleContentStyle, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SduiBubbleContentStyle.TITLE_AND_SUBTITLE : sduiBubbleContentStyle, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SduiTitleAndBodyBubbleContent(SduiBubbleContentStyle contentType, String str, String title) {
        super(null);
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(title, "title");
        this.contentType = contentType;
        this.subtitle = str;
        this.title = title;
    }
}
