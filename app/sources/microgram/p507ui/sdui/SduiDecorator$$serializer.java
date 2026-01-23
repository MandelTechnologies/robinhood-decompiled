package microgram.p507ui.sdui;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"microgram/ui/sdui/SduiDecorator.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmicrogram/ui/sdui/SduiDecorator;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes14.dex */
public final class SduiDecorator$$serializer implements PluginHelperInterfaces<SduiDecorator> {
    public static final SduiDecorator$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SduiDecorator$$serializer sduiDecorator$$serializer = new SduiDecorator$$serializer();
        INSTANCE = sduiDecorator$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("microgram.ui.sdui.SduiDecorator", sduiDecorator$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("accessibility", true);
        pluginGeneratedSerialDescriptor.addElement("alpha", true);
        pluginGeneratedSerialDescriptor.addElement("analytics_event_descriptor", true);
        pluginGeneratedSerialDescriptor.addElement("background_color", true);
        pluginGeneratedSerialDescriptor.addElement("border", true);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("corner_radius", true);
        pluginGeneratedSerialDescriptor.addElement("education_tour_element", true);
        pluginGeneratedSerialDescriptor.addElement("gold_shimmer", true);
        pluginGeneratedSerialDescriptor.addElement("gutter_behavior", true);
        pluginGeneratedSerialDescriptor.addElement("height", true);
        pluginGeneratedSerialDescriptor.addElement("identifier", true);
        pluginGeneratedSerialDescriptor.addElement("insets", true);
        pluginGeneratedSerialDescriptor.addElement("on_tap_action", true);
        pluginGeneratedSerialDescriptor.addElement("on_will_appear", true);
        pluginGeneratedSerialDescriptor.addElement("sdui_component_type", true);
        pluginGeneratedSerialDescriptor.addElement("sizing", true);
        pluginGeneratedSerialDescriptor.addElement("tag", true);
        pluginGeneratedSerialDescriptor.addElement("tooltip", true);
        pluginGeneratedSerialDescriptor.addElement("width", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SduiDecorator$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SduiDecorator.$childSerializers;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(SduiAccessibilityModifier$$serializer.INSTANCE);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(DoubleSerializer.INSTANCE);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(SduiAnalyticsEventDescriptor$$serializer.INSTANCE);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(SduiThemedColor$$serializer.INSTANCE);
        KSerializer<?> nullable5 = BuiltinSerializers.getNullable(SduiBorder$$serializer.INSTANCE);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable6 = BuiltinSerializers.getNullable(SduiEducationTourElement$$serializer.INSTANCE);
        KSerializer<?> nullable7 = BuiltinSerializers.getNullable(JsonElementSerializers6.INSTANCE);
        KSerializer<?> nullable8 = BuiltinSerializers.getNullable(SduiGutterBehavior$$serializer.INSTANCE);
        KSerializer<?> nullable9 = BuiltinSerializers.getNullable(longSerializer);
        KSerializer<?> nullable10 = BuiltinSerializers.getNullable(StringSerializer.INSTANCE);
        SduiAction2 sduiAction2 = SduiAction2.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, SduiComponentSerializer.INSTANCE, longSerializer, nullable6, nullable7, nullable8, nullable9, nullable10, SduiInsets$$serializer.INSTANCE, BuiltinSerializers.getNullable(sduiAction2), BuiltinSerializers.getNullable(sduiAction2), kSerializerArr[15], BuiltinSerializers.getNullable(SduiSizing$$serializer.INSTANCE), BuiltinSerializers.getNullable(longSerializer), BuiltinSerializers.getNullable(SduiTooltip$$serializer.INSTANCE), BuiltinSerializers.getNullable(longSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer2
    public SduiDecorator deserialize(Decoding2 decoder) {
        int i;
        SduiAccessibilityModifier sduiAccessibilityModifier;
        SduiComponent sduiComponent;
        SduiInsets sduiInsets;
        Long l;
        SduiTooltip sduiTooltip;
        Long l2;
        SduiSizing sduiSizing;
        SduiAction sduiAction;
        String str;
        Long l3;
        SduiGutterBehavior sduiGutterBehavior;
        Double d;
        SduiAnalyticsEventDescriptor sduiAnalyticsEventDescriptor;
        SduiThemedColor sduiThemedColor;
        SduiBorder sduiBorder;
        JsonElement6 jsonElement6;
        SduiEducationTourElement sduiEducationTourElement;
        SduiComponentType sduiComponentType;
        SduiAction sduiAction2;
        long j;
        JsonElement6 jsonElement62;
        int i2;
        SduiAction sduiAction3;
        SduiComponentType sduiComponentType2;
        JsonElement6 jsonElement63;
        SduiEducationTourElement sduiEducationTourElement2;
        SduiComponentType sduiComponentType3;
        JsonElement6 jsonElement64;
        SduiEducationTourElement sduiEducationTourElement3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = SduiDecorator.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiAccessibilityModifier sduiAccessibilityModifier2 = (SduiAccessibilityModifier) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAccessibilityModifier$$serializer.INSTANCE, null);
            Double d2 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DoubleSerializer.INSTANCE, null);
            SduiAnalyticsEventDescriptor sduiAnalyticsEventDescriptor2 = (SduiAnalyticsEventDescriptor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiAnalyticsEventDescriptor$$serializer.INSTANCE, null);
            SduiThemedColor sduiThemedColor2 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, null);
            SduiBorder sduiBorder2 = (SduiBorder) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiBorder$$serializer.INSTANCE, null);
            SduiComponent sduiComponent2 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiComponentSerializer.INSTANCE, null);
            long jDecodeLongElement = decodingBeginStructure.decodeLongElement(descriptor2, 6);
            SduiEducationTourElement sduiEducationTourElement4 = (SduiEducationTourElement) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, SduiEducationTourElement$$serializer.INSTANCE, null);
            JsonElement6 jsonElement65 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, JsonElementSerializers6.INSTANCE, null);
            SduiGutterBehavior sduiGutterBehavior2 = (SduiGutterBehavior) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, SduiGutterBehavior$$serializer.INSTANCE, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, longSerializer, null);
            String str2 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, null);
            SduiInsets sduiInsets2 = (SduiInsets) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, SduiInsets$$serializer.INSTANCE, null);
            SduiAction2 sduiAction22 = SduiAction2.INSTANCE;
            SduiAction sduiAction4 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, sduiAction22, null);
            SduiAction sduiAction5 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 14, sduiAction22, null);
            SduiComponentType sduiComponentType4 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 15, kSerializerArr[15], null);
            SduiSizing sduiSizing2 = (SduiSizing) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 16, SduiSizing$$serializer.INSTANCE, null);
            Long l5 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 17, longSerializer, null);
            i = 1048575;
            sduiTooltip = (SduiTooltip) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 18, SduiTooltip$$serializer.INSTANCE, null);
            l = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 19, longSerializer, null);
            sduiThemedColor = sduiThemedColor2;
            sduiBorder = sduiBorder2;
            jsonElement6 = jsonElement65;
            sduiAnalyticsEventDescriptor = sduiAnalyticsEventDescriptor2;
            d = d2;
            sduiComponent = sduiComponent2;
            sduiEducationTourElement = sduiEducationTourElement4;
            sduiGutterBehavior = sduiGutterBehavior2;
            j = jDecodeLongElement;
            sduiSizing = sduiSizing2;
            l2 = l5;
            sduiAction2 = sduiAction5;
            sduiAction = sduiAction4;
            sduiComponentType = sduiComponentType4;
            sduiInsets = sduiInsets2;
            str = str2;
            l3 = l4;
            sduiAccessibilityModifier = sduiAccessibilityModifier2;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            SduiAction sduiAction6 = null;
            SduiComponentType sduiComponentType5 = null;
            SduiEducationTourElement sduiEducationTourElement5 = null;
            JsonElement6 jsonElement66 = null;
            SduiInsets sduiInsets3 = null;
            Long l6 = null;
            SduiTooltip sduiTooltip2 = null;
            SduiSizing sduiSizing3 = null;
            SduiAction sduiAction7 = null;
            String str3 = null;
            Long l7 = null;
            SduiGutterBehavior sduiGutterBehavior3 = null;
            SduiAccessibilityModifier sduiAccessibilityModifier3 = null;
            Double d3 = null;
            SduiAnalyticsEventDescriptor sduiAnalyticsEventDescriptor3 = null;
            SduiThemedColor sduiThemedColor3 = null;
            SduiBorder sduiBorder3 = null;
            SduiComponent sduiComponent3 = null;
            i = 0;
            Long l8 = null;
            while (z) {
                SduiEducationTourElement sduiEducationTourElement6 = sduiEducationTourElement5;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        sduiAction3 = sduiAction6;
                        z = false;
                        jsonElement66 = jsonElement66;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        sduiAction6 = sduiAction3;
                    case 0:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        jsonElement63 = jsonElement66;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        sduiAccessibilityModifier3 = (SduiAccessibilityModifier) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SduiAccessibilityModifier$$serializer.INSTANCE, sduiAccessibilityModifier3);
                        i |= 1;
                        d3 = d3;
                        jsonElement66 = jsonElement63;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 1:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        jsonElement63 = jsonElement66;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        d3 = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DoubleSerializer.INSTANCE, d3);
                        i |= 2;
                        sduiAnalyticsEventDescriptor3 = sduiAnalyticsEventDescriptor3;
                        jsonElement66 = jsonElement63;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 2:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        jsonElement63 = jsonElement66;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        sduiAnalyticsEventDescriptor3 = (SduiAnalyticsEventDescriptor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SduiAnalyticsEventDescriptor$$serializer.INSTANCE, sduiAnalyticsEventDescriptor3);
                        i |= 4;
                        sduiThemedColor3 = sduiThemedColor3;
                        jsonElement66 = jsonElement63;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 3:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        jsonElement63 = jsonElement66;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        sduiThemedColor3 = (SduiThemedColor) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SduiThemedColor$$serializer.INSTANCE, sduiThemedColor3);
                        i |= 8;
                        sduiBorder3 = sduiBorder3;
                        jsonElement66 = jsonElement63;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 4:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        jsonElement63 = jsonElement66;
                        sduiBorder3 = (SduiBorder) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SduiBorder$$serializer.INSTANCE, sduiBorder3);
                        i |= 16;
                        jsonElement66 = jsonElement63;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 5:
                        sduiAction3 = sduiAction6;
                        sduiComponentType2 = sduiComponentType5;
                        sduiEducationTourElement2 = sduiEducationTourElement6;
                        sduiComponent3 = (SduiComponent) decodingBeginStructure.decodeSerializableElement(descriptor2, 5, SduiComponentSerializer.INSTANCE, sduiComponent3);
                        i |= 32;
                        jsonElement66 = jsonElement66;
                        sduiEducationTourElement5 = sduiEducationTourElement2;
                        sduiComponentType5 = sduiComponentType2;
                        sduiAction6 = sduiAction3;
                    case 6:
                        sduiAction3 = sduiAction6;
                        sduiComponentType3 = sduiComponentType5;
                        jsonElement64 = jsonElement66;
                        sduiEducationTourElement3 = sduiEducationTourElement6;
                        jDecodeLongElement2 = decodingBeginStructure.decodeLongElement(descriptor2, 6);
                        i |= 64;
                        jsonElement66 = jsonElement64;
                        sduiComponentType5 = sduiComponentType3;
                        sduiEducationTourElement5 = sduiEducationTourElement3;
                        sduiAction6 = sduiAction3;
                    case 7:
                        sduiAction3 = sduiAction6;
                        jsonElement64 = jsonElement66;
                        sduiComponentType3 = sduiComponentType5;
                        sduiEducationTourElement3 = (SduiEducationTourElement) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, SduiEducationTourElement$$serializer.INSTANCE, sduiEducationTourElement6);
                        i |= 128;
                        jsonElement66 = jsonElement64;
                        sduiComponentType5 = sduiComponentType3;
                        sduiEducationTourElement5 = sduiEducationTourElement3;
                        sduiAction6 = sduiAction3;
                    case 8:
                        jsonElement66 = (JsonElement6) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, JsonElementSerializers6.INSTANCE, jsonElement66);
                        i |= 256;
                        sduiAction6 = sduiAction6;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                    case 9:
                        jsonElement62 = jsonElement66;
                        sduiGutterBehavior3 = (SduiGutterBehavior) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, SduiGutterBehavior$$serializer.INSTANCE, sduiGutterBehavior3);
                        i |= 512;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 10:
                        jsonElement62 = jsonElement66;
                        l7 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 10, LongSerializer.INSTANCE, l7);
                        i |= 1024;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 11:
                        jsonElement62 = jsonElement66;
                        str3 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, str3);
                        i |= 2048;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 12:
                        jsonElement62 = jsonElement66;
                        sduiInsets3 = (SduiInsets) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, SduiInsets$$serializer.INSTANCE, sduiInsets3);
                        i |= 4096;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 13:
                        jsonElement62 = jsonElement66;
                        sduiAction7 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 13, SduiAction2.INSTANCE, sduiAction7);
                        i |= 8192;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 14:
                        jsonElement62 = jsonElement66;
                        sduiAction6 = (SduiAction) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 14, SduiAction2.INSTANCE, sduiAction6);
                        i |= 16384;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 15:
                        jsonElement62 = jsonElement66;
                        sduiComponentType5 = (SduiComponentType) decodingBeginStructure.decodeSerializableElement(descriptor2, 15, kSerializerArr[15], sduiComponentType5);
                        i |= 32768;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 16:
                        jsonElement62 = jsonElement66;
                        sduiSizing3 = (SduiSizing) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 16, SduiSizing$$serializer.INSTANCE, sduiSizing3);
                        i2 = 65536;
                        i |= i2;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 17:
                        jsonElement62 = jsonElement66;
                        l8 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 17, LongSerializer.INSTANCE, l8);
                        i2 = 131072;
                        i |= i2;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 18:
                        jsonElement62 = jsonElement66;
                        sduiTooltip2 = (SduiTooltip) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 18, SduiTooltip$$serializer.INSTANCE, sduiTooltip2);
                        i2 = 262144;
                        i |= i2;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    case 19:
                        jsonElement62 = jsonElement66;
                        l6 = (Long) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 19, LongSerializer.INSTANCE, l6);
                        i2 = 524288;
                        i |= i2;
                        sduiEducationTourElement5 = sduiEducationTourElement6;
                        jsonElement66 = jsonElement62;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            sduiAccessibilityModifier = sduiAccessibilityModifier3;
            sduiComponent = sduiComponent3;
            sduiInsets = sduiInsets3;
            l = l6;
            sduiTooltip = sduiTooltip2;
            l2 = l8;
            sduiSizing = sduiSizing3;
            sduiAction = sduiAction7;
            str = str3;
            l3 = l7;
            sduiGutterBehavior = sduiGutterBehavior3;
            d = d3;
            sduiAnalyticsEventDescriptor = sduiAnalyticsEventDescriptor3;
            sduiThemedColor = sduiThemedColor3;
            sduiBorder = sduiBorder3;
            jsonElement6 = jsonElement66;
            sduiEducationTourElement = sduiEducationTourElement5;
            sduiComponentType = sduiComponentType5;
            sduiAction2 = sduiAction6;
            j = jDecodeLongElement2;
        }
        int i3 = i;
        decodingBeginStructure.endStructure(descriptor2);
        return new SduiDecorator(i3, sduiAccessibilityModifier, d, sduiAnalyticsEventDescriptor, sduiThemedColor, sduiBorder, sduiComponent, j, sduiEducationTourElement, jsonElement6, sduiGutterBehavior, l3, str, sduiInsets, sduiAction, sduiAction2, sduiComponentType, sduiSizing, l2, sduiTooltip, l, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, SduiDecorator value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        SduiDecorator.write$Self$microgram_ui(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
