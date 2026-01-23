package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b&\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b'\u0010#¨\u0006*"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "", "Lmicrogram/ui/sdui/SduiThemedColor;", "complete", "error", "incomplete", "ongoing", "warning", "<init>", "(Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiThemedColor;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTimelineColorOverride;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiThemedColor;", "getComplete", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getError", "getIncomplete", "getOngoing", "getWarning", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTimelineColorOverride {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiThemedColor complete;
    private final SduiThemedColor error;
    private final SduiThemedColor incomplete;
    private final SduiThemedColor ongoing;
    private final SduiThemedColor warning;

    public SduiTimelineColorOverride() {
        this((SduiThemedColor) null, (SduiThemedColor) null, (SduiThemedColor) null, (SduiThemedColor) null, (SduiThemedColor) null, 31, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTimelineColorOverride)) {
            return false;
        }
        SduiTimelineColorOverride sduiTimelineColorOverride = (SduiTimelineColorOverride) other;
        return Intrinsics.areEqual(this.complete, sduiTimelineColorOverride.complete) && Intrinsics.areEqual(this.error, sduiTimelineColorOverride.error) && Intrinsics.areEqual(this.incomplete, sduiTimelineColorOverride.incomplete) && Intrinsics.areEqual(this.ongoing, sduiTimelineColorOverride.ongoing) && Intrinsics.areEqual(this.warning, sduiTimelineColorOverride.warning);
    }

    public int hashCode() {
        SduiThemedColor sduiThemedColor = this.complete;
        int iHashCode = (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode()) * 31;
        SduiThemedColor sduiThemedColor2 = this.error;
        int iHashCode2 = (iHashCode + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31;
        SduiThemedColor sduiThemedColor3 = this.incomplete;
        int iHashCode3 = (iHashCode2 + (sduiThemedColor3 == null ? 0 : sduiThemedColor3.hashCode())) * 31;
        SduiThemedColor sduiThemedColor4 = this.ongoing;
        int iHashCode4 = (iHashCode3 + (sduiThemedColor4 == null ? 0 : sduiThemedColor4.hashCode())) * 31;
        SduiThemedColor sduiThemedColor5 = this.warning;
        return iHashCode4 + (sduiThemedColor5 != null ? sduiThemedColor5.hashCode() : 0);
    }

    public String toString() {
        return "SduiTimelineColorOverride(complete=" + this.complete + ", error=" + this.error + ", incomplete=" + this.incomplete + ", ongoing=" + this.ongoing + ", warning=" + this.warning + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTimelineColorOverride$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTimelineColorOverride;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTimelineColorOverride> serializer() {
            return SduiTimelineColorOverride$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiTimelineColorOverride(int i, SduiThemedColor sduiThemedColor, SduiThemedColor sduiThemedColor2, SduiThemedColor sduiThemedColor3, SduiThemedColor sduiThemedColor4, SduiThemedColor sduiThemedColor5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.complete = null;
        } else {
            this.complete = sduiThemedColor;
        }
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = sduiThemedColor2;
        }
        if ((i & 4) == 0) {
            this.incomplete = null;
        } else {
            this.incomplete = sduiThemedColor3;
        }
        if ((i & 8) == 0) {
            this.ongoing = null;
        } else {
            this.ongoing = sduiThemedColor4;
        }
        if ((i & 16) == 0) {
            this.warning = null;
        } else {
            this.warning = sduiThemedColor5;
        }
    }

    public SduiTimelineColorOverride(SduiThemedColor sduiThemedColor, SduiThemedColor sduiThemedColor2, SduiThemedColor sduiThemedColor3, SduiThemedColor sduiThemedColor4, SduiThemedColor sduiThemedColor5) {
        this.complete = sduiThemedColor;
        this.error = sduiThemedColor2;
        this.incomplete = sduiThemedColor3;
        this.ongoing = sduiThemedColor4;
        this.warning = sduiThemedColor5;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTimelineColorOverride self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.complete != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiThemedColor$$serializer.INSTANCE, self.complete);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.error != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiThemedColor$$serializer.INSTANCE, self.error);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.incomplete != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiThemedColor$$serializer.INSTANCE, self.incomplete);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ongoing != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.ongoing);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.warning == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, SduiThemedColor$$serializer.INSTANCE, self.warning);
    }

    public /* synthetic */ SduiTimelineColorOverride(SduiThemedColor sduiThemedColor, SduiThemedColor sduiThemedColor2, SduiThemedColor sduiThemedColor3, SduiThemedColor sduiThemedColor4, SduiThemedColor sduiThemedColor5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiThemedColor, (i & 2) != 0 ? null : sduiThemedColor2, (i & 4) != 0 ? null : sduiThemedColor3, (i & 8) != 0 ? null : sduiThemedColor4, (i & 16) != 0 ? null : sduiThemedColor5);
    }
}
