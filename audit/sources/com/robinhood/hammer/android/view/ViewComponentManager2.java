package com.robinhood.hammer.android.view;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ViewComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"baseContexts", "Lkotlin/sequences/Sequence;", "Landroid/content/Context;", "runtime_release"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.hammer.android.view.ViewComponentManagerKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class ViewComponentManager2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence<Context> baseContexts(Context context) {
        return SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: com.robinhood.hammer.android.view.ViewComponentManagerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ViewComponentManager2.baseContexts$lambda$0((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context baseContexts$lambda$0(Context next) {
        Intrinsics.checkNotNullParameter(next, "next");
        ContextWrapper contextWrapper = next instanceof ContextWrapper ? (ContextWrapper) next : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }
}
