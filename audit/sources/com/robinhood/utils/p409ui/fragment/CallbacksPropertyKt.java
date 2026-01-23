package com.robinhood.utils.p409ui.fragment;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KClass;

/* compiled from: CallbacksProperty.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b\u001a%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b\u001a%\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b\u001a%\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\bH\u0086\b¨\u0006\t"}, m3636d2 = {"hostActivityCallbacks", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/fragment/app/Fragment;", "T", "", "parentFragmentCallbacks", "targetFragmentCallbacks", "parentFragmentThenActivityHostCallbacks", "Landroid/view/View;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CallbacksPropertyKt {
    public static final /* synthetic */ <T> Interfaces2<Fragment, T> hostActivityCallbacks(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return new CallbacksProperty(orCreateKotlinClass, new Function1<Fragment, Object>() { // from class: com.robinhood.utils.ui.fragment.CallbacksPropertyKt.hostActivityCallbacks.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    Context context2 = context;
                    Intrinsics.reifiedOperationMarker(3, "T");
                    if (context2 != null) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public static final /* synthetic */ <T> Interfaces2<Fragment, T> parentFragmentCallbacks(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return new CallbacksProperty(Reflection.getOrCreateKotlinClass(Object.class), new Function1<Fragment, Object>() { // from class: com.robinhood.utils.ui.fragment.CallbacksPropertyKt.parentFragmentCallbacks.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public static final /* synthetic */ <T> Interfaces2<Fragment, T> targetFragmentCallbacks(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        return new CallbacksProperty(Reflection.getOrCreateKotlinClass(Object.class), new Function1<Fragment, Object>() { // from class: com.robinhood.utils.ui.fragment.CallbacksPropertyKt.targetFragmentCallbacks.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
    }

    public static final /* synthetic */ <T> Interfaces2<Fragment, T> parentFragmentThenActivityHostCallbacks(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return new CallbacksProperty(orCreateKotlinClass, new Function1<Fragment, Object>() { // from class: com.robinhood.utils.ui.fragment.CallbacksPropertyKt.parentFragmentThenActivityHostCallbacks.1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment parentFragment = CallbacksProperty.getParentFragment();
                Intrinsics.reifiedOperationMarker(2, "T");
                if (parentFragment != null) {
                    return parentFragment;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    Context context2 = context;
                    Intrinsics.reifiedOperationMarker(3, "T");
                    if (context2 != null) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    public static final /* synthetic */ <T> Interfaces2<View, T> hostActivityCallbacks(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.needClassReification();
        return new CallbacksProperty(orCreateKotlinClass, new Function1<View, Object>() { // from class: com.robinhood.utils.ui.fragment.CallbacksPropertyKt.hostActivityCallbacks.2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(View CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Context context = CallbacksProperty.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                for (Context context2 : BaseContexts.baseContexts(context)) {
                    Context context3 = context2;
                    Intrinsics.reifiedOperationMarker(3, "T");
                    if (context3 != null) {
                        return context2;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }
}
