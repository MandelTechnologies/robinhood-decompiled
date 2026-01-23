package com.robinhood.android.common.p088ui;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BindSavedState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00028\u0001\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0014\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018J*\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u00002\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R&\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BindSavedStateProperty;", "R", "", "T", "Lkotlin/properties/ReadWriteProperty;", "key", "", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "defaultValue", "put", "Lkotlin/Function3;", "Landroid/os/Bundle;", "", "<init>", "(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Ljava/lang/Object;", "value", "isProviderInitialized", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "initSavedStateProvider", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.BindSavedStateProperty, reason: use source file name */
/* loaded from: classes17.dex */
final class BindSavedState3<R, T> implements Interfaces3<R, T> {
    private final T defaultValue;
    private boolean isProviderInitialized;
    private final String key;
    private final Function3<Bundle, String, T, Unit> put;
    private final SavedStateRegistry savedStateRegistry;
    private T value;

    /* JADX WARN: Multi-variable type inference failed */
    public BindSavedState3(String key, SavedStateRegistry savedStateRegistry, T t, Function3<? super Bundle, ? super String, ? super T, Unit> put) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(put, "put");
        this.key = key;
        this.savedStateRegistry = savedStateRegistry;
        this.defaultValue = t;
        this.put = put;
    }

    @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
    public T getValue(R thisRef, KProperty<?> property) {
        Bundle bundleConsumeRestoredStateForKey;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        initSavedStateProvider();
        if (this.value == null) {
            T t = null;
            if (this.savedStateRegistry.getIsRestored() && (bundleConsumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey(this.key)) != null) {
                t = (T) bundleConsumeRestoredStateForKey.get(this.key);
            }
            this.value = t;
            if (t == null) {
                this.value = this.defaultValue;
            }
        }
        return this.value;
    }

    @Override // kotlin.properties.Interfaces3
    public void setValue(R thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        initSavedStateProvider();
        this.value = value;
    }

    private final void initSavedStateProvider() {
        if (this.isProviderInitialized) {
            return;
        }
        this.isProviderInitialized = true;
        this.savedStateRegistry.registerSavedStateProvider(this.key, new SavedStateRegistry.SavedStateProvider(this) { // from class: com.robinhood.android.common.ui.BindSavedStateProperty.initSavedStateProvider.1
            final /* synthetic */ BindSavedState3<R, T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle bundle = new Bundle();
                BindSavedState3<R, T> bindSavedState3 = this.this$0;
                if (((BindSavedState3) bindSavedState3).value != null) {
                    Function3 function3 = ((BindSavedState3) bindSavedState3).put;
                    String str = ((BindSavedState3) bindSavedState3).key;
                    Object obj = ((BindSavedState3) bindSavedState3).value;
                    Intrinsics.checkNotNull(obj);
                    function3.invoke(bundle, str, obj);
                }
                return bundle;
            }
        });
    }
}
