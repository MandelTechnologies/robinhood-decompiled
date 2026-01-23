package com.robinhood.android.common.p088ui;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;

/* compiled from: BindViewDelegate.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00100\u000f\"\n\b\u0001\u0010\u0010*\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BindViewDelegate;", "T", "", "viewFinder", "Lkotlin/Function1;", "", "Landroid/view/View;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "propertyCache", "", "Lcom/robinhood/android/common/ui/BindViewProperty;", "onViewAvailable", "", "getView", "Lkotlin/properties/ReadOnlyProperty;", "V", "id", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class BindViewDelegate<T> {
    public static final int $stable = 8;
    private final Set<BindViewDelegate3<T, ?>> propertyCache;
    private final Function1<Integer, View> viewFinder;

    /* JADX WARN: Multi-variable type inference failed */
    public BindViewDelegate(Function1<? super Integer, ? extends View> viewFinder) {
        Intrinsics.checkNotNullParameter(viewFinder, "viewFinder");
        this.viewFinder = viewFinder;
        this.propertyCache = new LinkedHashSet();
    }

    public final void onViewAvailable() {
        Iterator<T> it = this.propertyCache.iterator();
        while (it.hasNext()) {
            ((BindViewDelegate3) it.next()).clear();
        }
    }

    public final <V extends View> Interfaces2<T, V> getView(final int id) {
        BindViewDelegate3<T, ?> bindViewDelegate3 = new BindViewDelegate3<>(new Function1() { // from class: com.robinhood.android.common.ui.BindViewDelegate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BindViewDelegate.getView$lambda$1(this.f$0, id, obj);
            }
        });
        this.propertyCache.add(bindViewDelegate3);
        return bindViewDelegate3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getView$lambda$1(BindViewDelegate bindViewDelegate, int i, Object obj) {
        return bindViewDelegate.viewFinder.invoke(Integer.valueOf(i));
    }
}
