package microgram.p507ui.sdui;

import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
import kotlinx.serialization.builtins.BuiltinSerializers;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInvestFlowCapsule.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowCapsule;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInvestFlowCapsule$$serializer implements PluginHelperInterfaces<SduiInvestFlowCapsule> {
    public static final SduiInvestFlowCapsule$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInvestFlowCapsule$$serializer sduiInvestFlowCapsule$$serializer = new SduiInvestFlowCapsule$$serializer();
        INSTANCE = sduiInvestFlowCapsule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInvestFlowCapsule", sduiInvestFlowCapsule$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("action", true);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement(AccountOverviewOptionsSettingCard4.CTA, true);
        pluginGeneratedSerialDescriptor.addElement("image", false);
        pluginGeneratedSerialDescriptor.addElement("logging_identifier", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("show_border", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInvestFlowCapsule$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiInvestFlowCapsule.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAction2.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(SduiTextButton$$serializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        KSerializer<?> kSerializer = kSerializerArr[5];
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(BooleanSerializer.INSTANCE);
        SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
        return new KSerializer[]{nullable, SduiThemedColor$$serializer.INSTANCE, nullable2, SduiInvestFlowThemedImageSource$$serializer.INSTANCE, nullable3, kSerializer, nullable4, BuiltinSerializers.getNullable(sduiMarkdownText$$serializer), sduiMarkdownText$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInvestFlowCapsule deserialize(Decoding2 decoder) {
        int i;
        Boolean bool;
        SduiMarkdownText sduiMarkdownText;
        SduiComponentType sduiComponentType;
        SduiMarkdownText sduiMarkdownText2;
        String str;
        SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource;
        SduiAction sduiAction;
        SduiThemedColor sduiThemedColor;
        SduiTextButton sduiTextButton;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInvestFlowCapsule.$childSerializers;
        int i2 = 7;
        SduiAction sduiAction2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction3 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, null);
            SduiTextButton sduiTextButton2 = (SduiTextButton) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiTextButton$$serializer.INSTANCE, null);
            SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource2 = (SduiInvestFlowThemedImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiInvestFlowThemedImageSource$$serializer.INSTANCE, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, null);
            SduiComponentType sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            Boolean bool2 = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, null);
            SduiMarkdownText$$serializer sduiMarkdownText$$serializer = SduiMarkdownText$$serializer.INSTANCE;
            sduiComponentType = sduiComponentType2;
            sduiAction = sduiAction3;
            sduiMarkdownText = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, sduiMarkdownText$$serializer, null);
            bool = bool2;
            sduiInvestFlowThemedImageSource = sduiInvestFlowThemedImageSource2;
            sduiMarkdownText2 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, sduiMarkdownText$$serializer, null);
            str = str2;
            sduiTextButton = sduiTextButton2;
            i = 511;
            sduiThemedColor = sduiThemedColor2;
        } else {
            int i3 = 5;
            boolean z = true;
            int i4 = 0;
            Boolean bool3 = null;
            SduiMarkdownText sduiMarkdownText3 = null;
            SduiComponentType sduiComponentType3 = null;
            SduiMarkdownText sduiMarkdownText4 = null;
            String str3 = null;
            SduiInvestFlowThemedImageSource sduiInvestFlowThemedImageSource3 = null;
            SduiThemedColor sduiThemedColor3 = null;
            SduiTextButton sduiTextButton3 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 5;
                    case 0:
                        sduiAction2 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction2);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 5;
                    case 1:
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 5;
                    case 2:
                        sduiTextButton3 = (SduiTextButton) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiTextButton$$serializer.INSTANCE, sduiTextButton3);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 5;
                    case 3:
                        sduiInvestFlowThemedImageSource3 = (SduiInvestFlowThemedImageSource) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, SduiInvestFlowThemedImageSource$$serializer.INSTANCE, sduiInvestFlowThemedImageSource3);
                        i4 |= 8;
                        i2 = 7;
                        i3 = 5;
                    case 4:
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str3);
                        i4 |= 16;
                        i2 = 7;
                        i3 = 5;
                    case 5:
                        sduiComponentType3 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, kSerializerArr[i3], sduiComponentType3);
                        i4 |= 32;
                        i2 = 7;
                    case 6:
                        bool3 = (Boolean) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, BooleanSerializer.INSTANCE, bool3);
                        i4 |= 64;
                        i2 = 7;
                    case 7:
                        sduiMarkdownText3 = (SduiMarkdownText) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, i2, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText3);
                        i4 |= 128;
                    case 8:
                        sduiMarkdownText4 = (SduiMarkdownText) decodingBeginStructure.decodeSerializableElement(descriptor2, 8, SduiMarkdownText$$serializer.INSTANCE, sduiMarkdownText4);
                        i4 |= 256;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            bool = bool3;
            sduiMarkdownText = sduiMarkdownText3;
            sduiComponentType = sduiComponentType3;
            sduiMarkdownText2 = sduiMarkdownText4;
            str = str3;
            sduiInvestFlowThemedImageSource = sduiInvestFlowThemedImageSource3;
            sduiAction = sduiAction2;
            sduiThemedColor = sduiThemedColor3;
            sduiTextButton = sduiTextButton3;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInvestFlowCapsule(i, sduiAction, sduiThemedColor, sduiTextButton, sduiInvestFlowThemedImageSource, str, sduiComponentType, bool, sduiMarkdownText, sduiMarkdownText2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInvestFlowCapsule value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInvestFlowCapsule.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
