package com.stripe.hcaptcha.config;

import com.stripe.hcaptcha.encode.DurationSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: HCaptchaConfig.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/stripe/hcaptcha/config/HCaptchaConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.stripe.hcaptcha.config.HCaptchaConfig$$serializer, reason: use source file name */
/* loaded from: classes26.dex */
public final class HCaptchaConfig2 implements PluginHelperInterfaces<HCaptchaConfig> {
    public static final HCaptchaConfig2 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        HCaptchaConfig2 hCaptchaConfig2 = new HCaptchaConfig2();
        INSTANCE = hCaptchaConfig2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.hcaptcha.config.HCaptchaConfig", hCaptchaConfig2, 18);
        pluginGeneratedSerialDescriptor.addElement("siteKey", false);
        pluginGeneratedSerialDescriptor.addElement("sentry", true);
        pluginGeneratedSerialDescriptor.addElement("loading", true);
        pluginGeneratedSerialDescriptor.addElement("hideDialog", true);
        pluginGeneratedSerialDescriptor.addElement("rqdata", true);
        pluginGeneratedSerialDescriptor.addElement("jsSrc", true);
        pluginGeneratedSerialDescriptor.addElement("endpoint", true);
        pluginGeneratedSerialDescriptor.addElement("reportapi", true);
        pluginGeneratedSerialDescriptor.addElement("assethost", true);
        pluginGeneratedSerialDescriptor.addElement("imghost", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        pluginGeneratedSerialDescriptor.addElement("host", true);
        pluginGeneratedSerialDescriptor.addElement("customTheme", true);
        pluginGeneratedSerialDescriptor.addElement("tokenExpiration", true);
        pluginGeneratedSerialDescriptor.addElement("disableHardwareAcceleration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HCaptchaConfig2() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HCaptchaConfig.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable2 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable3 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable4 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable5 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> kSerializer = kSerializerArr[11];
        KSerializer<?> kSerializer2 = kSerializerArr[12];
        KSerializer<?> kSerializer3 = kSerializerArr[13];
        KSerializer<?> nullable6 = BuiltinSerializers.getNullable(stringSerializer);
        KSerializer<?> nullable7 = BuiltinSerializers.getNullable(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, booleanSerializer, booleanSerializer, booleanSerializer, nullable, stringSerializer, nullable2, nullable3, nullable4, nullable5, stringSerializer, kSerializer, kSerializer2, kSerializer3, nullable6, nullable7, DurationSerializer.INSTANCE, booleanSerializer};
    }

    @Override // kotlinx.serialization.KSerializer2
    public HCaptchaConfig deserialize(Decoding2 decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        Duration duration;
        String str3;
        HCaptchaTheme hCaptchaTheme;
        HCaptchaOrientation hCaptchaOrientation;
        HCaptchaSize hCaptchaSize;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean zDecodeBooleanElement;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = HCaptchaConfig.$childSerializers;
        if (decodingBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 0);
            boolean zDecodeBooleanElement2 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
            boolean zDecodeBooleanElement3 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
            boolean zDecodeBooleanElement4 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, stringSerializer, null);
            String strDecodeStringElement3 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
            String str11 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, stringSerializer, null);
            String str12 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            String str13 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            String str14 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, stringSerializer, null);
            String strDecodeStringElement4 = decodingBeginStructure.decodeStringElement(descriptor2, 10);
            strDecodeStringElement = strDecodeStringElement2;
            HCaptchaSize hCaptchaSize2 = (HCaptchaSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], null);
            HCaptchaOrientation hCaptchaOrientation2 = (HCaptchaOrientation) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], null);
            HCaptchaTheme hCaptchaTheme2 = (HCaptchaTheme) decodingBeginStructure.decodeSerializableElement(descriptor2, 13, kSerializerArr[13], null);
            String str15 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 14, stringSerializer, null);
            String str16 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 15, stringSerializer, null);
            duration = (Duration) decodingBeginStructure.decodeSerializableElement(descriptor2, 16, DurationSerializer.INSTANCE, null);
            str6 = str15;
            z2 = zDecodeBooleanElement3;
            z3 = zDecodeBooleanElement2;
            zDecodeBooleanElement = decodingBeginStructure.decodeBooleanElement(descriptor2, 17);
            str9 = strDecodeStringElement4;
            str7 = str14;
            str = str12;
            str5 = str11;
            str8 = strDecodeStringElement3;
            z = zDecodeBooleanElement4;
            i = 262143;
            str4 = str13;
            str2 = str10;
            str3 = str16;
            hCaptchaTheme = hCaptchaTheme2;
            hCaptchaOrientation = hCaptchaOrientation2;
            hCaptchaSize = hCaptchaSize2;
        } else {
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int i5 = 0;
            String str17 = null;
            Duration duration2 = null;
            String str18 = null;
            HCaptchaTheme hCaptchaTheme3 = null;
            HCaptchaOrientation hCaptchaOrientation3 = null;
            HCaptchaSize hCaptchaSize3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z7 = true;
            boolean zDecodeBooleanElement8 = false;
            String str22 = null;
            String str23 = null;
            while (z7) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                switch (iDecodeElementIndex) {
                    case -1:
                        i2 = i5;
                        z4 = zDecodeBooleanElement5;
                        z7 = false;
                        zDecodeBooleanElement5 = z4;
                        i5 = i2;
                    case 0:
                        z5 = zDecodeBooleanElement8;
                        int i6 = i5;
                        z6 = zDecodeBooleanElement5;
                        strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 0);
                        i2 = i6 | 1;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 1:
                        int i7 = i5;
                        z4 = zDecodeBooleanElement5;
                        i2 = i7 | 2;
                        zDecodeBooleanElement8 = decodingBeginStructure.decodeBooleanElement(descriptor2, 1);
                        zDecodeBooleanElement5 = z4;
                        i5 = i2;
                    case 2:
                        i5 |= 4;
                        zDecodeBooleanElement5 = decodingBeginStructure.decodeBooleanElement(descriptor2, 2);
                        zDecodeBooleanElement8 = zDecodeBooleanElement8;
                    case 3:
                        z5 = zDecodeBooleanElement8;
                        int i8 = i5;
                        z6 = zDecodeBooleanElement5;
                        zDecodeBooleanElement7 = decodingBeginStructure.decodeBooleanElement(descriptor2, 3);
                        i2 = i8 | 8;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 4:
                        z5 = zDecodeBooleanElement8;
                        int i9 = i5;
                        z6 = zDecodeBooleanElement5;
                        str22 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 4, StringSerializer.INSTANCE, str22);
                        i2 = i9 | 16;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 5:
                        z5 = zDecodeBooleanElement8;
                        int i10 = i5;
                        z6 = zDecodeBooleanElement5;
                        strDecodeStringElement5 = decodingBeginStructure.decodeStringElement(descriptor2, 5);
                        i2 = i10 | 32;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 6:
                        z5 = zDecodeBooleanElement8;
                        int i11 = i5;
                        z6 = zDecodeBooleanElement5;
                        str23 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 6, StringSerializer.INSTANCE, str23);
                        i2 = i11 | 64;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 7:
                        z5 = zDecodeBooleanElement8;
                        int i12 = i5;
                        z6 = zDecodeBooleanElement5;
                        str17 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str17);
                        i2 = i12 | 128;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 8:
                        z5 = zDecodeBooleanElement8;
                        int i13 = i5;
                        z6 = zDecodeBooleanElement5;
                        str19 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str19);
                        i2 = i13 | 256;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 9:
                        z5 = zDecodeBooleanElement8;
                        int i14 = i5;
                        z6 = zDecodeBooleanElement5;
                        str21 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 9, StringSerializer.INSTANCE, str21);
                        i2 = i14 | 512;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 10:
                        z5 = zDecodeBooleanElement8;
                        int i15 = i5;
                        z6 = zDecodeBooleanElement5;
                        strDecodeStringElement6 = decodingBeginStructure.decodeStringElement(descriptor2, 10);
                        i2 = i15 | 1024;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 11:
                        z5 = zDecodeBooleanElement8;
                        int i16 = i5;
                        z6 = zDecodeBooleanElement5;
                        hCaptchaSize3 = (HCaptchaSize) decodingBeginStructure.decodeSerializableElement(descriptor2, 11, kSerializerArr[11], hCaptchaSize3);
                        i2 = i16 | 2048;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 12:
                        z5 = zDecodeBooleanElement8;
                        int i17 = i5;
                        z6 = zDecodeBooleanElement5;
                        hCaptchaOrientation3 = (HCaptchaOrientation) decodingBeginStructure.decodeSerializableElement(descriptor2, 12, kSerializerArr[12], hCaptchaOrientation3);
                        i2 = i17 | 4096;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 13:
                        z5 = zDecodeBooleanElement8;
                        int i18 = i5;
                        z6 = zDecodeBooleanElement5;
                        hCaptchaTheme3 = (HCaptchaTheme) decodingBeginStructure.decodeSerializableElement(descriptor2, 13, kSerializerArr[13], hCaptchaTheme3);
                        i2 = i18 | 8192;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 14:
                        z5 = zDecodeBooleanElement8;
                        int i19 = i5;
                        z6 = zDecodeBooleanElement5;
                        str20 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 14, StringSerializer.INSTANCE, str20);
                        i2 = i19 | 16384;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 15:
                        z5 = zDecodeBooleanElement8;
                        i3 = i5;
                        z6 = zDecodeBooleanElement5;
                        str18 = (String) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 15, StringSerializer.INSTANCE, str18);
                        i4 = 32768;
                        i2 = i3 | i4;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 16:
                        i3 = i5;
                        z6 = zDecodeBooleanElement5;
                        z5 = zDecodeBooleanElement8;
                        duration2 = (Duration) decodingBeginStructure.decodeSerializableElement(descriptor2, 16, DurationSerializer.INSTANCE, duration2);
                        i4 = 65536;
                        i2 = i3 | i4;
                        zDecodeBooleanElement5 = z6;
                        zDecodeBooleanElement8 = z5;
                        i5 = i2;
                    case 17:
                        zDecodeBooleanElement6 = decodingBeginStructure.decodeBooleanElement(descriptor2, 17);
                        i5 |= 131072;
                    default:
                        throw new SerializationExceptions3(iDecodeElementIndex);
                }
            }
            i = i5;
            str = str17;
            str2 = str22;
            duration = duration2;
            str3 = str18;
            hCaptchaTheme = hCaptchaTheme3;
            hCaptchaOrientation = hCaptchaOrientation3;
            hCaptchaSize = hCaptchaSize3;
            str4 = str19;
            str5 = str23;
            str6 = str20;
            str7 = str21;
            str8 = strDecodeStringElement5;
            str9 = strDecodeStringElement6;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            z = zDecodeBooleanElement7;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement8;
        }
        String str24 = strDecodeStringElement;
        decodingBeginStructure.endStructure(descriptor2);
        return new HCaptchaConfig(i, str24, z3, z2, z, str2, str8, str5, str, str4, str7, str9, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str6, str3, duration, zDecodeBooleanElement, (SerializationConstructorMarker) null, (DefaultConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, HCaptchaConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        HCaptchaConfig.write$Self$hcaptcha_release(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
