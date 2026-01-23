package microgram.android.internal.bundle;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PackageStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.RealPackageStore$packageLock$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class PackageStore3 extends FunctionReferenceImpl implements Function0<ReentrantLock> {
    public static final PackageStore3 INSTANCE = new PackageStore3();

    PackageStore3() {
        super(0, ReentrantLock.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReentrantLock invoke() {
        return new ReentrantLock();
    }
}
