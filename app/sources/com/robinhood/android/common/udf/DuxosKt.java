package com.robinhood.android.common.udf;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Duxos.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0012\b\u0000\u0010\b\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u0004H\u0086\b\u001a'\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0012\b\u0000\u0010\b\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\u0007H\u0086\b\u001a1\u0010\t\u001a\u0002H\u0002\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003*\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"duxo", "Lkotlin/Lazy;", "D", "Lcom/robinhood/android/udf/BaseDuxo;", "Landroidx/fragment/app/Fragment;", "duxoClass", "Ljava/lang/Class;", "Lcom/robinhood/android/common/ui/BaseActivity;", "V", "createDuxo", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/Class;)Lcom/robinhood/android/udf/BaseDuxo;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DuxosKt {
    public static final <D extends BaseDuxo<?, ?>> Lazy<D> duxo(final Fragment fragment, final Class<D> duxoClass) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(duxoClass, "duxoClass");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.udf.DuxosKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DuxosKt.duxo$lambda$1(fragment, duxoClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseDuxo duxo$lambda$1(Fragment fragment, Class cls) {
        BaseDuxo baseDuxoCreateDuxo = createDuxo(fragment, cls);
        DuxoLifecycleObserver2.attachToLifecycle(baseDuxoCreateDuxo, fragment);
        return baseDuxoCreateDuxo;
    }

    public static final <D extends BaseDuxo<?, ?>> Lazy<D> duxo(final BaseActivity baseActivity, final Class<D> duxoClass) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(duxoClass, "duxoClass");
        return LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.android.common.udf.DuxosKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DuxosKt.duxo$lambda$3(baseActivity, duxoClass);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseDuxo duxo$lambda$3(BaseActivity baseActivity, Class cls) {
        BaseDuxo baseDuxoCreateDuxo = createDuxo(baseActivity, cls);
        DuxoLifecycleObserver2.attachToLifecycle(baseDuxoCreateDuxo, baseActivity);
        return baseDuxoCreateDuxo;
    }

    public static final /* synthetic */ <V extends BaseDuxo<?, ?>> Lazy<V> duxo(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "V");
        return duxo(fragment, BaseDuxo.class);
    }

    public static final /* synthetic */ <V extends BaseDuxo<?, ?>> Lazy<V> duxo(BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.reifiedOperationMarker(4, "V");
        return duxo(baseActivity, BaseDuxo.class);
    }

    private static final <D extends BaseDuxo<?, ?>> D createDuxo(ViewModelStoreOwner viewModelStoreOwner, Class<D> cls) {
        return (D) new ViewModelProvider(viewModelStoreOwner).get(cls);
    }
}
