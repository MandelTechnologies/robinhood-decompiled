package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import com.plaid.internal.C7122k1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@SourceDebugExtension
/* renamed from: com.plaid.internal.a8 */
/* loaded from: classes16.dex */
public abstract class AbstractC6037a8 extends ViewModel {

    /* renamed from: a */
    public final C6009X7 f1909a;

    /* renamed from: b */
    public final InterfaceC5815C4 f1910b;

    /* renamed from: c */
    public InterfaceC7203s2 f1911c;

    /* renamed from: d */
    public InterfaceC7162n6 f1912d;

    /* renamed from: e */
    public C7195r3 f1913e;

    public AbstractC6037a8(C6009X7 paneId, InterfaceC5815C4 paneHostComponent) {
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f1909a = paneId;
        this.f1910b = paneHostComponent;
    }

    /* renamed from: a */
    public final C7195r3 m1367a() {
        C7195r3 c7195r3 = this.f1913e;
        if (c7195r3 != null) {
            return c7195r3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkWorkflowAnalytics");
        return null;
    }

    /* renamed from: b */
    public final InterfaceC7162n6 m1369b() {
        InterfaceC7162n6 interfaceC7162n6 = this.f1912d;
        if (interfaceC7162n6 != null) {
            return interfaceC7162n6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paneStore");
        return null;
    }

    /* renamed from: a */
    public final Object m1368a(C6009X7 c6009x7, C7122k1.a aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C6018Y7(this, c6009x7, null), aVar);
    }
}
