package com.robinhood.onboarding.nggoldearningsindepositstep.contracts;

import com.robinhood.android.directdeposit.p101ui.prefilled.partial.EditDepositAmountActivity;
import com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfaces;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: NGGoldEarningsService_Adapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"com/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/robinhood/onboarding/nggoldearningsindepositstep/contracts/NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "contracts"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Deprecated
/* renamed from: com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter$Endpoint_getExistingUserAlertContent$Arguments$$serializer */
/* loaded from: classes22.dex */
public final class C35922xec660364 implements PluginHelperInterfaces<NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments> {
    public static final C35922xec660364 INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C35922xec660364 c35922xec660364 = new C35922xec660364();
        INSTANCE = c35922xec660364;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.robinhood.onboarding.nggoldearningsindepositstep.contracts.NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments", c35922xec660364, 2);
        pluginGeneratedSerialDescriptor.addElement(EditDepositAmountActivity.EXTRA_DEPOSIT_AMOUNT, false);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private C35922xec660364() {
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializers.getNullable(DoubleSerializer.INSTANCE), StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer2
    public NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments deserialize(Decoding2 decoder) {
        Double d;
        String strDecodeStringElement;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        Decoding decodingBeginStructure = decoder.beginStructure(descriptor2);
        if (decodingBeginStructure.decodeSequentially()) {
            d = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, DoubleSerializer.INSTANCE, null);
            strDecodeStringElement = decodingBeginStructure.decodeStringElement(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            d = null;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = decodingBeginStructure.decodeElementIndex(descriptor2);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    d = (Double) decodingBeginStructure.decodeNullableSerializableElement(descriptor2, 0, DoubleSerializer.INSTANCE, d);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationExceptions3(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = decodingBeginStructure.decodeStringElement(descriptor2, 1);
                    i2 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i = i2;
        }
        decodingBeginStructure.endStructure(descriptor2);
        return new NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments(i, d, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer3
    public void serialize(Encoding4 encoder, NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        Encoding3 encoding3BeginStructure = encoder.beginStructure(descriptor2);
        NGGoldEarningsService_Adapter.Endpoint_getExistingUserAlertContent.Arguments.write$Self$contracts(value, encoding3BeginStructure, descriptor2);
        encoding3BeginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.PluginHelperInterfaces
    public KSerializer<?>[] typeParametersSerializers() {
        return PluginHelperInterfaces.DefaultImpls.typeParametersSerializers(this);
    }
}
