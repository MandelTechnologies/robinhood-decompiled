package com.squareup.workflow1.p415ui.androidx;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* compiled from: WorkflowAndroidXSupport.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J,\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u0001*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0082\u0010¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/squareup/workflow1/ui/androidx/WorkflowAndroidXSupport;", "", "()V", "lifecycleOwnerFromViewTreeOrContextOrNull", "Landroidx/lifecycle/LifecycleOwner;", "view", "Landroid/view/View;", "stateRegistryOwnerFromViewTreeOrContext", "Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistryOwnerFromViewTreeOrContextOrNull", "ownerOrNull", "T", "Landroid/content/Context;", "ownerClass", "Lkotlin/reflect/KClass;", "(Landroid/content/Context;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowAndroidXSupport {
    public static final WorkflowAndroidXSupport INSTANCE = new WorkflowAndroidXSupport();

    private WorkflowAndroidXSupport() {
    }

    public final LifecycleOwner lifecycleOwnerFromViewTreeOrContextOrNull(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (LifecycleOwner) ownerOrNull(context, Reflection.getOrCreateKotlinClass(LifecycleOwner.class));
    }

    public final SavedStateRegistryOwner stateRegistryOwnerFromViewTreeOrContext(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        SavedStateRegistryOwner savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContextOrNull = stateRegistryOwnerFromViewTreeOrContextOrNull(view);
        if (savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContextOrNull != null) {
            return savedStateRegistryOwnerStateRegistryOwnerFromViewTreeOrContextOrNull;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ", view).toString());
    }

    private final SavedStateRegistryOwner stateRegistryOwnerFromViewTreeOrContextOrNull(View view) {
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(view);
        if (savedStateRegistryOwner != null) {
            return savedStateRegistryOwner;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (SavedStateRegistryOwner) ownerOrNull(context, Reflection.getOrCreateKotlinClass(SavedStateRegistryOwner.class));
    }

    private final <T> T ownerOrNull(Context context, KClass<T> kClass) {
        while (!kClass.isInstance(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) KClasses.cast(kClass, context);
    }
}
