package microgram.android.extension;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BuildServiceExtensionMap.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.extension.BuildServiceExtensionMapKt$buildServiceExtensionMap$1$1$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class BuildServiceExtensionMap2 extends FunctionReferenceImpl implements Function0<ServiceExtension> {
    BuildServiceExtensionMap2(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ServiceExtension invoke() {
        return (ServiceExtension) ((Provider) this.receiver).get();
    }
}
