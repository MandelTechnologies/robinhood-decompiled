package com.robinhood.android.common.p088ui.style;

import android.animation.Animator;
import android.app.Activity;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.scarlet.transition.ThemeTransition;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaskDescriptionColorTransition.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J*\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J2\u0010\u0015\u001a\u00020\u00142\n\u0010\u0016\u001a\u00060\u0017R\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/ui/style/TaskDescriptionColorTransition;", "Lcom/robinhood/scarlet/transition/ThemeTransition;", "Landroid/app/Activity;", "<init>", "()V", "typedValue", "Landroid/util/TypedValue;", "receiverType", "Ljava/lang/Class;", "getReceiverType", "()Ljava/lang/Class;", "createAnimator", "Landroid/animation/Animator;", "view", "properties", "Lcom/robinhood/scarlet/util/ElementProperties;", "previousThemeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "newThemeNode", "applyTo", "", "loadValues", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class TaskDescriptionColorTransition implements ThemeTransition<Activity> {
    public static final TaskDescriptionColorTransition INSTANCE = new TaskDescriptionColorTransition();
    private static final TypedValue typedValue = new TypedValue();
    private static final Class<Activity> receiverType = Activity.class;
    public static final int $stable = 8;

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(outValues, "outValues");
    }

    private TaskDescriptionColorTransition() {
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Class<? super Activity> getReceiverType() {
        return receiverType;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public Animator createAnimator(Activity view, ElementProperties properties, ThemeNode previousThemeNode, ThemeNode newThemeNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(previousThemeNode, "previousThemeNode");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        applyTo(view, properties, newThemeNode);
        return null;
    }

    @Override // com.robinhood.scarlet.transition.ThemeTransition
    public void applyTo(Activity view, ElementProperties properties, ThemeNode newThemeNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(newThemeNode, "newThemeNode");
        BaseActivity baseActivity = (BaseActivity) view;
        int i = C11048R.attr.taskDescriptionColor;
        TypedValue typedValue2 = typedValue;
        if (newThemeNode.resolveAttribute(i, typedValue2, true)) {
            baseActivity.updateTaskDescription(typedValue2.data);
        }
    }
}
