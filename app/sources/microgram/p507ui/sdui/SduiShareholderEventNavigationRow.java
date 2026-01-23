package microgram.p507ui.sdui;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
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
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<Bo\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÁ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001fR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00102\u0012\u0004\b5\u0010.\u001a\u0004\b3\u00104R \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\b9\u0010.\u001a\u0004\b7\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b;\u0010\u001f¨\u0006>"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiShareholderEventNavigationRow;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "action", "Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "", "loggingIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiCalendarThumbnail;", "startComponent", "subtitle", "title", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiCalendarThumbnail;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiShareholderEventNavigationRow;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiAction;", "getAction", "()Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;", "getLoggingContext", "()Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;", "getLoggingContext$annotations", "()V", "Ljava/lang/String;", "getLoggingIdentifier", "getLoggingIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiCalendarThumbnail;", "getStartComponent", "()Lmicrogram/ui/sdui/SduiCalendarThumbnail;", "getStartComponent$annotations", "getSubtitle", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiShareholderEventNavigationRow extends SduiComponent {
    private final SduiAction action;
    private final SduiShareholderEventLoggingContext loggingContext;
    private final String loggingIdentifier;
    private final SduiComponentType sduiComponentType;
    private final SduiCalendarThumbnail startComponent;
    private final String subtitle;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, SduiComponentType.INSTANCE.serializer(), null, null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiShareholderEventNavigationRow)) {
            return false;
        }
        SduiShareholderEventNavigationRow sduiShareholderEventNavigationRow = (SduiShareholderEventNavigationRow) other;
        return Intrinsics.areEqual(this.action, sduiShareholderEventNavigationRow.action) && Intrinsics.areEqual(this.loggingContext, sduiShareholderEventNavigationRow.loggingContext) && Intrinsics.areEqual(this.loggingIdentifier, sduiShareholderEventNavigationRow.loggingIdentifier) && this.sduiComponentType == sduiShareholderEventNavigationRow.sduiComponentType && Intrinsics.areEqual(this.startComponent, sduiShareholderEventNavigationRow.startComponent) && Intrinsics.areEqual(this.subtitle, sduiShareholderEventNavigationRow.subtitle) && Intrinsics.areEqual(this.title, sduiShareholderEventNavigationRow.title);
    }

    public int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        SduiShareholderEventLoggingContext sduiShareholderEventLoggingContext = this.loggingContext;
        int iHashCode2 = (iHashCode + (sduiShareholderEventLoggingContext == null ? 0 : sduiShareholderEventLoggingContext.hashCode())) * 31;
        String str = this.loggingIdentifier;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31) + this.startComponent.hashCode()) * 31;
        String str2 = this.subtitle;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "SduiShareholderEventNavigationRow(action=" + this.action + ", loggingContext=" + this.loggingContext + ", loggingIdentifier=" + this.loggingIdentifier + ", sduiComponentType=" + this.sduiComponentType + ", startComponent=" + this.startComponent + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiShareholderEventNavigationRow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiShareholderEventNavigationRow;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiShareholderEventNavigationRow> serializer() {
            return SduiShareholderEventNavigationRow$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiShareholderEventNavigationRow(int i, SduiAction sduiAction, @SerialName("logging_context") SduiShareholderEventLoggingContext sduiShareholderEventLoggingContext, @SerialName("logging_identifier") String str, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("start_component") SduiCalendarThumbnail sduiCalendarThumbnail, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (81 != (i & 81)) {
            PluginExceptions.throwMissingFieldException(i, 81, SduiShareholderEventNavigationRow$$serializer.INSTANCE.getDescriptor());
        }
        this.action = sduiAction;
        if ((i & 2) == 0) {
            this.loggingContext = null;
        } else {
            this.loggingContext = sduiShareholderEventLoggingContext;
        }
        if ((i & 4) == 0) {
            this.loggingIdentifier = null;
        } else {
            this.loggingIdentifier = str;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.SHAREHOLDER_EVENT_NAVIGATION_ROW;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        this.startComponent = sduiCalendarThumbnail;
        if ((i & 32) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        this.title = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiShareholderEventNavigationRow self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SduiAction2.INSTANCE, self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.loggingContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiShareholderEventLoggingContext$$serializer.INSTANCE, self.loggingContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.loggingIdentifier != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.loggingIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.SHAREHOLDER_EVENT_NAVIGATION_ROW) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        output.encodeSerializableElement(serialDesc, 4, SduiCalendarThumbnail$$serializer.INSTANCE, self.startComponent);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.subtitle);
        }
        output.encodeStringElement(serialDesc, 6, self.title);
    }
}
