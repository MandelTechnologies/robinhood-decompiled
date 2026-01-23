package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.storage.storage2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;

/* compiled from: SamConversionResolverImpl.kt */
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {
    private final storage2<ClassDescriptor, KotlinType4> functionTypesForSamInterfaces;
    private final Iterable<Object> samWithReceiverResolvers;

    public SamConversionResolverImpl(StorageManager storageManager, Iterable<? extends Object> samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.samWithReceiverResolvers = samWithReceiverResolvers;
        this.functionTypesForSamInterfaces = storageManager.createCacheWithNullableValues();
    }
}
