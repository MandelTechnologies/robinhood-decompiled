package com.robinhood.android.common.p088ui;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BindSavedState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00050\u0004B7\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0012\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R&\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BindDelegateProvider;", "R", "", "T", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadWriteProperty;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "defaultValue", "put", "Lkotlin/Function3;", "Landroid/os/Bundle;", "", "", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Ljava/lang/Object;", "provideDelegate", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.BindDelegateProvider, reason: use source file name */
/* loaded from: classes17.dex */
final class BindSavedState<R, T> implements Interfaces<R, Interfaces3<? super R, T>> {
    private final T defaultValue;
    private final Function3<Bundle, String, T, Unit> put;
    private final SavedStateRegistry savedStateRegistry;

    /* JADX WARN: Multi-variable type inference failed */
    public BindSavedState(SavedStateRegistry savedStateRegistry, T t, Function3<? super Bundle, ? super String, ? super T, Unit> put) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(put, "put");
        this.savedStateRegistry = savedStateRegistry;
        this.defaultValue = t;
        this.put = put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.Interfaces
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, KProperty kProperty) {
        return provideDelegate((BindSavedState<R, T>) obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.Interfaces
    public Interfaces3<R, T> provideDelegate(R thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return new BindSavedState3(thisRef.getClass().getName() + "." + property.getName(), this.savedStateRegistry, this.defaultValue, this.put);
    }
}
