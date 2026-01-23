package microgram.android;

import com.robinhood.coroutines.dagger.annotation.IODispatcher;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Interruptible;
import microgram.android.internal.bundle.PackageManager;
import okio.FileSystem;

/* compiled from: PackagePreloader.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/RealPackagePreloader;", "Lmicrogram/android/PackagePreloader;", "packageManager", "Lmicrogram/android/internal/bundle/PackageManager;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lmicrogram/android/internal/bundle/PackageManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "preload", "Lkotlin/Result;", "", "source", "Lmicrogram/android/RemoteMicrogramApplication;", "preload-gIAlu-s", "(Lmicrogram/android/RemoteMicrogramApplication;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.RealPackagePreloader, reason: use source file name */
/* loaded from: classes14.dex */
public final class PackagePreloader2 implements PackagePreloader {
    private final CoroutineDispatcher ioDispatcher;
    private final PackageManager packageManager;

    public PackagePreloader2(PackageManager packageManager, @IODispatcher CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.packageManager = packageManager;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a2 -> B:35:0x00a5). Please report as a decompilation issue!!! */
    @Override // microgram.android.PackagePreloader
    /* renamed from: preload-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo28945preloadgIAlus(RemoteMicrogramApplication remoteMicrogramApplication, Continuation<? super Result<Unit>> continuation) {
        PackagePreloader3 packagePreloader3;
        final RemoteMicrogramApplication remoteMicrogramApplication2;
        int i;
        IOException iOException;
        RemoteMicrogramApplication remoteMicrogramApplication3;
        RemoteMicrogramApplication remoteMicrogramApplication4;
        IOException iOException2;
        if (continuation instanceof PackagePreloader3) {
            packagePreloader3 = (PackagePreloader3) continuation;
            int i2 = packagePreloader3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                packagePreloader3.label = i2 - Integer.MIN_VALUE;
            } else {
                packagePreloader3 = new PackagePreloader3(this, continuation);
            }
        }
        Object obj = packagePreloader3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = packagePreloader3.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = packagePreloader3.I$0;
                iOException = (IOException) packagePreloader3.L$1;
                remoteMicrogramApplication3 = (RemoteMicrogramApplication) packagePreloader3.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (IOException e) {
                    remoteMicrogramApplication4 = remoteMicrogramApplication3;
                    iOException2 = iOException;
                    iOException = e;
                    if (i < 2) {
                    }
                }
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(Unit.INSTANCE);
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = packagePreloader3.I$0;
            iOException = (IOException) packagePreloader3.L$2;
            iOException2 = (IOException) packagePreloader3.L$1;
            remoteMicrogramApplication4 = (RemoteMicrogramApplication) packagePreloader3.L$0;
            ResultKt.throwOnFailure(obj);
            remoteMicrogramApplication2 = remoteMicrogramApplication4;
            if (iOException2 != null) {
                ExceptionsKt.addSuppressed(iOException2, iOException);
                iOException = iOException2;
            }
            i++;
            if (i >= 3) {
                try {
                } catch (IOException e2) {
                    iOException2 = iOException;
                    iOException = e2;
                    remoteMicrogramApplication4 = remoteMicrogramApplication2;
                    if (i < 2) {
                        Duration.Companion companion2 = Duration.INSTANCE;
                        long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
                        packagePreloader3.L$0 = remoteMicrogramApplication4;
                        packagePreloader3.L$1 = iOException2;
                        packagePreloader3.L$2 = iOException;
                        packagePreloader3.I$0 = i;
                        packagePreloader3.label = 2;
                    }
                }
                CoroutineDispatcher coroutineDispatcher = this.ioDispatcher;
                Function0 function0 = new Function0() { // from class: microgram.android.RealPackagePreloader$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PackagePreloader2.preload_gIAlu_s$lambda$0(this.f$0, remoteMicrogramApplication2);
                    }
                };
                packagePreloader3.L$0 = remoteMicrogramApplication2;
                packagePreloader3.L$1 = iOException;
                packagePreloader3.L$2 = null;
                packagePreloader3.I$0 = i;
                packagePreloader3.label = 1;
                if (Interruptible.runInterruptible(coroutineDispatcher, function0, packagePreloader3) != coroutine_suspended) {
                    remoteMicrogramApplication3 = remoteMicrogramApplication2;
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m28550constructorimpl(Unit.INSTANCE);
                }
                return coroutine_suspended;
            }
            Result.Companion companion4 = Result.INSTANCE;
            Intrinsics.checkNotNull(iOException);
            return Result.m28550constructorimpl(ResultKt.createFailure(iOException));
        }
        ResultKt.throwOnFailure(obj);
        remoteMicrogramApplication2 = remoteMicrogramApplication;
        i = 0;
        iOException = null;
        if (i >= 3) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileSystem preload_gIAlu_s$lambda$0(PackagePreloader2 packagePreloader2, RemoteMicrogramApplication remoteMicrogramApplication) {
        return PackageManager.DefaultImpls.loadPackage$default(packagePreloader2.packageManager, remoteMicrogramApplication.getAppId(), null, 2, null);
    }
}
