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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B/\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006#"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiInvestFlowImageSource;", "dark", "light", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiInvestFlowImageSource;Lmicrogram/ui/sdui/SduiInvestFlowImageSource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiInvestFlowImageSource;", "getDark", "()Lmicrogram/ui/sdui/SduiInvestFlowImageSource;", "getLight", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiInvestFlowThemedImageSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiInvestFlowImageSource dark;
    private final SduiInvestFlowImageSource light;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiInvestFlowThemedImageSource)) {
            return false;
        }
        SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource = (SduiInvestFlowThemedImageSource) other;
        return Intrinsics.areEqual(this.dark, sduiInvestFlowThemedImageSource.dark) && Intrinsics.areEqual(this.light, sduiInvestFlowThemedImageSource.light);
    }

    public int hashCode() {
        return (this.dark.hashCode() * 31) + this.light.hashCode();
    }

    public String toString() {
        return "SduiInvestFlowThemedImageSource(dark=" + this.dark + ", light=" + this.light + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowThemedImageSource;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiInvestFlowThemedImageSource> serializer() {
            return SduiInvestFlowThemedImageSource$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiInvestFlowThemedImageSource(int i, SduiInvestFlowImageSource sduiInvestFlowImageSource, SduiInvestFlowImageSource sduiInvestFlowImageSource2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptions.throwMissingFieldException(i, 3, SduiInvestFlowThemedImageSource$$serializer.INSTANCE.getDescriptor());
        }
        this.dark = sduiInvestFlowImageSource;
        this.light = sduiInvestFlowImageSource2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiInvestFlowThemedImageSource self, Encoding3 output, SerialDescriptor serialDesc) {
        SduiInvestFlowImageSource$$serializer sduiInvestFlowImageSource$$serializer = SduiInvestFlowImageSource$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, sduiInvestFlowImageSource$$serializer, self.dark);
        output.encodeSerializableElement(serialDesc, 1, sduiInvestFlowImageSource$$serializer, self.light);
    }
}
