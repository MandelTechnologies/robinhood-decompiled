package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

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
import kotlinx.serialization.internal.StringSerializer;
import microgram.p507ui.sdui.SduiPictogram;

/* compiled from: Models.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGEarningsFirstDepositAlertContent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* loaded from: classes22.dex */
public final class NGEarningsFirstDepositAlertContent$$serializer implements PluginHelperInterfaces<NGEarningsFirstDepositAlertContent> {
    public static final NGEarningsFirstDepositAlertContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NGEarningsFirstDepositAlertContent$$serializer nGEarningsFirstDepositAlertContent$$serializer = new NGEarningsFirstDepositAlertContent$$serializer();
        INSTANCE = nGEarningsFirstDepositAlertContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGEarningsFirstDepositAlertContent", nGEarningsFirstDepositAlertContent$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("pog", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("bodyMarkdown", false);
        pluginGeneratedSerialDescriptor.addElement("disclosureMarkdown", false);
        pluginGeneratedSerialDescriptor.addElement("primaryCtaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("secondaryCtaTitle", false);
        pluginGeneratedSerialDescriptor.addElement("primaryCtaDeeplink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NGEarningsFirstDepositAlertContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{NGEarningsFirstDepositAlertContent.$childSerializers[0], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public NGEarningsFirstDepositAlertContent deserialize(Decoding2 decoder) {
        int i;
        SduiPictogram sduiPictogram;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = NGEarningsFirstDepositAlertContent.$childSerializers;
        int i2 = 6;
        int i3 = 0;
        SduiPictogram sduiPictogram2 = null;
        if (decodingBeginStructure.decodeSequentially()) {
            SduiPictogram sduiPictogram3 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], null);
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
            String strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
            String strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            sduiPictogram = sduiPictogram3;
            str = strDecodeStringElement2;
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 6);
            str5 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str2 = strDecodeStringElement3;
            i = 127;
        } else {
            int i4 = 1;
            int i5 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 6;
                    case 0:
                        sduiPictogram2 = (SduiPictogram) decodingBeginStructure.decodeSerializableElement(descriptor2, i6, kSerializerArr[i6], sduiPictogram2);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 6;
                    case 1:
                        strDecodeStringElement7 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                        i5 |= 2;
                        i3 = i6;
                    case 2:
                        strDecodeStringElement8 = decodingBeginStructure.decodeStringElement(descriptor2, 2);
                        i5 |= 4;
                        i3 = i6;
                    case 3:
                        strDecodeStringElement9 = decodingBeginStructure.decodeStringElement(descriptor2, 3);
                        i5 |= 8;
                        i3 = i6;
                    case 4:
                        strDecodeStringElement10 = decodingBeginStructure.decodeStringElement(descriptor2, 4);
                        i5 |= 16;
                        i3 = i6;
                    case 5:
                        strDecodeStringElement11 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i5 |= 32;
                        i3 = i6;
                    case 6:
                        strDecodeStringElement12 = decodingBeginStructure.decodeStringElement(descriptor2, i2);
                        i5 |= 64;
                        i3 = i6;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            sduiPictogram = sduiPictogram2;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement12;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new NGEarningsFirstDepositAlertContent(i, sduiPictogram, str, str2, str3, str4, str5, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, NGEarningsFirstDepositAlertContent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        NGEarningsFirstDepositAlertContent.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
