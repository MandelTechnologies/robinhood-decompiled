package com.robinhood.android.common.p088ui;

import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: BindResources.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/StringProperty;", "T", "Lcom/robinhood/android/common/ui/Lazy;", "", "string", "", "resProvider", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final class StringProperty<T> extends Lazy<T, String> {
    private final Function1<T, Resources> resProvider;
    private final int string;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StringProperty(final int i, final Function1<? super T, ? extends Resources> resProvider) {
        super(new Function2() { // from class: com.robinhood.android.common.ui.StringProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringProperty._init_$lambda$0(resProvider, i, obj, (KProperty) obj2);
            }
        });
        Intrinsics.checkNotNullParameter(resProvider, "resProvider");
        this.string = i;
        this.resProvider = resProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function1 function1, int i, Object obj, KProperty kProperty) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        String string2 = ((Resources) function1.invoke(obj)).getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
