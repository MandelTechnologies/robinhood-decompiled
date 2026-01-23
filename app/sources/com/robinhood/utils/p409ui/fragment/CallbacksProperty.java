package com.robinhood.utils.p409ui.fragment;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* compiled from: CallbacksProperty.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00010\u0004B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0002¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/ui/fragment/CallbacksProperty;", "T", "", "B", "Lkotlin/properties/ReadOnlyProperty;", "callbacksClass", "Lkotlin/reflect/KClass;", "callbacksGetter", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CallbacksProperty<T, B> implements Interfaces2<B, T> {
    public static final int $stable = 8;
    private final KClass<T> callbacksClass;
    private final Function1<B, Object> callbacksGetter;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbacksProperty(KClass<T> callbacksClass, Function1<? super B, ? extends Object> callbacksGetter) {
        Intrinsics.checkNotNullParameter(callbacksClass, "callbacksClass");
        Intrinsics.checkNotNullParameter(callbacksGetter, "callbacksGetter");
        this.callbacksClass = callbacksClass;
        this.callbacksGetter = callbacksGetter;
    }

    @Override // kotlin.properties.Interfaces2
    public T getValue(B thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object objInvoke = this.callbacksGetter.invoke(thisRef);
        T t = objInvoke != null ? (T) objInvoke : null;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException((objInvoke + " does not implement " + this.callbacksClass).toString());
    }
}
