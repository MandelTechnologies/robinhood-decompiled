package com.robinhood.scarlet.transition;

import android.animation.Animator;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.robinhood.scarlet.util.ElementProperties;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import kotlin.Metadata;

/* compiled from: ThemeTransition.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J/\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0015R\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001aH&R\u001a\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/scarlet/transition/ThemeTransition;", "T", "", "receiverType", "Ljava/lang/Class;", "getReceiverType", "()Ljava/lang/Class;", "createAnimator", "Landroid/animation/Animator;", "view", "properties", "Lcom/robinhood/scarlet/util/ElementProperties;", "previousThemeNode", "Lcom/robinhood/scarlet/util/ThemeNode;", "newThemeNode", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;Lcom/robinhood/scarlet/util/ThemeNode;)Landroid/animation/Animator;", "applyTo", "", "(Ljava/lang/Object;Lcom/robinhood/scarlet/util/ElementProperties;Lcom/robinhood/scarlet/util/ThemeNode;)V", "loadValues", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "attributeSet", "Landroid/util/AttributeSet;", "outValues", "Landroid/util/SparseArray;", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ThemeTransition<T> {
    void applyTo(T view, ElementProperties properties, ThemeNode newThemeNode);

    Animator createAnimator(T view, ElementProperties properties, ThemeNode previousThemeNode, ThemeNode newThemeNode);

    Class<? super T> getReceiverType();

    void loadValues(Resources.Theme theme, AttributeSet attributeSet, SparseArray<? super ResourceReferences4<?>> outValues);
}
