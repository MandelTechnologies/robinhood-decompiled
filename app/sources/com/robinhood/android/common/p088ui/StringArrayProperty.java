package com.robinhood.android.common.p088ui;

import android.content.res.Resources;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: BindResources.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002B%\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/StringArrayProperty;", "T", "Lcom/robinhood/android/common/ui/Lazy;", "", "", ResourceTypes.ARRAY, "", "resProvider", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "<init>", "(ILkotlin/jvm/functions/Function1;)V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
final class StringArrayProperty<T> extends Lazy<T, String[]> {
    private final int array;
    private final Function1<T, Resources> resProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayProperty(final int i, final Function1<? super T, ? extends Resources> resProvider) {
        super(new Function2() { // from class: com.robinhood.android.common.ui.StringArrayProperty$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringArrayProperty._init_$lambda$0(resProvider, i, obj, (KProperty) obj2);
            }
        });
        Intrinsics.checkNotNullParameter(resProvider, "resProvider");
        this.array = i;
        this.resProvider = resProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] _init_$lambda$0(Function1 function1, int i, Object obj, KProperty kProperty) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(kProperty, "<unused var>");
        String[] stringArray = ((Resources) function1.invoke(obj)).getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return stringArray;
    }
}
