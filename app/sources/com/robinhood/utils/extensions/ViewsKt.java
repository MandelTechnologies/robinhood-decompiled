package com.robinhood.utils.extensions;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import io.reactivex.Observable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a*\u0010%\u001a\u00020&*\u00020\u00022\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n\u001a\u0012\u0010+\u001a\u00020&*\u00020\u00022\u0006\u0010,\u001a\u00020\n\u001a\u001a\u0010+\u001a\u00020&*\u00020\u00022\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n\u001a\u0012\u0010/\u001a\u00020&*\u00020\u00022\u0006\u0010,\u001a\u00020\n\u001a\u0012\u00100\u001a\u00020&*\u00020\u00022\u0006\u0010,\u001a\u00020\n\u001a\u0014\u00101\u001a\u000202*\u00020\u00022\b\b\u0002\u00103\u001a\u000202\u001a\u0014\u00104\u001a\u000205*\u00020\u00022\b\b\u0002\u00103\u001a\u000205\u001a\u0012\u00106\u001a\u00020&*\u00020\u00022\u0006\u00107\u001a\u000208\u001a\u0014\u00109\u001a\u00020:*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a1\u00109\u001a\u00020:*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n2\u0016\u0010<\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010>0=\"\u0004\u0018\u00010>¢\u0006\u0002\u0010?\u001a\u0014\u0010@\u001a\u00020A*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a\u0014\u0010B\u001a\u000208*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a\u0016\u0010C\u001a\u00020\n*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\nH\u0007\u001a\u0014\u0010D\u001a\u00020E*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a\u0014\u0010F\u001a\u00020\n*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a\u0014\u0010G\u001a\u00020\n*\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\n\u001a\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0I*\u00020\u00022\b\b\u0002\u0010J\u001a\u00020K\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"(\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\"(\u0010\u0010\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f\"(\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f\"(\u0010\u0016\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f\"(\u0010\u0019\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f\"(\u0010\u001c\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f\"(\u0010\u001f\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000f\"(\u0010\"\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000f¨\u0006L"}, m3636d2 = {"getActivityContext", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View;", "context", "Landroid/content/Context;", "parents", "Lkotlin/sequences/Sequence;", "getParents", "(Landroid/view/View;)Lkotlin/sequences/Sequence;", "value", "", "topPadding", "getTopPadding", "(Landroid/view/View;)I", "setTopPadding", "(Landroid/view/View;I)V", "startPadding", "getStartPadding", "setStartPadding", "endPadding", "getEndPadding", "setEndPadding", "bottomPadding", "getBottomPadding", "setBottomPadding", "marginTop", "getMarginTop", "setMarginTop", "marginEnd", "getMarginEnd", "setMarginEnd", "marginStart", "getMarginStart", "setMarginStart", "marginBottom", "getMarginBottom", "setMarginBottom", "setMargins", "", "left", "top", "right", "bottom", "setPadding", "padding", "horizontal", "vertical", "setHorizontalPadding", "setVerticalPadding", "getBounds", "Landroid/graphics/Rect;", "outRect", "getBoundsF", "Landroid/graphics/RectF;", "overrideAccessibilityMessage", "message", "", "getString", "", "resId", "formatArgs", "", "", "(Landroid/view/View;I[Ljava/lang/Object;)Ljava/lang/String;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getText", "getColor", "getDimension", "", "getDimensionPixelOffset", "getDimensionPixelSize", "hideKeyboard", "Lio/reactivex/Observable;", "implicitOnly", "", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ViewsKt {
    public static final AppCompatActivity getActivityContext(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        if (context != null) {
            return getActivityContext(context);
        }
        return null;
    }

    private static final AppCompatActivity getActivityContext(Context context) {
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            return getActivityContext(baseContext);
        }
        throw new IllegalStateException(("Context is not ContextWrapper: " + context).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _get_parents_$lambda$0(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static final Sequence<View> getParents(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object parent = view.getParent();
        return kotlin.sequences.SequencesKt.generateSequence(parent instanceof View ? (View) parent : null, (Function1<? super View, ? extends View>) new Function1() { // from class: com.robinhood.utils.extensions.ViewsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewsKt._get_parents_$lambda$0((View) obj);
            }
        });
    }

    public static final int getTopPadding(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getPaddingTop();
    }

    public static final void setTopPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final int getStartPadding(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getPaddingStart();
    }

    public static final void setStartPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getLayoutDirection() == 1) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
        } else {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static final int getEndPadding(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getPaddingEnd();
    }

    public static final void setEndPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getLayoutDirection() == 1) {
            view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static final int getBottomPadding(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getPaddingBottom();
    }

    public static final void setBottomPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final int getMarginTop(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }

    public static final void setMarginTop(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final int getMarginEnd(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
    }

    public static final void setMarginEnd(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final int getMarginStart(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
    }

    public static final void setMarginStart(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final int getMarginBottom(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    public static final void setMarginBottom(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void setMargins(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i, i2, i3, i4);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void setPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final void setPadding(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, i2, i, i2);
    }

    public static final void setHorizontalPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void setVerticalPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i);
    }

    public static /* synthetic */ Rect getBounds$default(View view, Rect rect, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = new Rect();
        }
        return getBounds(view, rect);
    }

    public static final Rect getBounds(View view, Rect outRect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        outRect.left = view.getLeft();
        outRect.top = view.getTop();
        outRect.right = view.getRight();
        outRect.bottom = view.getBottom();
        return outRect;
    }

    public static /* synthetic */ RectF getBoundsF$default(View view, RectF rectF, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = new RectF();
        }
        return getBoundsF(view, rectF);
    }

    public static final RectF getBoundsF(View view, RectF outRect) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        outRect.left = view.getLeft();
        outRect.top = view.getTop();
        outRect.right = view.getRight();
        outRect.bottom = view.getBottom();
        return outRect;
    }

    public static final void overrideAccessibilityMessage(View view, final CharSequence message) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.robinhood.utils.extensions.ViewsKt.overrideAccessibilityMessage.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View v, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(v, info);
                info.setText(message);
            }
        });
    }

    public static final String getString(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        String string2 = view.getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getString(View view, int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string2 = view.getContext().getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final Drawable getDrawable(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Drawable drawable = view.getContext().getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public static final CharSequence getText(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        CharSequence text = view.getContext().getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    public static final int getColor(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getContext().getColor(i);
    }

    public static final float getDimension(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getDimension(i);
    }

    public static final int getDimensionPixelOffset(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getDimensionPixelOffset(i);
    }

    public static final int getDimensionPixelSize(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getResources().getDimensionPixelSize(i);
    }

    public static final Observable<Integer> hideKeyboard(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ContextsUiExtensions.hideKeyboard(context, view.getWindowToken(), z);
    }

    public static /* synthetic */ Observable hideKeyboard$default(View view, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return hideKeyboard(view, z);
    }
}
