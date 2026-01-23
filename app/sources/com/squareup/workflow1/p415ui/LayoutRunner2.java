package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutRunner.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006*F\b\u0007\u0010\n\u001a\u0004\b\u0000\u0010\u0007\"\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b2\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¨\u0006\u000b"}, m3636d2 = {"Landroid/content/Context;", "Landroid/view/ViewGroup;", "container", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "viewBindingLayoutInflater", "(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;", "BindingT", "Lkotlin/Function3;", "", "ViewBindingInflater", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.LayoutRunnerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LayoutRunner2 {
    public static final LayoutInflater viewBindingLayoutInflater(Context context, ViewGroup viewGroup) {
        Context context2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        return LayoutInflater.from(context2).cloneInContext(context);
    }
}
