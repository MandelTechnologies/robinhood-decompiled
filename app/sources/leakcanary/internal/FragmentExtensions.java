package leakcanary.internal;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FragmentExtensions.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0000\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, m3636d2 = {"hasAndroidXFragmentActivity", "", "getHasAndroidXFragmentActivity", "()Z", "hasAndroidXFragmentActivity$delegate", "Lkotlin/Lazy;", "onAndroidXFragmentViewDestroyed", "", "Landroid/app/Activity;", "block", "Lkotlin/Function0;", "plumber-android-core_release"}, m3637k = 2, m3638mv = {1, 4, 1})
/* renamed from: leakcanary.internal.FragmentExtensionsKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class FragmentExtensions {
    private static final Lazy hasAndroidXFragmentActivity$delegate = LazyKt.lazy(new Function0<Boolean>() { // from class: leakcanary.internal.FragmentExtensionsKt$hasAndroidXFragmentActivity$2
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            try {
                int i = FragmentActivity.$r8$clinit;
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    });

    private static final boolean getHasAndroidXFragmentActivity() {
        return ((Boolean) hasAndroidXFragmentActivity$delegate.getValue()).booleanValue();
    }

    public static final void onAndroidXFragmentViewDestroyed(Activity onAndroidXFragmentViewDestroyed, final Function0<Unit> block) {
        Intrinsics.checkParameterIsNotNull(onAndroidXFragmentViewDestroyed, "$this$onAndroidXFragmentViewDestroyed");
        Intrinsics.checkParameterIsNotNull(block, "block");
        if (getHasAndroidXFragmentActivity() && (onAndroidXFragmentViewDestroyed instanceof FragmentActivity)) {
            ((FragmentActivity) onAndroidXFragmentViewDestroyed).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: leakcanary.internal.FragmentExtensionsKt.onAndroidXFragmentViewDestroyed.1
                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewDestroyed(FragmentManager fm, Fragment fragment) {
                    Intrinsics.checkParameterIsNotNull(fm, "fm");
                    Intrinsics.checkParameterIsNotNull(fragment, "fragment");
                    block.invoke();
                }
            }, true);
        }
    }
}
