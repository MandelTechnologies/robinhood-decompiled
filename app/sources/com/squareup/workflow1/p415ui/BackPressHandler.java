package com.squareup.workflow1.p415ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.view.OnBackPressedDispatcherOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackPressHandler.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\u0010¢\u0006\u0004\b\u0002\u0010\u0003\"J\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007*\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\" \u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012*\u0018\b\u0007\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0016"}, m3636d2 = {"Landroid/content/Context;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "onBackPressedDispatcherOwnerOrNull", "(Landroid/content/Context;)Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroid/view/View;", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "value", "getBackPressedHandler", "(Landroid/view/View;)Lkotlin/jvm/functions/Function0;", "setBackPressedHandler", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "getBackPressedHandler$annotations", "(Landroid/view/View;)V", "backPressedHandler", "Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "getHandlerWrapperOrNull", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "getHandlerWrapperOrNull$annotations", "handlerWrapperOrNull", "BackPressHandler", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.BackPressHandlerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BackPressHandler {
    public static final void setBackPressedHandler(View view, Function0<Unit> function0) {
        BackPressHandler2 backPressHandler2;
        Intrinsics.checkNotNullParameter(view, "<this>");
        BackPressHandler2 handlerWrapperOrNull = getHandlerWrapperOrNull(view);
        if (handlerWrapperOrNull != null) {
            handlerWrapperOrNull.stop();
        }
        if (function0 == null) {
            backPressHandler2 = null;
        } else {
            BackPressHandler2 backPressHandler22 = new BackPressHandler2(view, function0);
            backPressHandler22.start();
            backPressHandler2 = backPressHandler22;
        }
        view.setTag(R$id.view_back_handler, backPressHandler2);
    }

    private static final BackPressHandler2 getHandlerWrapperOrNull(View view) {
        return (BackPressHandler2) view.getTag(R$id.view_back_handler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.Context] */
    public static final OnBackPressedDispatcherOwner onBackPressedDispatcherOwnerOrNull(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (!(context instanceof OnBackPressedDispatcherOwner)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == 0) {
                return null;
            }
        }
        return (OnBackPressedDispatcherOwner) context;
    }
}
