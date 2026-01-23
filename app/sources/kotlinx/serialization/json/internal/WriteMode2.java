package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.ContextAware;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKinds;
import kotlinx.serialization.descriptors.SerialKinds2;
import kotlinx.serialization.descriptors.SerialKinds3;
import kotlinx.serialization.descriptors.SerialKinds4;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: WriteMode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "desc", "Lkotlinx/serialization/json/internal/WriteMode;", "switchMode", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/WriteMode;", "Lkotlinx/serialization/modules/SerializersModule;", "module", "carrierDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.internal.WriteModeKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class WriteMode2 {
    public static final WriteMode switchMode(Json json, SerialDescriptor desc) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        SerialKinds3 kind = desc.getKind();
        if (kind instanceof SerialKinds) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, SerialKinds4.LIST.INSTANCE)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(kind, SerialKinds4.MAP.INSTANCE)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(desc.getElementDescriptor(0), json.getSerializersModule());
        SerialKinds3 kind2 = serialDescriptorCarrierDescriptor.getKind();
        if ((kind2 instanceof SerialKinds2) || Intrinsics.areEqual(kind2, SerialKinds3.ENUM.INSTANCE)) {
            return WriteMode.MAP;
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw JsonExceptions4.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }

    public static final SerialDescriptor carrierDescriptor(SerialDescriptor serialDescriptor, SerializersModule module) {
        SerialDescriptor serialDescriptorCarrierDescriptor;
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual(serialDescriptor.getKind(), SerialKinds3.CONTEXTUAL.INSTANCE)) {
            return serialDescriptor.getIsInline() ? carrierDescriptor(serialDescriptor.getElementDescriptor(0), module) : serialDescriptor;
        }
        SerialDescriptor contextualDescriptor = ContextAware.getContextualDescriptor(module, serialDescriptor);
        return (contextualDescriptor == null || (serialDescriptorCarrierDescriptor = carrierDescriptor(contextualDescriptor, module)) == null) ? serialDescriptor : serialDescriptorCarrierDescriptor;
    }
}
