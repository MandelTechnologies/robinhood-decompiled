package com.robinhood.hilt;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.android.fragment.FragmentComponentManagerHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EntryPoints.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0003\u001a\u001a\u0010\u0004\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a\u001a\u0010\u0004\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0007H\u0086\b¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"applicationEntryPoint", "T", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Object;", "entryPoint", "Landroid/app/Application;", "(Landroid/app/Application;)Ljava/lang/Object;", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "lib-hilt_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.hilt.EntryPointsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class EntryPoints2 {
    public static final /* synthetic */ <T> T applicationEntryPoint(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!(context instanceof Application)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            return (T) ((ApplicationComponentManagerHolder) ((Application) applicationContext)).getComponentManager().get();
        }
        return (T) ((ApplicationComponentManagerHolder) ((Application) context)).getComponentManager().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T entryPoint(Application application) {
        Intrinsics.checkNotNullParameter(application, "<this>");
        return (T) ((ApplicationComponentManagerHolder) application).getComponentManager().get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T entryPoint(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return (T) ((FragmentComponentManagerHolder) fragment).getComponentManager().get();
    }
}
