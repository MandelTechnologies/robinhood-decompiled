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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010\u0017¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiShareholderEventSection;", "eventSection", "", "eventSlug", "instrumentID", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiShareholderEventSection;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiShareholderEventSection;", "getEventSection", "()Lmicrogram/ui/sdui/SduiShareholderEventSection;", "getEventSection$annotations", "()V", "Ljava/lang/String;", "getEventSlug", "getEventSlug$annotations", "getInstrumentID", "getInstrumentID$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiShareholderEventLoggingContext {
    private final SduiShareholderEventSection eventSection;
    private final String eventSlug;
    private final String instrumentID;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {SduiShareholderEventSection.INSTANCE.serializer(), null, null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiShareholderEventLoggingContext)) {
            return false;
        }
        SduiShareholderEventLoggingContext sduiShareholderEventLoggingContext = (SduiShareholderEventLoggingContext) other;
        return this.eventSection == sduiShareholderEventLoggingContext.eventSection && Intrinsics.areEqual(this.eventSlug, sduiShareholderEventLoggingContext.eventSlug) && Intrinsics.areEqual(this.instrumentID, sduiShareholderEventLoggingContext.instrumentID);
    }

    public int hashCode() {
        SduiShareholderEventSection sduiShareholderEventSection = this.eventSection;
        return ((((sduiShareholderEventSection == null ? 0 : sduiShareholderEventSection.hashCode()) * 31) + this.eventSlug.hashCode()) * 31) + this.instrumentID.hashCode();
    }

    public String toString() {
        return "SduiShareholderEventLoggingContext(eventSection=" + this.eventSection + ", eventSlug=" + this.eventSlug + ", instrumentID=" + this.instrumentID + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiShareholderEventLoggingContext;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiShareholderEventLoggingContext> serializer() {
            return SduiShareholderEventLoggingContext$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiShareholderEventLoggingContext(int i, @SerialName("event_section") SduiShareholderEventSection sduiShareholderEventSection, @SerialName("event_slug") String str, @SerialName("instrument_id") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptions.throwMissingFieldException(i, 6, SduiShareholderEventLoggingContext$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.eventSection = null;
        } else {
            this.eventSection = sduiShareholderEventSection;
        }
        this.eventSlug = str;
        this.instrumentID = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiShareholderEventLoggingContext self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.eventSection != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.eventSection);
        }
        output.encodeStringElement(serialDesc, 1, self.eventSlug);
        output.encodeStringElement(serialDesc, 2, self.instrumentID);
    }
}
