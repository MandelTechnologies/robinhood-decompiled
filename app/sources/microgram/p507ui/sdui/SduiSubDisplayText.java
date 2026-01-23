package microgram.p507ui.sdui;

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
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B;\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018¨\u0006+"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSubDisplayText;", "", "", "seen1", "Lmicrogram/ui/sdui/SduiDisplayText;", "description", "Lmicrogram/ui/sdui/SduiIconDisplayText;", "main", "", "stringFormat", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILmicrogram/ui/sdui/SduiDisplayText;Lmicrogram/ui/sdui/SduiIconDisplayText;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiSubDisplayText;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiDisplayText;", "getDescription", "()Lmicrogram/ui/sdui/SduiDisplayText;", "Lmicrogram/ui/sdui/SduiIconDisplayText;", "getMain", "()Lmicrogram/ui/sdui/SduiIconDisplayText;", "Ljava/lang/String;", "getStringFormat", "getStringFormat$annotations", "()V", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiSubDisplayText {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiDisplayText description;
    private final SduiIconDisplayText main;
    private final String stringFormat;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiSubDisplayText)) {
            return false;
        }
        SduiSubDisplayText sduiSubDisplayText = (SduiSubDisplayText) other;
        return Intrinsics.areEqual(this.description, sduiSubDisplayText.description) && Intrinsics.areEqual(this.main, sduiSubDisplayText.main) && Intrinsics.areEqual(this.stringFormat, sduiSubDisplayText.stringFormat);
    }

    public int hashCode() {
        SduiDisplayText sduiDisplayText = this.description;
        int iHashCode = (((sduiDisplayText == null ? 0 : sduiDisplayText.hashCode()) * 31) + this.main.hashCode()) * 31;
        String str = this.stringFormat;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SduiSubDisplayText(description=" + this.description + ", main=" + this.main + ", stringFormat=" + this.stringFormat + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSubDisplayText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSubDisplayText;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiSubDisplayText> serializer() {
            return SduiSubDisplayText$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiSubDisplayText(int i, SduiDisplayText sduiDisplayText, SduiIconDisplayText sduiIconDisplayText, @SerialName("string_format") String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptions.throwMissingFieldException(i, 2, SduiSubDisplayText$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.description = null;
        } else {
            this.description = sduiDisplayText;
        }
        this.main = sduiIconDisplayText;
        if ((i & 4) == 0) {
            this.stringFormat = null;
        } else {
            this.stringFormat = str;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiSubDisplayText self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiDisplayText$$serializer.INSTANCE, self.description);
        }
        output.encodeSerializableElement(serialDesc, 1, SduiIconDisplayText$$serializer.INSTANCE, self.main);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.stringFormat == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.stringFormat);
    }
}
