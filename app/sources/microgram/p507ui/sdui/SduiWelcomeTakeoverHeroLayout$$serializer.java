package microgram.p507ui.sdui;

import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiWelcomeTakeoverHeroLayout.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiWelcomeTakeoverHeroLayout;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiWelcomeTakeoverHeroLayout$$serializer implements PluginHelperInterfaces<SduiWelcomeTakeoverHeroLayout> {
    public static final SduiWelcomeTakeoverHeroLayout$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiWelcomeTakeoverHeroLayout$$serializer sduiWelcomeTakeoverHeroLayout$$serializer = new SduiWelcomeTakeoverHeroLayout$$serializer();
        INSTANCE = sduiWelcomeTakeoverHeroLayout$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiWelcomeTakeoverHeroLayout", sduiWelcomeTakeoverHeroLayout$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("body_components", false);
        pluginGeneratedSerialDescriptor.addElement("footer_components", false);
        pluginGeneratedSerialDescriptor.addElement("logging_context", false);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("title_bar", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiWelcomeTakeoverHeroLayout$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiWelcomeTakeoverHeroLayout.$childSerializers;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2], kSerializerArr[3], SduiReferralLandingTitleBar$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiWelcomeTakeoverHeroLayout deserialize(Decoding2 decoder) {
        int i;
        List list;
        List list2;
        Map map;
        SduiComponentType sduiComponentType;
        SduiReferralLandingTitleBar sduiReferralLandingTitleBar;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiWelcomeTakeoverHeroLayout.$childSerializers;
        int i2 = 0;
        List list3 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            List list4 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            List list5 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], null);
            Map map2 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], null);
            sduiComponentType = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            list = list4;
            sduiReferralLandingTitleBar = (SduiReferralLandingTitleBar) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiReferralLandingTitleBar$$serializer.INSTANCE, null);
            i = 31;
            map = map2;
            list2 = list5;
        } else {
            int i3 = 1;
            int i4 = 0;
            List list6 = null;
            Map map3 = null;
            SduiComponentType sduiComponentType2 = null;
            SduiReferralLandingTitleBar sduiReferralLandingTitleBar2 = null;
            while (i3 != 0) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        list6 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, 1, kSerializerArr[1], list6);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        map3 = (Map) decodingBeginStructure.decodeSerializableElement(descriptor2, 2, kSerializerArr[2], map3);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        sduiComponentType2 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], sduiComponentType2);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new SerializationExceptions3(iDecodeElementIndex);
                        }
                        sduiReferralLandingTitleBar2 = (SduiReferralLandingTitleBar) decodingBeginStructure.decodeSerializableElement(descriptor2, 4, SduiReferralLandingTitleBar$$serializer.INSTANCE, sduiReferralLandingTitleBar2);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    list3 = (List) decodingBeginStructure.decodeSerializableElement(descriptor2, i5, kSerializerArr[i5], list3);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            list = list3;
            list2 = list6;
            map = map3;
            sduiComponentType = sduiComponentType2;
            sduiReferralLandingTitleBar = sduiReferralLandingTitleBar2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiWelcomeTakeoverHeroLayout(i, list, list2, map, sduiComponentType, sduiReferralLandingTitleBar, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiWelcomeTakeoverHeroLayout value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiWelcomeTakeoverHeroLayout.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
