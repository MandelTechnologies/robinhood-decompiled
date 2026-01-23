package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB\u007f\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\"R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00108\u0012\u0004\b;\u0010.\u001a\u0004\b9\u0010:R\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u00102\u0012\u0004\b=\u0010.\u001a\u0004\b<\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010C¨\u0006F"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFeatureDiscovery;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "disclosureAction", "", "features", "", "height", "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "showMoreCutoff", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", ResourceTypes.STYLE, "Lmicrogram/ui/sdui/SduiMarkdownText;", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Ljava/lang/Long;Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;Lmicrogram/ui/sdui/SduiMarkdownText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiFeatureDiscovery;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getDisclosureAction", "()Lmicrogram/ui/sdui/SduiAction;", "getDisclosureAction$annotations", "()V", "Ljava/util/List;", "getFeatures", "()Ljava/util/List;", "Ljava/lang/Long;", "getHeight", "()Ljava/lang/Long;", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "getShowMoreCutoff", "getShowMoreCutoff$annotations", "Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", "getStyle", "()Lmicrogram/ui/sdui/SduiFeatureDiscoveryContainerStyle;", "Lmicrogram/ui/sdui/SduiMarkdownText;", "getTitle", "()Lmicrogram/ui/sdui/SduiMarkdownText;", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiFeatureDiscovery extends SduiComponent {
    private final SduiAction disclosureAction;
    private final List<SduiComponent> features;
    private final Long height;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final Long showMoreCutoff;
    private final SduiFeatureDiscoveryContainerStyle style;
    private final SduiMarkdownText title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SduiComponentSerializer.INSTANCE), null, null, SduiComponentType.INSTANCE.serializer(), null, SduiFeatureDiscoveryContainerStyle.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiFeatureDiscovery)) {
            return false;
        }
        SduiFeatureDiscovery sduiFeatureDiscovery = (SduiFeatureDiscovery) other;
        return Intrinsics.areEqual(this.disclosureAction, sduiFeatureDiscovery.disclosureAction) && Intrinsics.areEqual(this.features, sduiFeatureDiscovery.features) && Intrinsics.areEqual(this.height, sduiFeatureDiscovery.height) && Intrinsics.areEqual(this.loggingIdentifier, sduiFeatureDiscovery.loggingIdentifier) && this.sduiComponentType == sduiFeatureDiscovery.sduiComponentType && Intrinsics.areEqual(this.showMoreCutoff, sduiFeatureDiscovery.showMoreCutoff) && this.style == sduiFeatureDiscovery.style && Intrinsics.areEqual(this.title, sduiFeatureDiscovery.title);
    }

    public int hashCode() {
        SduiAction sduiAction = this.disclosureAction;
        int iHashCode = (((sduiAction == null ? 0 : sduiAction.hashCode()) * 31) + this.features.hashCode()) * 31;
        Long l = this.height;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.loggingIdentifier;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        Long l2 = this.showMoreCutoff;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle = this.style;
        return ((iHashCode4 + (sduiFeatureDiscoveryContainerStyle != null ? sduiFeatureDiscoveryContainerStyle.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiFeatureDiscovery(disclosureAction=" + this.disclosureAction + ", features=" + this.features + ", height=" + this.height + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", showMoreCutoff=" + this.showMoreCutoff + ", style=" + this.style + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiFeatureDiscovery$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiFeatureDiscovery;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiFeatureDiscovery> serializer() {
            return SduiFeatureDiscovery$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiFeatureDiscovery(int i, @SerialName("disclosure_action") SduiAction sduiAction, List list, Long l, @SerialName("logging_identifier") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("show_more_cutoff") Long l2, SduiFeatureDiscoveryContainerStyle sduiFeatureDiscoveryContainerStyle, SduiMarkdownText sduiMarkdownText, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (130 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, SduiFeatureDiscovery$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.disclosureAction = null;
        } else {
            this.disclosureAction = sduiAction;
        }
        this.features = list;
        if ((i & 4) == 0) {
            this.height = null;
        } else {
            this.height = l;
        }
        if ((i & 8) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.FEATURE_DISCOVERY;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 32) == 0) {
            this.showMoreCutoff = null;
        } else {
            this.showMoreCutoff = l2;
        }
        if ((i & 64) == 0) {
            this.style = SduiFeatureDiscoveryContainerStyle.CAROUSEL;
        } else {
            this.style = sduiFeatureDiscoveryContainerStyle;
        }
        this.title = sduiMarkdownText;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiFeatureDiscovery self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.disclosureAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.disclosureAction);
        }
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.features);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.height != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sduiComponentType != SduiComponentType.FEATURE_DISCOVERY) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.showMoreCutoff != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.showMoreCutoff);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.style != SduiFeatureDiscoveryContainerStyle.CAROUSEL) {
            output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.style);
        }
        output.encodeSerializableElement(serialDesc, 7, SduiMarkdownText$$serializer.INSTANCE, self.title);
    }
}
