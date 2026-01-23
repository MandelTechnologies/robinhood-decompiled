package microgram.p507ui.sdui;

import com.plaid.internal.EnumC7081g;
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
import microgram.p507ui.sdui.SduiTextStyle;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\u008b\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÁ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010!R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00103\u0012\u0004\b6\u0010,\u001a\u0004\b4\u00105R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00107\u0012\u0004\b:\u0010,\u001a\u0004\b8\u00109R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b>\u0010!R \u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010/\u0012\u0004\b@\u0010,\u001a\u0004\b?\u00101R \u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u00103\u0012\u0004\bB\u0010,\u001a\u0004\bA\u00105¨\u0006E"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableInstrumentName;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "", "collapsedSymbolTextOverride", "identifier", "name", "Lmicrogram/ui/sdui/SduiThemedColor;", "nameColor", "Lmicrogram/ui/sdui/SduiTextStyle;", "nameTextStyle", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiTableInstrumentNameState;", "state", "symbol", "symbolColor", "symbolTextStyle", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiTableInstrumentNameState;Ljava/lang/String;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiTableInstrumentName;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollapsedSymbolTextOverride", "getCollapsedSymbolTextOverride$annotations", "()V", "getIdentifier", "getName", "Lmicrogram/ui/sdui/SduiThemedColor;", "getNameColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getNameColor$annotations", "Lmicrogram/ui/sdui/SduiTextStyle;", "getNameTextStyle", "()Lmicrogram/ui/sdui/SduiTextStyle;", "getNameTextStyle$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiTableInstrumentNameState;", "getState", "()Lmicrogram/ui/sdui/SduiTableInstrumentNameState;", "getSymbol", "getSymbolColor", "getSymbolColor$annotations", "getSymbolTextStyle", "getSymbolTextStyle$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiTableInstrumentName extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String collapsedSymbolTextOverride;
    private final String identifier;
    private final String name;
    private final SduiThemedColor nameColor;
    private final SduiTextStyle nameTextStyle;
    private final SduiComponentType sduiComponentType;
    private final SduiTableInstrumentNameState state;
    private final String symbol;
    private final SduiThemedColor symbolColor;
    private final SduiTextStyle symbolTextStyle;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiTableInstrumentName)) {
            return false;
        }
        SduiTableInstrumentName sduiTableInstrumentName = (SduiTableInstrumentName) other;
        return Intrinsics.areEqual(this.collapsedSymbolTextOverride, sduiTableInstrumentName.collapsedSymbolTextOverride) && Intrinsics.areEqual(this.identifier, sduiTableInstrumentName.identifier) && Intrinsics.areEqual(this.name, sduiTableInstrumentName.name) && Intrinsics.areEqual(this.nameColor, sduiTableInstrumentName.nameColor) && this.nameTextStyle == sduiTableInstrumentName.nameTextStyle && this.sduiComponentType == sduiTableInstrumentName.sduiComponentType && Intrinsics.areEqual(this.state, sduiTableInstrumentName.state) && Intrinsics.areEqual(this.symbol, sduiTableInstrumentName.symbol) && Intrinsics.areEqual(this.symbolColor, sduiTableInstrumentName.symbolColor) && this.symbolTextStyle == sduiTableInstrumentName.symbolTextStyle;
    }

    public int hashCode() {
        String str = this.collapsedSymbolTextOverride;
        return ((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.identifier.hashCode()) * 31) + this.name.hashCode()) * 31) + this.nameColor.hashCode()) * 31) + this.nameTextStyle.hashCode()) * 31) + this.sduiComponentType.hashCode()) * 31) + this.state.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.symbolColor.hashCode()) * 31) + this.symbolTextStyle.hashCode();
    }

    public String toString() {
        return "SduiTableInstrumentName(collapsedSymbolTextOverride=" + this.collapsedSymbolTextOverride + ", identifier=" + this.identifier + ", name=" + this.name + ", nameColor=" + this.nameColor + ", nameTextStyle=" + this.nameTextStyle + ", sduiComponentType=" + this.sduiComponentType + ", state=" + this.state + ", symbol=" + this.symbol + ", symbolColor=" + this.symbolColor + ", symbolTextStyle=" + this.symbolTextStyle + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTableInstrumentName$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTableInstrumentName;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiTableInstrumentName> serializer() {
            return SduiTableInstrumentName$$serializer.INSTANCE;
        }
    }

    static {
        SduiTextStyle.Companion companion = SduiTextStyle.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, companion.serializer(), SduiComponentType.INSTANCE.serializer(), null, null, null, companion.serializer()};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiTableInstrumentName(int i, @SerialName("collapsed_symbol_text_override") String str, String str2, String str3, @SerialName("name_color") SduiThemedColor sduiThemedColor, @SerialName("name_text_style") SduiTextStyle sduiTextStyle, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, SduiTableInstrumentNameState sduiTableInstrumentNameState, String str4, @SerialName("symbol_color") SduiThemedColor sduiThemedColor2, @SerialName("symbol_text_style") SduiTextStyle sduiTextStyle2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (132 != (i & EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE)) {
            PluginExceptions.throwMissingFieldException(i, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, SduiTableInstrumentName$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.collapsedSymbolTextOverride = null;
        } else {
            this.collapsedSymbolTextOverride = str;
        }
        if ((i & 2) == 0) {
            this.identifier = "TableInstrumentNameStateIdentifier";
        } else {
            this.identifier = str2;
        }
        this.name = str3;
        if ((i & 8) == 0) {
            SduiColor sduiColor = SduiColor.FG2;
            this.nameColor = new SduiThemedColor(sduiColor, sduiColor);
        } else {
            this.nameColor = sduiThemedColor;
        }
        if ((i & 16) == 0) {
            this.nameTextStyle = SduiTextStyle.TEXT_SMALL;
        } else {
            this.nameTextStyle = sduiTextStyle;
        }
        if ((i & 32) == 0) {
            this.sduiComponentType = SduiComponentType.TABLE_INSTRUMENT_NAME;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 64) == 0) {
            this.state = new SduiTableInstrumentNameState(0.0d, (SduiComponentStateType) null, 2, (DefaultConstructorMarker) null);
        } else {
            this.state = sduiTableInstrumentNameState;
        }
        this.symbol = str4;
        if ((i & 256) == 0) {
            SduiColor sduiColor2 = SduiColor.f7102FG;
            this.symbolColor = new SduiThemedColor(sduiColor2, sduiColor2);
        } else {
            this.symbolColor = sduiThemedColor2;
        }
        if ((i & 512) == 0) {
            this.symbolTextStyle = SduiTextStyle.TEXT_SMALL;
        } else {
            this.symbolTextStyle = sduiTextStyle2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$microgram_ui(SduiTableInstrumentName self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.collapsedSymbolTextOverride != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.collapsedSymbolTextOverride);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.identifier, "TableInstrumentNameStateIdentifier")) {
            output.encodeStringElement(serialDesc, 1, self.identifier);
        }
        output.encodeStringElement(serialDesc, 2, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeSerializableElement(serialDesc, 3, SduiThemedColor$$serializer.INSTANCE, self.nameColor);
        } else {
            SduiThemedColor sduiThemedColor = self.nameColor;
            SduiColor sduiColor = SduiColor.FG2;
            if (!Intrinsics.areEqual(sduiThemedColor, new SduiThemedColor(sduiColor, sduiColor))) {
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.nameTextStyle != SduiTextStyle.TEXT_SMALL) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.nameTextStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sduiComponentType != SduiComponentType.TABLE_INSTRUMENT_NAME) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.state, new SduiTableInstrumentNameState(0.0d, (SduiComponentStateType) null, 2, (DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 6, SduiTableInstrumentNameState$$serializer.INSTANCE, self.state);
        }
        output.encodeStringElement(serialDesc, 7, self.symbol);
        if (output.shouldEncodeElementDefault(serialDesc, 8)) {
            output.encodeSerializableElement(serialDesc, 8, SduiThemedColor$$serializer.INSTANCE, self.symbolColor);
        } else {
            SduiThemedColor sduiThemedColor2 = self.symbolColor;
            SduiColor sduiColor2 = SduiColor.f7102FG;
            if (!Intrinsics.areEqual(sduiThemedColor2, new SduiThemedColor(sduiColor2, sduiColor2))) {
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.symbolTextStyle == SduiTextStyle.TEXT_SMALL) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.symbolTextStyle);
    }
}
