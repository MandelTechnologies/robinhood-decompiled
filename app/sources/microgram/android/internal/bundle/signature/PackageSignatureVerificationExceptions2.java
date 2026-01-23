package microgram.android.internal.bundle.signature;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import microgram.android.internal.bundle.PackageManagementExceptions5;

/* compiled from: PackageSignatureVerificationExceptions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/android/internal/bundle/signature/PackageSignatureVerificationException;", "Lmicrogram/android/internal/bundle/PackageVerificationException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.bundle.signature.PackageSignatureVerificationException, reason: use source file name */
/* loaded from: classes14.dex */
public class PackageSignatureVerificationExceptions2 extends PackageManagementExceptions5 {
    public /* synthetic */ PackageSignatureVerificationExceptions2(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    public PackageSignatureVerificationExceptions2(String str, Throwable th) {
        super(str, th);
    }
}
