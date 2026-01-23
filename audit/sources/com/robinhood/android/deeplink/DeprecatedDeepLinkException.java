package com.robinhood.android.deeplink;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeprecatedDeepLinkException.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeprecatedDeepLinkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeprecatedDeepLinkException extends Exception {
    private final String path;

    public static /* synthetic */ DeprecatedDeepLinkException copy$default(DeprecatedDeepLinkException deprecatedDeepLinkException, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deprecatedDeepLinkException.path;
        }
        return deprecatedDeepLinkException.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final DeprecatedDeepLinkException copy(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new DeprecatedDeepLinkException(path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeprecatedDeepLinkException) && Intrinsics.areEqual(this.path, ((DeprecatedDeepLinkException) other).path);
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DeprecatedDeepLinkException(path=" + this.path + ")";
    }

    public final String getPath() {
        return this.path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeprecatedDeepLinkException(String path) {
        super("Attempting to use deprecated deeplink: " + path);
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }
}
