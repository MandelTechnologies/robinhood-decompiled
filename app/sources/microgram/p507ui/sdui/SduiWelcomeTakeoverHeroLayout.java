package microgram.p507ui.sdui;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010$\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010&R,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010+\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010-R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010(\u001a\u0004\b0\u00101R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00103\u0012\u0004\b6\u0010(\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiWelcomeTakeoverHeroLayout;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "bodyComponents", "footerComponents", "", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;", "titleBar", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/Map;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiWelcomeTakeoverHeroLayout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBodyComponents", "()Ljava/util/List;", "getBodyComponents$annotations", "()V", "getFooterComponents", "getFooterComponents$annotations", "Ljava/util/Map;", "getLoggingContext", "()Ljava/util/Map;", "getLoggingContext$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;", "getTitleBar", "()Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;", "getTitleBar$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiWelcomeTakeoverHeroLayout extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<SduiComponent> bodyComponents;
    private final List<SduiComponent> footerComponents;
    private final Map<String, String> loggingContext;
    private final SduiComponentType sduiComponentType;
    private final SduiReferralLandingTitleBar titleBar;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiWelcomeTakeoverHeroLayout)) {
            return false;
        }
        SduiWelcomeTakeoverHeroLayout sduiWelcomeTakeoverHeroLayout = (SduiWelcomeTakeoverHeroLayout) other;
        return Intrinsics.areEqual(this.bodyComponents, sduiWelcomeTakeoverHeroLayout.bodyComponents) && Intrinsics.areEqual(this.footerComponents, sduiWelcomeTakeoverHeroLayout.footerComponents) && Intrinsics.areEqual(this.loggingContext, sduiWelcomeTakeoverHeroLayout.loggingContext) && this.sduiComponentType == sduiWelcomeTakeoverHeroLayout.sduiComponentType && Intrinsics.areEqual(this.titleBar, sduiWelcomeTakeoverHeroLayout.titleBar);
    }

    public int hashCode() {
        return (((((((this.bodyComponents.hashCode() * 31) + this.footerComponents.hashCode()) * 31) + this.loggingContext.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.titleBar.hashCode();
    }

    public String toString() {
        return "SduiWelcomeTakeoverHeroLayout(bodyComponents=" + this.bodyComponents + ", footerComponents=" + this.footerComponents + ", loggingContext=" + this.loggingContext + ", sduiComponentType=" + this.sduiComponentType + ", titleBar=" + this.titleBar + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiWelcomeTakeoverHeroLayout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiWelcomeTakeoverHeroLayout;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiWelcomeTakeoverHeroLayout> serializer() {
            return SduiWelcomeTakeoverHeroLayout$$serializer.INSTANCE;
        }
    }

    static {
        SduiComponentSerializer sduiComponentSerializer = SduiComponentSerializer.INSTANCE;
        ArrayListSerializer arrayListSerializer = new ArrayListSerializer(sduiComponentSerializer);
        ArrayListSerializer arrayListSerializer2 = new ArrayListSerializer(sduiComponentSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{arrayListSerializer, arrayListSerializer2, new LinkedHashMapSerializer(stringSerializer, stringSerializer), SduiComponentType.INSTANCE.serializer(), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiWelcomeTakeoverHeroLayout(int i, @SerialName("body_components") List list, @SerialName("footer_components") List list2, @SerialName("logging_context") Map map, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("title_bar") SduiReferralLandingTitleBar sduiReferralLandingTitleBar, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (23 != (i & 23)) {
            PluginExceptions.throwMissingFieldException(i, 23, SduiWelcomeTakeoverHeroLayout$$serializer.INSTANCE.getDescriptor());
        }
        this.bodyComponents = list;
        this.footerComponents = list2;
        this.loggingContext = map;
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.titleBar = sduiReferralLandingTitleBar;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiWelcomeTakeoverHeroLayout self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.bodyComponents);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.footerComponents);
        output.encodeSerializableElement(serialDesc, 2, kSerializerArr[2], self.loggingContext);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.ONBOARDING_WELCOME_TAKEOVER_HERO_LAYOUT) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 4, SduiReferralLandingTitleBar$$serializer.INSTANCE, self.titleBar);
    }
}
