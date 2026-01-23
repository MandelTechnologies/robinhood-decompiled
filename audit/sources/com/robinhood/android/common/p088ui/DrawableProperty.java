package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: BindResources.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/DrawableProperty;", "T", "Lcom/robinhood/android/common/ui/Lazy;", "Landroid/graphics/drawable/Drawable;", ResourceTypes.DRAWABLE, "", "contextProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final class DrawableProperty<T> extends Lazy<T, Drawable> {
    private final Function1<T, Context> contextProvider;
    private final int drawable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawableProperty(final int i, final Function1<? super T, ? extends Context> contextProvider) {
        super(new Function2() { // from class: com.robinhood.android.common.ui.DrawableProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DrawableProperty._init_$lambda$0(contextProvider, i, obj, (KProperty) obj2);
            }
        });
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.drawable = i;
        this.contextProvider = contextProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable _init_$lambda$0(Function1 function1, int i, Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        Drawable drawable = ((Context) function1.invoke(obj)).getDrawable(i);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }
}
