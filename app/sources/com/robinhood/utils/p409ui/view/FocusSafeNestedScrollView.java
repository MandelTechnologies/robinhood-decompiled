package com.robinhood.utils.p409ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.robinhood.utils.logging.CrashReporter;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusSafeNestedScrollView.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/FocusSafeNestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/view/View;", "childToScrollTo", "getChildToScrollTo", "()Landroid/view/View;", "setChildToScrollTo", "(Landroid/view/View;)V", "requestChildFocus", "", "child", "focused", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public class FocusSafeNestedScrollView extends NestedScrollView {
    private static final Field childToScrollToField;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusSafeNestedScrollView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusSafeNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusSafeNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final View getChildToScrollTo() {
        Field field = childToScrollToField;
        return (View) (field != null ? field.get(this) : null);
    }

    private final void setChildToScrollTo(View view) throws IllegalAccessException, IllegalArgumentException {
        Field field = childToScrollToField;
        if (field != null) {
            field.set(this, view);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(focused, "focused");
        super.requestChildFocus(child, focused);
        if (Build.VERSION.SDK_INT == 26) {
            setChildToScrollTo(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Field field = null;
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("mChildToScrollTo");
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (ReflectiveOperationException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
        }
        childToScrollToField = field;
    }
}
