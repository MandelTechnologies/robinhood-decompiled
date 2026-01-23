package com.robinhood.android.common.util.extensions;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.plt.contract.PltManager;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import java.util.ArrayList;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\r*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u0002\u001a\u0012\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011\u001a\u001a\u0010\u0012\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014\u001a5\u0010\u0016\u001a\u00020\r*\u00020\u00022#\b\u0004\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000\u001a\u001a\u0010\u001c\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 \u001a+\u0010!\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\"¢\u0006\u0002\u0010$\"\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0015\u0010\b\u001a\u00020\t*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, m3636d2 = {"baseActivity", "Lcom/robinhood/android/common/ui/BaseActivity;", "Landroid/view/View;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getActivityErrorHandler", "(Landroid/view/View;)Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "pltManager", "Lcom/robinhood/android/plt/contract/PltManager;", "getPltManager", "(Landroid/view/View;)Lcom/robinhood/android/plt/contract/PltManager;", "showFab", "", "hideFab", "toggleFab", "visible", "", "dispatchDrawableHotspotChangedCompat", "x", "", "y", "safeOnPreDraw", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "applyError", "response", "Lcom/robinhood/models/api/ErrorResponse;", "fieldName", "", "applyErrors", "", "fieldNames", "([Landroid/view/View;Lcom/robinhood/models/api/ErrorResponse;[Ljava/lang/String;)V", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class Views {
    public static final BaseActivity baseActivity(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        Intrinsics.checkNotNull(appCompatActivityRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.android.common.ui.BaseActivity");
        return (BaseActivity) appCompatActivityRequireActivityBaseContext;
    }

    public static final ActivityErrorHandler getActivityErrorHandler(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return baseActivity(view).getActivityErrorHandler();
    }

    public static final PltManager getPltManager(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return baseActivity(view).getPltManager();
    }

    public static final void showFab(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(true);
        view.animate().cancel();
        if (view.getVisibility() != 0) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            view.setAlpha(0.0f);
            view.setVisibility(0);
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new LinearOutSlowInInterpolator());
    }

    public static final void hideFab(final View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setEnabled(false);
        if (view.getVisibility() == 0) {
            view.animate().cancel();
            Intrinsics.checkNotNull(view.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setInterpolator(new FastOutLinearInInterpolator()).withEndAction(new Runnable() { // from class: com.robinhood.android.common.util.extensions.Views.hideFab.1
                @Override // java.lang.Runnable
                public final void run() {
                    view.setVisibility(8);
                }
            }));
        } else {
            view.setVisibility(8);
        }
    }

    public static final void toggleFab(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            showFab(view);
        } else {
            hideFab(view);
        }
    }

    public static final void dispatchDrawableHotspotChangedCompat(View view, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.dispatchDrawableHotspotChanged(f, f2);
    }

    public static final void safeOnPreDraw(final View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.robinhood.android.common.util.extensions.Views.safeOnPreDraw.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.TRUE)) {
                    action.invoke(view);
                }
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                    return true;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        });
    }

    public static final void applyError(View view, ErrorResponse response, String fieldName) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        String fieldError = response.getFieldError(fieldName);
        if (view instanceof EditText) {
            ((EditText) view).setError(fieldError);
            return;
        }
        if (view instanceof TextInputLayout) {
            ((TextInputLayout) view).setError(fieldError);
        } else if (view instanceof RdsTextInputContainerView) {
            ((RdsTextInputContainerView) view).setErrorText(fieldError);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(view);
            throw new ExceptionsH();
        }
    }

    public static final void applyErrors(View[] viewArr, ErrorResponse response, String[] fieldNames) {
        Intrinsics.checkNotNullParameter(viewArr, "<this>");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(fieldNames, "fieldNames");
        if (viewArr.length != fieldNames.length) {
            throw new IllegalStateException("field names and views must match!");
        }
        int iMin = Math.min(viewArr.length, fieldNames.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            applyError(viewArr[i], response, fieldNames[i]);
            arrayList.add(Unit.INSTANCE);
        }
    }
}
