package sprig.graphics;

import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, m3636d2 = {"Lsprig/c/e;", "", "Lsprig/c/i;", "versionProvider", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "", "b", "Ljava/util/List;", "unsupportedChromeVersions", "c", "browserPackageNames", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.c.e */
/* loaded from: classes28.dex */
public final class C48997e {

    /* renamed from: a */
    public static final C48997e f8239a = new C48997e();

    /* renamed from: b, reason: from kotlin metadata */
    private static final List<String> unsupportedChromeVersions = CollectionsKt.listOf("89.0.4389.90");

    /* renamed from: c, reason: from kotlin metadata */
    private static final List<String> browserPackageNames = CollectionsKt.listOf((Object[]) new String[]{"com.google.android.webview", "com.android.chrome"});

    private C48997e() {
    }

    /* renamed from: a */
    public final boolean m4047a(InterfaceC49001i versionProvider) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(versionProvider, "versionProvider");
        List<String> list = browserPackageNames;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(versionProvider.mo4140a(str));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                objM28550constructorimpl = null;
            }
            arrayList.add((String) objM28550constructorimpl);
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (CollectionsKt.contains(unsupportedChromeVersions, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
