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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B=\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(¨\u0006,"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdown;", "Lmicrogram/ui/sdui/SduiRenderableText;", "", "seen1", "", "text", "Lmicrogram/ui/sdui/SduiRenderableTextType;", "textType", "", "validateThatMdElementsAreSupported", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiRenderableTextType;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarkdown;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Lmicrogram/ui/sdui/SduiRenderableTextType;", "getTextType", "()Lmicrogram/ui/sdui/SduiRenderableTextType;", "getTextType$annotations", "()V", "Ljava/lang/Boolean;", "getValidateThatMdElementsAreSupported", "()Ljava/lang/Boolean;", "getValidateThatMdElementsAreSupported$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarkdown extends SduiRenderableText {
    private final String text;
    private final SduiRenderableTextType textType;
    private final Boolean validateThatMdElementsAreSupported;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiRenderableTextType.INSTANCE.serializer(), null};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarkdown)) {
            return false;
        }
        SduiMarkdown sduiMarkdown = (SduiMarkdown) other;
        return Intrinsics.areEqual(this.text, sduiMarkdown.text) && this.textType == sduiMarkdown.textType && Intrinsics.areEqual(this.validateThatMdElementsAreSupported, sduiMarkdown.validateThatMdElementsAreSupported);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + this.textType.hashCode()) * 31;
        Boolean bool = this.validateThatMdElementsAreSupported;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "SduiMarkdown(text=" + this.text + ", textType=" + this.textType + ", validateThatMdElementsAreSupported=" + this.validateThatMdElementsAreSupported + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarkdown$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarkdown;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarkdown> serializer() {
            return SduiMarkdown$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarkdown(int i, String str, @SerialName("text_type") SduiRenderableTextType sduiRenderableTextType, @SerialName("validate_that_md_elements_are_supported") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, SduiMarkdown$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i & 2) == 0) {
            this.textType = SduiRenderableTextType.MARKDOWN;
        } else {
            this.textType = sduiRenderableTextType;
        }
        if ((i & 4) == 0) {
            this.validateThatMdElementsAreSupported = null;
        } else {
            this.validateThatMdElementsAreSupported = bool;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarkdown self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.textType != SduiRenderableTextType.MARKDOWN) {
            output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.textType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.validateThatMdElementsAreSupported == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.validateThatMdElementsAreSupported);
    }
}
