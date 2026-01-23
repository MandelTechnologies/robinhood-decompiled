package androidx.lifecycle.viewmodel.internal;

import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Supervisor3;

/* compiled from: CloseableCoroutineScope.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"VIEW_MODEL_SCOPE_KEY", "", "createViewModelScope", "Landroidx/lifecycle/viewmodel/internal/CloseableCoroutineScope;", "asCloseable", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.lifecycle.viewmodel.internal.CloseableCoroutineScopeKt, reason: use source file name */
/* loaded from: classes.dex */
public final class CloseableCoroutineScope2 {
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    public static final CloseableCoroutineScope createViewModelScope() {
        CoroutineContext immediate;
        try {
            immediate = Dispatchers.getMain().getImmediate();
        } catch (IllegalStateException unused) {
            immediate = CoroutineContextImpl6.INSTANCE;
        } catch (Standard2 unused2) {
            immediate = CoroutineContextImpl6.INSTANCE;
        }
        return new CloseableCoroutineScope(immediate.plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    public static final CloseableCoroutineScope asCloseable(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return new CloseableCoroutineScope(coroutineScope);
    }
}
