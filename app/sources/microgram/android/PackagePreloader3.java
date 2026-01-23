package microgram.android;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PackagePreloader.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.RealPackagePreloader", m3645f = "PackagePreloader.kt", m3646l = {40, 46}, m3647m = "preload-gIAlu-s")
/* renamed from: microgram.android.RealPackagePreloader$preload$1, reason: use source file name */
/* loaded from: classes14.dex */
final class PackagePreloader3 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PackagePreloader2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackagePreloader3(PackagePreloader2 packagePreloader2, Continuation<? super PackagePreloader3> continuation) {
        super(continuation);
        this.this$0 = packagePreloader2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo28945preloadgIAlus = this.this$0.mo28945preloadgIAlus(null, this);
        return objMo28945preloadgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo28945preloadgIAlus : Result.m28549boximpl(objMo28945preloadgIAlus);
    }
}
