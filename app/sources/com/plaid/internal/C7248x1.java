package com.plaid.internal;

import com.plaid.internal.AbstractC5894L2;
import com.plaid.internal.C5953R5;
import dagger.Lazy;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Executors4;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.x1 */
/* loaded from: classes16.dex */
public final class C7248x1 implements InterfaceC6004X2 {

    /* renamed from: a */
    public final C5807B5 f3293a;

    /* renamed from: b */
    public final Lazy<Json> f3294b;

    /* renamed from: c */
    public final Executors4 f3295c;

    /* renamed from: d */
    public AbstractC5894L2 f3296d;

    public C7248x1(C5807B5 plaidStorage, Lazy<Json> json) {
        Intrinsics.checkNotNullParameter(plaidStorage, "plaidStorage");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f3293a = plaidStorage;
        this.f3294b = json;
        this.f3295c = ThreadPoolDispatcherKt.newSingleThreadContext("LinkStateStoreThreadSafe");
    }

    /* renamed from: b */
    public static final AbstractC5894L2 m1650b(C7248x1 c7248x1) {
        c7248x1.getClass();
        try {
            try {
                C5807B5 c5807b5 = c7248x1.f3293a;
                c5807b5.getClass();
                Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
                File parentDirectory = c5807b5.f1279a.getFilesDir();
                Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
                Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
                Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
                if (!parentDirectory.exists()) {
                    parentDirectory.mkdirs();
                }
                File file = new File(parentDirectory, "plaid_link_state");
                if (!file.exists()) {
                    file.createNewFile();
                }
                String text$default = FilesKt.readText$default(file, null, 1, null);
                if (text$default != null && text$default.length() != 0) {
                    AbstractC5894L2 abstractC5894L2 = (AbstractC5894L2) c7248x1.f3294b.get().decodeFromString(AbstractC5894L2.f1455a.getValue(), text$default);
                    c7248x1.f3293a.m1153a();
                    return abstractC5894L2;
                }
            } catch (Exception e) {
                C5953R5.a.m1301a(C5953R5.f1671a, e);
                c7248x1.f3293a.m1153a();
            }
            return AbstractC5894L2.j.f1492b;
        } finally {
            c7248x1.f3293a.m1153a();
        }
    }

    @Override // com.plaid.internal.InterfaceC6004X2
    /* renamed from: a */
    public final Object mo1351a(ContinuationImpl continuationImpl) {
        return BuildersKt.withContext(this.f3295c, new C7229v1(this, null), continuationImpl);
    }

    @Override // com.plaid.internal.InterfaceC6004X2
    /* renamed from: a */
    public final Object mo1350a(AbstractC5894L2 abstractC5894L2, ContinuationImpl continuationImpl) {
        Object objWithContext = BuildersKt.withContext(this.f3295c, new C7238w1(abstractC5894L2, this, null), continuationImpl);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final void m1651b(C7248x1 c7248x1, AbstractC5894L2 abstractC5894L2) throws IOException {
        c7248x1.getClass();
        if (abstractC5894L2 instanceof AbstractC5894L2.b) {
            return;
        }
        c7248x1.f3293a.m1154a("plaid_link_state", c7248x1.f3294b.get().encodeToString(AbstractC5894L2.f1455a.getValue(), abstractC5894L2));
    }
}
