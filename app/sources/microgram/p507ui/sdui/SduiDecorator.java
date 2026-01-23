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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bD\b\u0087\b\u0018\u0000 }2\u00020\u0001:\u0002~}Bÿ\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0001\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J(\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/HÁ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010D\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010I\u0012\u0004\bL\u0010H\u001a\u0004\bJ\u0010KR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bQ\u0010RR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010S\u0012\u0004\bV\u0010H\u001a\u0004\bT\u0010UR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010W\u0012\u0004\bZ\u0010H\u001a\u0004\bX\u0010YR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010[\u0012\u0004\b^\u0010H\u001a\u0004\b\\\u0010]R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010_\u0012\u0004\bb\u0010H\u001a\u0004\b`\u0010aR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0017\u0010c\u001a\u0004\bd\u0010eR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bg\u00106R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010jR(\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010k\u0012\u0004\bn\u0010H\u001a\u0004\bl\u0010mR(\u0010\u001f\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010k\u0012\u0004\bp\u0010H\u001a\u0004\bo\u0010mR \u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010q\u0012\u0004\bt\u0010H\u001a\u0004\br\u0010sR\u0019\u0010#\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010u\u001a\u0004\bv\u0010wR\u0019\u0010$\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b$\u0010c\u001a\u0004\bx\u0010eR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010y\u001a\u0004\bz\u0010{R\u0019\u0010'\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b'\u0010c\u001a\u0004\b|\u0010e¨\u0006\u007f"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDecorator;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAccessibilityModifier;", "accessibility", "", "alpha", "Lmicrogram/ui/sdui/SduiAnalyticsEventDescriptor;", "analyticsEventDescriptor", "Lmicrogram/ui/sdui/SduiThemedColor;", "backgroundColor", "Lmicrogram/ui/sdui/SduiBorder;", "border", "content", "", "cornerRadius", "Lmicrogram/ui/sdui/SduiEducationTourElement;", "educationTourElement", "Lkotlinx/serialization/json/JsonObject;", "goldShimmer", "Lmicrogram/ui/sdui/SduiGutterBehavior;", "gutterBehavior", "height", "", "identifier", "Lmicrogram/ui/sdui/SduiInsets;", "insets", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "onTapAction", "onWillAppear", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiSizing;", "sizing", "tag", "Lmicrogram/ui/sdui/SduiTooltip;", "tooltip", "width", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAccessibilityModifier;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiAnalyticsEventDescriptor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiBorder;Lmicrogram/ui/sdui/SduiComponent;JLmicrogram/ui/sdui/SduiEducationTourElement;Lkotlinx/serialization/json/JsonObject;Lmicrogram/ui/sdui/SduiGutterBehavior;Ljava/lang/Long;Ljava/lang/String;Lmicrogram/ui/sdui/SduiInsets;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiSizing;Ljava/lang/Long;Lmicrogram/ui/sdui/SduiTooltip;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiDecorator;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAccessibilityModifier;", "getAccessibility", "()Lmicrogram/ui/sdui/SduiAccessibilityModifier;", "Ljava/lang/Double;", "getAlpha", "()Ljava/lang/Double;", "Lmicrogram/ui/sdui/SduiAnalyticsEventDescriptor;", "getAnalyticsEventDescriptor", "()Lmicrogram/ui/sdui/SduiAnalyticsEventDescriptor;", "getAnalyticsEventDescriptor$annotations", "()V", "Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getBackgroundColor$annotations", "Lmicrogram/ui/sdui/SduiBorder;", "getBorder", "()Lmicrogram/ui/sdui/SduiBorder;", "Lmicrogram/ui/sdui/SduiComponent;", "getContent", "()Lmicrogram/ui/sdui/SduiComponent;", "J", "getCornerRadius", "()J", "getCornerRadius$annotations", "Lmicrogram/ui/sdui/SduiEducationTourElement;", "getEducationTourElement", "()Lmicrogram/ui/sdui/SduiEducationTourElement;", "getEducationTourElement$annotations", "Lkotlinx/serialization/json/JsonObject;", "getGoldShimmer", "()Lkotlinx/serialization/json/JsonObject;", "getGoldShimmer$annotations", "Lmicrogram/ui/sdui/SduiGutterBehavior;", "getGutterBehavior", "()Lmicrogram/ui/sdui/SduiGutterBehavior;", "getGutterBehavior$annotations", "Ljava/lang/Long;", "getHeight", "()Ljava/lang/Long;", "Ljava/lang/String;", "getIdentifier", "Lmicrogram/ui/sdui/SduiInsets;", "getInsets", "()Lmicrogram/ui/sdui/SduiInsets;", "Lmicrogram/ui/sdui/SduiAction;", "getOnTapAction", "()Lmicrogram/ui/sdui/SduiAction;", "getOnTapAction$annotations", "getOnWillAppear", "getOnWillAppear$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiSizing;", "getSizing", "()Lmicrogram/ui/sdui/SduiSizing;", "getTag", "Lmicrogram/ui/sdui/SduiTooltip;", "getTooltip", "()Lmicrogram/ui/sdui/SduiTooltip;", "getWidth", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiDecorator extends SduiComponent {
    private final SduiAccessibilityModifier accessibility;
    private final Double alpha;
    private final SduiAnalyticsEventDescriptor analyticsEventDescriptor;
    private final SduiThemedColor backgroundColor;
    private final SduiBorder border;
    private final SduiComponent content;
    private final long cornerRadius;
    private final SduiEducationTourElement educationTourElement;
    private final JsonElement6 goldShimmer;
    private final SduiGutterBehavior gutterBehavior;
    private final Long height;
    private final String identifier;
    private final SduiInsets insets;
    private final SduiAction onTapAction;
    private final SduiAction onWillAppear;
    private final SduiComponentType sduiComponentType;
    private final SduiSizing sizing;
    private final Long tag;
    private final SduiTooltip tooltip;
    private final Long width;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiDecorator)) {
            return false;
        }
        SduiDecorator sduiDecorator = (SduiDecorator) other;
        return Intrinsics.areEqual(this.accessibility, sduiDecorator.accessibility) && Intrinsics.areEqual((Object) this.alpha, (Object) sduiDecorator.alpha) && Intrinsics.areEqual(this.analyticsEventDescriptor, sduiDecorator.analyticsEventDescriptor) && Intrinsics.areEqual(this.backgroundColor, sduiDecorator.backgroundColor) && Intrinsics.areEqual(this.border, sduiDecorator.border) && Intrinsics.areEqual(this.content, sduiDecorator.content) && this.cornerRadius == sduiDecorator.cornerRadius && Intrinsics.areEqual(this.educationTourElement, sduiDecorator.educationTourElement) && Intrinsics.areEqual(this.goldShimmer, sduiDecorator.goldShimmer) && Intrinsics.areEqual(this.gutterBehavior, sduiDecorator.gutterBehavior) && Intrinsics.areEqual(this.height, sduiDecorator.height) && Intrinsics.areEqual(this.identifier, sduiDecorator.identifier) && Intrinsics.areEqual(this.insets, sduiDecorator.insets) && Intrinsics.areEqual(this.onTapAction, sduiDecorator.onTapAction) && Intrinsics.areEqual(this.onWillAppear, sduiDecorator.onWillAppear) && this.sduiComponentType == sduiDecorator.sduiComponentType && Intrinsics.areEqual(this.sizing, sduiDecorator.sizing) && Intrinsics.areEqual(this.tag, sduiDecorator.tag) && Intrinsics.areEqual(this.tooltip, sduiDecorator.tooltip) && Intrinsics.areEqual(this.width, sduiDecorator.width);
    }

    public int hashCode() {
        SduiAccessibilityModifier sduiAccessibilityModifier = this.accessibility;
        int iHashCode = (sduiAccessibilityModifier == null ? 0 : sduiAccessibilityModifier.hashCode()) * 31;
        Double d = this.alpha;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        SduiAnalyticsEventDescriptor sduiAnalyticsEventDescriptor = this.analyticsEventDescriptor;
        int iHashCode3 = (iHashCode2 + (sduiAnalyticsEventDescriptor == null ? 0 : sduiAnalyticsEventDescriptor.hashCode())) * 31;
        SduiThemedColor sduiThemedColor = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiBorder sduiBorder = this.border;
        int iHashCode5 = (((((iHashCode4 + (sduiBorder == null ? 0 : sduiBorder.hashCode())) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.cornerRadius)) * 31;
        SduiEducationTourElement sduiEducationTourElement = this.educationTourElement;
        int iHashCode6 = (iHashCode5 + (sduiEducationTourElement == null ? 0 : sduiEducationTourElement.hashCode())) * 31;
        JsonElement6 jsonElement6 = this.goldShimmer;
        int iHashCode7 = (iHashCode6 + (jsonElement6 == null ? 0 : jsonElement6.hashCode())) * 31;
        SduiGutterBehavior sduiGutterBehavior = this.gutterBehavior;
        int iHashCode8 = (iHashCode7 + (sduiGutterBehavior == null ? 0 : sduiGutterBehavior.hashCode())) * 31;
        Long l = this.height;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.identifier;
        int iHashCode10 = (((iHashCode9 + (str == null ? 0 : str.hashCode())) * 31) + this.insets.hashCode()) * 31;
        SduiAction sduiAction = this.onTapAction;
        int iHashCode11 = (iHashCode10 + (sduiAction == null ? 0 : sduiAction.hashCode())) * 31;
        SduiAction sduiAction2 = this.onWillAppear;
        int iHashCode12 = (((iHashCode11 + (sduiAction2 == null ? 0 : sduiAction2.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiSizing sduiSizing = this.sizing;
        int iHashCode13 = (iHashCode12 + (sduiSizing == null ? 0 : sduiSizing.hashCode())) * 31;
        Long l2 = this.tag;
        int iHashCode14 = (iHashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        SduiTooltip sduiTooltip = this.tooltip;
        int iHashCode15 = (iHashCode14 + (sduiTooltip == null ? 0 : sduiTooltip.hashCode())) * 31;
        Long l3 = this.width;
        return iHashCode15 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "SduiDecorator(accessibility=" + this.accessibility + ", alpha=" + this.alpha + ", analyticsEventDescriptor=" + this.analyticsEventDescriptor + ", backgroundColor=" + this.backgroundColor + ", border=" + this.border + ", content=" + this.content + ", cornerRadius=" + this.cornerRadius + ", educationTourElement=" + this.educationTourElement + ", goldShimmer=" + this.goldShimmer + ", gutterBehavior=" + this.gutterBehavior + ", height=" + this.height + ", identifier=" + this.identifier + ", insets=" + this.insets + ", onTapAction=" + this.onTapAction + ", onWillAppear=" + this.onWillAppear + ", sduiComponentType=" + this.sduiComponentType + ", sizing=" + this.sizing + ", tag=" + this.tag + ", tooltip=" + this.tooltip + ", width=" + this.width + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiDecorator$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiDecorator;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiDecorator> serializer() {
            return SduiDecorator$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiDecorator(int i, SduiAccessibilityModifier sduiAccessibilityModifier, Double d, @SerialName("analytics_event_descriptor") SduiAnalyticsEventDescriptor sduiAnalyticsEventDescriptor, @SerialName("background_color") SduiThemedColor sduiThemedColor, SduiBorder sduiBorder, SduiComponent sduiComponent, @SerialName("corner_radius") long j, @SerialName("education_tour_element") SduiEducationTourElement sduiEducationTourElement, @SerialName("gold_shimmer") JsonElement6 jsonElement6, @SerialName("gutter_behavior") SduiGutterBehavior sduiGutterBehavior, Long l, String str, SduiInsets sduiInsets, @SerialName("on_tap_action") SduiAction sduiAction, @SerialName("on_will_appear") SduiAction sduiAction2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiSizing sduiSizing, Long l2, SduiTooltip sduiTooltip, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (32 != (i & 32)) {
            PluginExceptions.throwMissingFieldException(i, 32, SduiDecorator$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.accessibility = null;
        } else {
            this.accessibility = sduiAccessibilityModifier;
        }
        if ((i & 2) == 0) {
            this.alpha = null;
        } else {
            this.alpha = d;
        }
        if ((i & 4) == 0) {
            this.analyticsEventDescriptor = null;
        } else {
            this.analyticsEventDescriptor = sduiAnalyticsEventDescriptor;
        }
        if ((i & 8) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = sduiThemedColor;
        }
        if ((i & 16) == 0) {
            this.border = null;
        } else {
            this.border = sduiBorder;
        }
        this.content = sduiComponent;
        this.cornerRadius = (i & 64) == 0 ? 0L : j;
        if ((i & 128) == 0) {
            this.educationTourElement = null;
        } else {
            this.educationTourElement = sduiEducationTourElement;
        }
        if ((i & 256) == 0) {
            this.goldShimmer = null;
        } else {
            this.goldShimmer = jsonElement6;
        }
        if ((i & 512) == 0) {
            this.gutterBehavior = null;
        } else {
            this.gutterBehavior = sduiGutterBehavior;
        }
        if ((i & 1024) == 0) {
            this.height = null;
        } else {
            this.height = l;
        }
        if ((i & 2048) == 0) {
            this.identifier = null;
        } else {
            this.identifier = str;
        }
        this.insets = (i & 4096) == 0 ? new SduiInsets(new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L)) : sduiInsets;
        if ((i & 8192) == 0) {
            this.onTapAction = null;
        } else {
            this.onTapAction = sduiAction;
        }
        if ((i & 16384) == 0) {
            this.onWillAppear = null;
        } else {
            this.onWillAppear = sduiAction2;
        }
        this.sduiComponentType = (32768 & i) == 0 ? SduiComponentType.DECORATOR : sduiComponentType;
        if ((65536 & i) == 0) {
            this.sizing = null;
        } else {
            this.sizing = sduiSizing;
        }
        if ((131072 & i) == 0) {
            this.tag = null;
        } else {
            this.tag = l2;
        }
        if ((262144 & i) == 0) {
            this.tooltip = null;
        } else {
            this.tooltip = sduiTooltip;
        }
        if ((i & 524288) == 0) {
            this.width = null;
        } else {
            this.width = l3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiDecorator self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.accessibility != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiAccessibilityModifier$$serializer.INSTANCE, self.accessibility);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.alpha != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.alpha);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.analyticsEventDescriptor != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiAnalyticsEventDescriptor$$serializer.INSTANCE, self.analyticsEventDescriptor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.backgroundColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.border != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiBorder$$serializer.INSTANCE, self.border);
        }
        output.encodeSerializableElement(serialDesc, 5, SduiComponentSerializer.INSTANCE, self.content);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.cornerRadius != 0) {
            output.encodeLongElement(serialDesc, 6, self.cornerRadius);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.educationTourElement != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, SduiEducationTourElement$$serializer.INSTANCE, self.educationTourElement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.goldShimmer != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, JsonElementSerializers6.INSTANCE, self.goldShimmer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.gutterBehavior != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, SduiGutterBehavior$$serializer.INSTANCE, self.gutterBehavior);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.height != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, LongSerializer.INSTANCE, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.identifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.identifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !Intrinsics.areEqual(self.insets, new SduiInsets(new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L), new SduiWindowWidthDependentNumber(0L, 0L, 0L)))) {
            output.encodeSerializableElement(serialDesc, 12, SduiInsets$$serializer.INSTANCE, self.insets);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.onTapAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, SduiAction2.INSTANCE, self.onTapAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.onWillAppear != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, SduiAction2.INSTANCE, self.onWillAppear);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.sduiComponentType != SduiComponentType.DECORATOR) {
            output.encodeSerializableElement(serialDesc, 15, kSerializerArr[15], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.sizing != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, SduiSizing$$serializer.INSTANCE, self.sizing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.tag != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, LongSerializer.INSTANCE, self.tag);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 18) || self.tooltip != null) {
            output.encodeNullableSerializableElement(serialDesc, 18, SduiTooltip$$serializer.INSTANCE, self.tooltip);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 19) && self.width == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 19, LongSerializer.INSTANCE, self.width);
    }
}
