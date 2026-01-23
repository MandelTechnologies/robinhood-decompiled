package com.robinhood.android.common.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: KeyboardVisibility.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/util/KeyboardVisibility;", "", "<init>", "()V", "register", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function1;", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardVisibility {
    public static final int $stable = 0;

    public final void register(Activity activity, final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        final Rect rect = new Rect();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        final Ref.IntRef intRef = new Ref.IntRef();
        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.common.util.KeyboardVisibility.register.1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                Intrinsics.checkNotNullParameter(v, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                intRef.element = insets.getStableInsetTop() + insets.getStableInsetBottom();
                return v.onApplyWindowInsets(insets);
            }
        });
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.common.util.KeyboardVisibility.register.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                viewGroup.getWindowVisibleDisplayFrame(rect);
                int height = viewGroup.getRootView().getHeight() - intRef.element;
                boolean z = ((float) (height - rect.height())) > ((float) height) * 0.15f;
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (z != booleanRef2.element) {
                    booleanRef2.element = z;
                    callback.invoke(Boolean.valueOf(z));
                }
            }
        });
    }
}
