package com.robinhood.android.common.udf;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.udf.OldDuxoLifecycleObserver2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OldDuxos.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u000e\b\u0000\u0010\u0007\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\u0004H\u0086\b\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003*\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u000e\b\u0000\u0010\u0007\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0003*\u00020\bH\u0086\b\u001a-\u0010\t\u001a\u0002H\u0002\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0003*\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"oldDuxo", "Lkotlin/Lazy;", "D", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/ui/BaseActivity;", "duxoClass", "Ljava/lang/Class;", "V", "Landroidx/fragment/app/Fragment;", "createDuxo", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;)Lcom/robinhood/android/udf/OldBaseDuxo;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.udf.OldDuxosKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class OldDuxos {
    public static final <D extends OldBaseDuxo<?>> Lazy<D> oldDuxo(final BaseActivity baseActivity, final Class<D> duxoClass) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(duxoClass, "duxoClass");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.udf.OldDuxosKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldDuxos.oldDuxo$lambda$1(baseActivity, duxoClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OldBaseDuxo oldDuxo$lambda$1(BaseActivity baseActivity, Class cls) {
        OldBaseDuxo oldBaseDuxoCreateDuxo = createDuxo(baseActivity, cls);
        OldDuxoLifecycleObserver2.attachToLifecycle(oldBaseDuxoCreateDuxo, baseActivity);
        return oldBaseDuxoCreateDuxo;
    }

    public static final /* synthetic */ <V extends OldBaseDuxo<?>> Lazy<V> oldDuxo(BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.reifiedOperationMarker(4, "V");
        return oldDuxo(baseActivity, OldBaseDuxo.class);
    }

    public static final <D extends OldBaseDuxo<?>> Lazy<D> oldDuxo(final Fragment fragment, final Class<D> duxoClass) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(duxoClass, "duxoClass");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.udf.OldDuxosKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldDuxos.oldDuxo$lambda$3(fragment, duxoClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OldBaseDuxo oldDuxo$lambda$3(Fragment fragment, Class cls) {
        OldBaseDuxo oldBaseDuxoCreateDuxo = createDuxo(fragment, cls);
        OldDuxoLifecycleObserver2.attachToLifecycle(oldBaseDuxoCreateDuxo, fragment);
        return oldBaseDuxoCreateDuxo;
    }

    public static final /* synthetic */ <V extends OldBaseDuxo<?>> Lazy<V> oldDuxo(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "V");
        return oldDuxo(fragment, OldBaseDuxo.class);
    }

    private static final <D extends OldBaseDuxo<?>> D createDuxo(ViewModelStoreOwner viewModelStoreOwner, Class<D> cls) {
        return (D) new ViewModelProvider(viewModelStoreOwner).get(cls);
    }
}
