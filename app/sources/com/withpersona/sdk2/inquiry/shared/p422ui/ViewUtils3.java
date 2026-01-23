package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: ViewUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0002¨\u0006\b"}, m3636d2 = {"addOneShotPreDrawListenerAndDiscardFrame", "", "Landroid/view/View;", "onPreDraw", "Lkotlin/Function0;", "setAccessibilityFocus", "getAllChildren", "", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.ViewUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ViewUtils3 {
    public static final void addOneShotPreDrawListenerAndDiscardFrame(View view, final Function0<Unit> onPreDraw) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onPreDraw, "onPreDraw");
        OneShotPreDrawListenerWithDiscardedFrame.INSTANCE.add(view, new Runnable() { // from class: com.withpersona.sdk2.inquiry.shared.ui.ViewUtilsKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                onPreDraw.invoke();
            }
        });
    }

    public static final void setAccessibilityFocus(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.sendAccessibilityEvent(32768);
    }

    public static final List<View> getAllChildren(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(view);
        while (!linkedList.isEmpty()) {
            Object objPollLast = linkedList.pollLast();
            if (objPollLast == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            View view2 = (View) objPollLast;
            if (view2 instanceof ViewGroup) {
                Iterator it = CollectionsKt.reversed(SequencesKt.toList(ViewGroup2.getChildren((ViewGroup) view2))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!Intrinsics.areEqual(view2, view)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }
}
