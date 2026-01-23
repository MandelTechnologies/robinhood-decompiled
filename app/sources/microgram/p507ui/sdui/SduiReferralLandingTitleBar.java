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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0017¨\u0006'"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;", "", "Lmicrogram/ui/sdui/SduiActionTextButton;", "actionTextButton", "", "title", "<init>", "(Lmicrogram/ui/sdui/SduiActionTextButton;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/ui/sdui/SduiActionTextButton;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/ui/sdui/SduiActionTextButton;", "getActionTextButton", "()Lmicrogram/ui/sdui/SduiActionTextButton;", "getActionTextButton$annotations", "()V", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiReferralLandingTitleBar {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SduiActionTextButton actionTextButton;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SduiReferralLandingTitleBar() {
        this((SduiActionTextButton) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiReferralLandingTitleBar)) {
            return false;
        }
        SduiReferralLandingTitleBar sduiReferralLandingTitleBar = (SduiReferralLandingTitleBar) other;
        return Intrinsics.areEqual(this.actionTextButton, sduiReferralLandingTitleBar.actionTextButton) && Intrinsics.areEqual(this.title, sduiReferralLandingTitleBar.title);
    }

    public int hashCode() {
        SduiActionTextButton sduiActionTextButton = this.actionTextButton;
        int iHashCode = (sduiActionTextButton == null ? 0 : sduiActionTextButton.hashCode()) * 31;
        String str = this.title;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SduiReferralLandingTitleBar(actionTextButton=" + this.actionTextButton + ", title=" + this.title + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiReferralLandingTitleBar$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiReferralLandingTitleBar;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiReferralLandingTitleBar> serializer() {
            return SduiReferralLandingTitleBar$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ SduiReferralLandingTitleBar(int i, @SerialName("action_text_button") SduiActionTextButton sduiActionTextButton, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.actionTextButton = null;
        } else {
            this.actionTextButton = sduiActionTextButton;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
    }

    public SduiReferralLandingTitleBar(SduiActionTextButton sduiActionTextButton, String str) {
        this.actionTextButton = sduiActionTextButton;
        this.title = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiReferralLandingTitleBar self, Encoding3 output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.actionTextButton != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, SduiActionTextButton$$serializer.INSTANCE, self.actionTextButton);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.title == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
    }

    public /* synthetic */ SduiReferralLandingTitleBar(SduiActionTextButton sduiActionTextButton, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sduiActionTextButton, (i & 2) != 0 ? null : str);
    }
}
