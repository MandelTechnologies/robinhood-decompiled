package microgram.p507ui.sdui;

import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bu\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00100\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010-\u0012\u0004\b4\u0010*\u001a\u0004\b3\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b8\u00107R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;¨\u0006?"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecurringInsightsVisualizationData;", "", "", "seen1", "", "accurateSize", "bucketSize", "Lmicrogram/ui/sdui/SduiThemedColor;", ResourceTypes.COLOR, "", "imageURL", "strokeColor", "Lmicrogram/ui/sdui/SduiMarkdownText;", "subtitle", "title", "Lmicrogram/ui/sdui/SduiIconWithAction;", "titleIcon", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiMarkdownText;Lmicrogram/ui/sdui/SduiIconWithAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiRecurringInsightsVisualizationData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAccurateSize", "()Ljava/lang/Double;", "getAccurateSize$annotations", "()V", "getBucketSize", "getBucketSize$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "Ljava/lang/String;", "getImageURL", "getImageURL$annotations", "getStrokeColor", "getStrokeColor$annotations", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getSubtitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "Lmicrogram/ui/sdui/SduiIconWithAction;", "getTitleIcon", "()Lmicrogram/ui/sdui/SduiIconWithAction;", "getTitleIcon$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiRecurringInsightsVisualizationData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double accurateSize;
    private final Double bucketSize;
    private final SduiThemedColor color;
    private final String imageURL;
    private final SduiThemedColor strokeColor;
    private final SduiMarkdownText subtitle;
    private final SduiMarkdownText title;
    private final SduiIconWithAction titleIcon;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiRecurringInsightsVisualizationData)) {
            return false;
        }
        SduiRecurringInsightsVisualizationData sduiRecurringInsightsVisualizationData = (SduiRecurringInsightsVisualizationData) other;
        return Intrinsics.areEqual((Object) this.accurateSize, (Object) sduiRecurringInsightsVisualizationData.accurateSize) && Intrinsics.areEqual((Object) this.bucketSize, (Object) sduiRecurringInsightsVisualizationData.bucketSize) && Intrinsics.areEqual(this.color, sduiRecurringInsightsVisualizationData.color) && Intrinsics.areEqual(this.imageURL, sduiRecurringInsightsVisualizationData.imageURL) && Intrinsics.areEqual(this.strokeColor, sduiRecurringInsightsVisualizationData.strokeColor) && Intrinsics.areEqual(this.subtitle, sduiRecurringInsightsVisualizationData.subtitle) && Intrinsics.areEqual(this.title, sduiRecurringInsightsVisualizationData.title) && Intrinsics.areEqual(this.titleIcon, sduiRecurringInsightsVisualizationData.titleIcon);
    }

    public int hashCode() {
        Double d = this.accurateSize;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.bucketSize;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        SduiThemedColor sduiThemedColor = this.color;
        int iHashCode3 = (iHashCode2 + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        String str = this.imageURL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.strokeColor;
        int iHashCode5 = (((((iHashCode4 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode()) * 31;
        SduiIconWithAction sduiIconWithAction = this.titleIcon;
        return iHashCode5 + (sduiIconWithAction != null ? sduiIconWithAction.hashCode() : 0);
    }

    public String toString() {
        return "SduiRecurringInsightsVisualizationData(accurateSize=" + this.accurateSize + ", bucketSize=" + this.bucketSize + ", color=" + this.color + ", imageURL=" + this.imageURL + ", strokeColor=" + this.strokeColor + ", subtitle=" + this.subtitle + ", title=" + this.title + ", titleIcon=" + this.titleIcon + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiRecurringInsightsVisualizationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiRecurringInsightsVisualizationData;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiRecurringInsightsVisualizationData> serializer() {
            return SduiRecurringInsightsVisualizationData$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiRecurringInsightsVisualizationData(int i, @SerialName("accurate_size") Double d, @SerialName("bucket_size") Double d2, SduiThemedColor sduiThemedColor, @SerialName("image_url") String str, @SerialName("stroke_color") SduiThemedColor sduiThemedColor2, SduiMarkdownText sduiMarkdownText, SduiMarkdownText sduiMarkdownText2, @SerialName("title_icon") SduiIconWithAction sduiIconWithAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (96 != (i & 96)) {
            PluginExceptions.throwMissingFieldException(i, 96, SduiRecurringInsightsVisualizationData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accurateSize = null;
        } else {
            this.accurateSize = d;
        }
        if ((i & 2) == 0) {
            this.bucketSize = null;
        } else {
            this.bucketSize = d2;
        }
        if ((i & 4) == 0) {
            this.color = null;
        } else {
            this.color = sduiThemedColor;
        }
        if ((i & 8) == 0) {
            this.imageURL = null;
        } else {
            this.imageURL = str;
        }
        if ((i & 16) == 0) {
            this.strokeColor = null;
        } else {
            this.strokeColor = sduiThemedColor2;
        }
        this.subtitle = sduiMarkdownText;
        this.title = sduiMarkdownText2;
        if ((i & 128) == 0) {
            this.titleIcon = null;
        } else {
            this.titleIcon = sduiIconWithAction;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiRecurringInsightsVisualizationData self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accurateSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.accurateSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.bucketSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.bucketSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.color != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.color);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageURL != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.imageURL);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.strokeColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiThemedColor$$serializer.INSTANCE, self.strokeColor);
        }
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, sduiMarkdownText$$serializer, self.subtitle);
        output.encodeSerializableElement(serialDesc, 6, sduiMarkdownText$$serializer, self.title);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.titleIcon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, SduiIconWithAction$$serializer.INSTANCE, self.titleIcon);
    }
}
