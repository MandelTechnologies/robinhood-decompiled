package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* compiled from: KPackageImpl.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.KPackageImpl$getLocalProperty$1$1$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class KPackageImpl2 extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {
    public static final KPackageImpl2 INSTANCE = new KPackageImpl2();

    KPackageImpl2() {
        super(2, MemberDeserializer.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final PropertyDescriptor invoke(MemberDeserializer p0, ProtoBuf.Property p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return p0.loadProperty(p1);
    }
}
