package com.robinhood.hammer.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.hammer.android.activity.ActivityComponentManagerHolder;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EntryPoints.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0002*\u00020\u0003¢\u0006\u0002\u0010\b\u001a\u0019\u0010\t\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0002*\u00020\n¢\u0006\u0002\u0010\u000b\u001a\u0019\u0010\f\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0002*\u00020\r¢\u0006\u0002\u0010\u000e\u001a\u0019\u0010\f\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\u0002*\u00020\u000f¢\u0006\u0002\u0010\u0010\"\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, m3636d2 = {"componentManager", "Lcom/robinhood/hammer/core/internal/ComponentManager;", "", "Landroid/app/Application;", "getComponentManager", "(Landroid/app/Application;)Lcom/robinhood/hammer/core/internal/ComponentManager;", "getComponent", "T", "(Landroid/app/Application;)Ljava/lang/Object;", "applicationEntryPoint", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "entryPoint", "Landroid/app/Activity;", "(Landroid/app/Activity;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "runtime_release"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.EntryPointsKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class EntryPoints {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ComponentManager<Object> getComponentManager(Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return ((ApplicationComponentManagerHolder) application).getComponentManager();
    }

    public static final <T> T getComponent(Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return (T) getComponentManager(application).get();
    }

    public static final <T> T applicationEntryPoint(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (T) getComponent((Application) applicationContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T entryPoint(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return (T) ((ActivityComponentManagerHolder) activity).getComponentManager().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T entryPoint(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return (T) ((FragmentComponentManagerHolder) fragment).getComponentManager().get();
    }
}
