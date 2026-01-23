package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.sdui.SduiSizingPreference;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSizing;", "", "Lmicrogram/ui/sdui/SduiSizingPreference;", "horizontal", "vertical", "<init>", "(Lmicrogram/ui/sdui/SduiSizingPreference;Lmicrogram/ui/sdui/SduiSizingPreference;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiSizingPreference;Lmicrogram/ui/sdui/SduiSizingPreference;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSizing;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiSizingPreference;", "getHorizontal", "()Lmicrogram/ui/sdui/SduiSizingPreference;", "getVertical", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSizing {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiSizingPreference horizontal;
    private final SduiSizingPreference vertical;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiSizing() {
        this((SduiSizingPreference) null, (SduiSizingPreference) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSizing)) {
            return false;
        }
        SduiSizing sduiSizing = (SduiSizing) other;
        return this.horizontal == sduiSizing.horizontal && this.vertical == sduiSizing.vertical;
    }

    public int hashCode() {
        SduiSizingPreference sduiSizingPreference = this.horizontal;
        int iHashCode = (sduiSizingPreference == null ? 0 : sduiSizingPreference.hashCode()) * 31;
        SduiSizingPreference sduiSizingPreference2 = this.vertical;
        return iHashCode + (sduiSizingPreference2 != null ? sduiSizingPreference2.hashCode() : 0);
    }

    public String toString() {
        return "SduiSizing(horizontal=" + this.horizontal + ", vertical=" + this.vertical + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSizing$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSizing;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSizing> serializer() {
            return SduiSizing$$serializer.INSTANCE;
        }
    }

    static {
        SduiSizingPreference.Companion companion = SduiSizingPreference.INSTANCE;
        $childSerializers = new KSerializer[]{companion.serializer(), companion.serializer()};
    }

    @Deprecated
    public /* synthetic */ SduiSizing(int i, SduiSizingPreference sduiSizingPreference, SduiSizingPreference sduiSizingPreference2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.horizontal = null;
        } else {
            this.horizontal = sduiSizingPreference;
        }
        if ((i & 2) == 0) {
            this.vertical = null;
        } else {
            this.vertical = sduiSizingPreference2;
        }
    }

    public SduiSizing(SduiSizingPreference sduiSizingPreference, SduiSizingPreference sduiSizingPreference2) {
        this.horizontal = sduiSizingPreference;
        this.vertical = sduiSizingPreference2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSizing self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.horizontal != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kSerializerArr[0], self.horizontal);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.vertical == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, kSerializerArr[1], self.vertical);
    }

    public /* synthetic */ SduiSizing(SduiSizingPreference sduiSizingPreference, SduiSizingPreference sduiSizingPreference2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiSizingPreference, (i & 2) != 0 ? null : sduiSizingPreference2);
    }
}
