package com.robinhood.android.common.util.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Contexts.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0007¨\u0006\n"}, m3636d2 = {"showSimpleDialog", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "messageId", "", "getThemeDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "id", "requireBaseActivityBaseContext", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.ContextsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class Contexts7 {
    public static final void showSimpleDialog(BaseActivity baseActivity, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        RhDialogFragment.Builder message = RhDialogFragment.INSTANCE.create(baseActivity).setMessage(i, new Object[0]);
        FragmentManager supportFragmentManager = baseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message, supportFragmentManager, "simple-message-dialog", false, 4, null);
    }

    public static final Drawable getThemeDrawable(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, i);
        if (themeAttribute != null) {
            return context.getDrawable(themeAttribute.intValue());
        }
        return null;
    }

    public static final BaseActivity requireBaseActivityBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
        BaseActivity baseActivity = appCompatActivityFindActivityBaseContext instanceof BaseActivity ? (BaseActivity) appCompatActivityFindActivityBaseContext : null;
        if (baseActivity != null) {
            return baseActivity;
        }
        throw new IllegalStateException(("Activity is not a BaseActivity: " + context).toString());
    }
}
