package com.robinhood.android.common.p088ui;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;

/* compiled from: BindViewDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001aD\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u0002*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¨\u0006\t"}, m3636d2 = {"bindView", "Lkotlin/properties/ReadOnlyProperty;", "Landroid/view/View;", "V", "id", "", "initializer", "Lkotlin/Function1;", "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.BindViewDelegateKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BindViewDelegate2 {
    public static /* synthetic */ Interfaces2 bindView$default(View view, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return bindView(view, i, function1);
    }

    public static final <V extends View> Interfaces2<View, V> bindView(final View view, final int i, final Function1<? super V, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new BindViewDelegate3(new Function1() { // from class: com.robinhood.android.common.ui.BindViewDelegateKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindViewDelegate2.bindView$lambda$0(view, i, function1, (View) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bindView$lambda$0(View view, int i, Function1 function1, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View viewFindViewById = view.findViewById(i);
        if (function1 != null) {
            function1.invoke(viewFindViewById);
        }
        return viewFindViewById;
    }
}
