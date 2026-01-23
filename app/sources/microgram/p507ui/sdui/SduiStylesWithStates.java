package microgram.p507ui.sdui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.Instrument;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B9\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006%"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStylesWithStates;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiStyle;", "active", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, Instrument.STATE_INACTIVE, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiStyle;Lmicrogram/ui/sdui/SduiStyle;Lmicrogram/ui/sdui/SduiStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiStylesWithStates;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiStyle;", "getActive", "()Lmicrogram/ui/sdui/SduiStyle;", "getDefault", "getInactive", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiStylesWithStates {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiStyle active;
    private final SduiStyle default;
    private final SduiStyle inactive;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiStylesWithStates)) {
            return false;
        }
        SduiStylesWithStates sduiStylesWithStates = (SduiStylesWithStates) other;
        return Intrinsics.areEqual(this.active, sduiStylesWithStates.active) && Intrinsics.areEqual(this.default, sduiStylesWithStates.default) && Intrinsics.areEqual(this.inactive, sduiStylesWithStates.inactive);
    }

    public int hashCode() {
        SduiStyle sduiStyle = this.active;
        int iHashCode = (((sduiStyle == null ? 0 : sduiStyle.hashCode()) * 31) + this.default.hashCode()) * 31;
        SduiStyle sduiStyle2 = this.inactive;
        return iHashCode + (sduiStyle2 != null ? sduiStyle2.hashCode() : 0);
    }

    public String toString() {
        return "SduiStylesWithStates(active=" + this.active + ", default=" + this.default + ", inactive=" + this.inactive + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiStylesWithStates$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiStylesWithStates;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiStylesWithStates> serializer() {
            return SduiStylesWithStates$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiStylesWithStates(int i, SduiStyle sduiStyle, SduiStyle sduiStyle2, SduiStyle sduiStyle3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiStylesWithStates$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.active = null;
        } else {
            this.active = sduiStyle;
        }
        this.default = sduiStyle2;
        if ((i & 4) == 0) {
            this.inactive = null;
        } else {
            this.inactive = sduiStyle3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiStylesWithStates self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.active != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiStyle$$serializer.INSTANCE, self.active);
        }
        SduiStyle$$serializer sduiStyle$$serializer = SduiStyle$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, sduiStyle$$serializer, self.default);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.inactive == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, sduiStyle$$serializer, self.inactive);
    }
}
