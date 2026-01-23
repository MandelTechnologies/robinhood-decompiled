package microgram.p507ui.sdui;

import com.robinhood.android.equity.history.p121ui.adrfee.AdrFeeDetailComposable4;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationExceptions3;
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
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiInvestFlowSingleInstrument.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiInvestFlowSingleInstrument;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiInvestFlowSingleInstrument$$serializer implements PluginHelperInterfaces<SduiInvestFlowSingleInstrument> {
    public static final SduiInvestFlowSingleInstrument$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiInvestFlowSingleInstrument$$serializer sduiInvestFlowSingleInstrument$$serializer = new SduiInvestFlowSingleInstrument$$serializer();
        INSTANCE = sduiInvestFlowSingleInstrument$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiInvestFlowSingleInstrument", sduiInvestFlowSingleInstrument$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("action", false);
        pluginGeneratedSerialDescriptor.addElement("added_to_list", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("instrument_label", false);
        pluginGeneratedSerialDescriptor.addElement(AdrFeeDetailComposable4.INSTRUMENT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("instrument_percent_change", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiInvestFlowSingleInstrument$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = SduiInvestFlowSingleInstrument.$childSerializers[6];
        SduiInstrumentText$$serializer sduiInstrumentText$$serializer = SduiInstrumentText$$serializer.INSTANCE;
        return new KSerializer[]{SduiAction2.INSTANCE, BooleanSerializer.INSTANCE, StringSerializer.INSTANCE, sduiInstrumentText$$serializer, sduiInstrumentText$$serializer, sduiInstrumentText$$serializer, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiInvestFlowSingleInstrument deserialize(Decoding2 decoder) {
        int i;
        SduiComponentType sduiComponentType;
        SduiInstrumentText sduiInstrumentText;
        boolean z;
        SduiAction sduiAction;
        String str;
        SduiInstrumentText sduiInstrumentText2;
        SduiInstrumentText sduiInstrumentText3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiInvestFlowSingleInstrument.$childSerializers;
        int i2 = 5;
        int i3 = 3;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAction sduiAction2 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, null);
            boolean zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            String strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            SduiInstrumentText$$serializer sduiInstrumentText$$serializer = SduiInstrumentText$$serializer.INSTANCE;
            SduiInstrumentText sduiInstrumentText4 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, sduiInstrumentText$$serializer, null);
            SduiInstrumentText sduiInstrumentText5 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, sduiInstrumentText$$serializer, null);
            SduiInstrumentText sduiInstrumentText6 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, sduiInstrumentText$$serializer, null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            sduiAction = sduiAction2;
            sduiInstrumentText = sduiInstrumentText6;
            sduiInstrumentText2 = sduiInstrumentText4;
            sduiInstrumentText3 = sduiInstrumentText5;
            str = strDecodeStringElement;
            i = 127;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int i4 = 0;
            SduiComponentType sduiComponentType2 = null;
            SduiAction sduiAction3 = null;
            String strDecodeStringElement2 = null;
            SduiInstrumentText sduiInstrumentText7 = null;
            SduiInstrumentText sduiInstrumentText8 = null;
            boolean zDecodeBooleanElement2 = false;
            SduiInstrumentText sduiInstrumentText9 = null;
            while (z2) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 3;
                    case 0:
                        sduiAction3 = (SduiAction) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, SduiAction2.INSTANCE, sduiAction3);
                        i4 |= 1;
                        i2 = 5;
                        i3 = 3;
                    case 1:
                        i4 |= 2;
                        zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                    case 2:
                        strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i4 |= 4;
                    case 3:
                        sduiInstrumentText7 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, i3, SduiInstrumentText$$serializer.INSTANCE, sduiInstrumentText7);
                        i4 |= 8;
                    case 4:
                        sduiInstrumentText8 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiInstrumentText$$serializer.INSTANCE, sduiInstrumentText8);
                        i4 |= 16;
                    case 5:
                        sduiInstrumentText9 = (SduiInstrumentText) decodingBeginStructure.decodeSerializableElement(descriptor2, i2, SduiInstrumentText$$serializer.INSTANCE, sduiInstrumentText9);
                        i4 |= 32;
                    case 6:
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 6, kSerializerArr[6], sduiComponentType2);
                        i4 |= 64;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i4;
            sduiComponentType = sduiComponentType2;
            sduiInstrumentText = sduiInstrumentText9;
            z = zDecodeBooleanElement2;
            sduiAction = sduiAction3;
            str = strDecodeStringElement2;
            sduiInstrumentText2 = sduiInstrumentText7;
            sduiInstrumentText3 = sduiInstrumentText8;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiInvestFlowSingleInstrument(i, sduiAction, z, str, sduiInstrumentText2, sduiInstrumentText3, sduiInstrumentText, sduiComponentType, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiInvestFlowSingleInstrument value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiInvestFlowSingleInstrument.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
