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
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243BU\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b,\u0010%\u001a\u0004\b*\u0010+R \u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001aR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010/\u0012\u0004\b2\u0010%\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginRequirementPollableCell;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "accountNumber", "Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;", "column", "initialValue", "rowIdentifier", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;Lmicrogram/ui/sdui/SduiComponent;Ljava/lang/String;Lmicrogram/ui/sdui/SduiComponentType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiMarginRequirementPollableCell;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountNumber", "getAccountNumber$annotations", "()V", "Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;", "getColumn", "()Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;", "Lmicrogram/ui/sdui/SduiComponent;", "getInitialValue", "()Lmicrogram/ui/sdui/SduiComponent;", "getInitialValue$annotations", "getRowIdentifier", "getRowIdentifier$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiMarginRequirementPollableCell extends SduiComponent {
    private final String accountNumber;
    private final SduiMarginRequirementPollableColumnIdentifier column;
    private final SduiComponent initialValue;
    private final String rowIdentifier;
    private final SduiComponentType sduiComponentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    private static final KSerializer<Object>[] $childSerializers = {null, SduiMarginRequirementPollableColumnIdentifier.INSTANCE.serializer(), null, null, SduiComponentType.INSTANCE.serializer()};

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiMarginRequirementPollableCell)) {
            return false;
        }
        SduiMarginRequirementPollableCell sduiMarginRequirementPollableCell = (SduiMarginRequirementPollableCell) other;
        return Intrinsics.areEqual(this.accountNumber, sduiMarginRequirementPollableCell.accountNumber) && this.column == sduiMarginRequirementPollableCell.column && Intrinsics.areEqual(this.initialValue, sduiMarginRequirementPollableCell.initialValue) && Intrinsics.areEqual(this.rowIdentifier, sduiMarginRequirementPollableCell.rowIdentifier) && this.sduiComponentType == sduiMarginRequirementPollableCell.sduiComponentType;
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.column.hashCode()) * 31;
        SduiComponent sduiComponent = this.initialValue;
        return ((((iHashCode + (sduiComponent == null ? 0 : sduiComponent.hashCode())) * 31) + this.rowIdentifier.hashCode()) * 31) + this.sduiComponentType.hashCode();
    }

    public String toString() {
        return "SduiMarginRequirementPollableCell(accountNumber=" + this.accountNumber + ", column=" + this.column + ", initialValue=" + this.initialValue + ", rowIdentifier=" + this.rowIdentifier + ", sduiComponentType=" + this.sduiComponentType + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginRequirementPollableCell$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginRequirementPollableCell;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiMarginRequirementPollableCell> serializer() {
            return SduiMarginRequirementPollableCell$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiMarginRequirementPollableCell(int i, @SerialName("account_number") String str, SduiMarginRequirementPollableColumnIdentifier sduiMarginRequirementPollableColumnIdentifier, @SerialName("initial_value") SduiComponent sduiComponent, @SerialName("row_identifier") String str2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (11 != (i & 11)) {
            PluginExceptions.throwMissingFieldException(i, 11, SduiMarginRequirementPollableCell$$serializer.INSTANCE.getDescriptor());
        }
        this.accountNumber = str;
        this.column = sduiMarginRequirementPollableColumnIdentifier;
        if ((i & 4) == 0) {
            this.initialValue = null;
        } else {
            this.initialValue = sduiComponent;
        }
        this.rowIdentifier = str2;
        if ((i & 16) == 0) {
            this.sduiComponentType = SduiComponentType.MARGIN_REQUIREMENT_POLLABLE_CELL;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiMarginRequirementPollableCell self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.accountNumber);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.column);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initialValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, SduiComponentSerializer.INSTANCE, self.initialValue);
        }
        output.encodeStringElement(serialDesc, 3, self.rowIdentifier);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.sduiComponentType == SduiComponentType.MARGIN_REQUIREMENT_POLLABLE_CELL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.sduiComponentType);
    }
}
