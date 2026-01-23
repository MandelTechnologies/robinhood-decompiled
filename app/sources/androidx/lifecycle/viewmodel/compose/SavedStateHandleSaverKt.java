package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.core.os.Bundle2;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: SavedStateHandleSaver.android.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\"\u0004\b\u0000\u0010\u00032\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u0001H\u0002\u001ai\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00030\b0\u0007\"\u0004\b\u0000\u0010\u0003\"\u000e\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0007¢\u0006\u0002\b\u000e\u001aX\u0010\u0006\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u0002H\u00030\u000f0\u0007\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007\u001aI\u0010\u0006\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00030\rH\u0007¢\u0006\u0002\u0010\u0013\u001aJ\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\rH\u0007¨\u0006\u0014"}, m3636d2 = {"mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", "T", "", "inner", "saveable", "Lkotlin/properties/PropertyDelegateProvider;", "Lkotlin/properties/ReadWriteProperty;", "M", "Landroidx/lifecycle/SavedStateHandle;", "stateSaver", "init", "Lkotlin/Function0;", "saveableMutableState", "Lkotlin/properties/ReadOnlyProperty;", "saver", "key", "", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Landroidx/compose/runtime/saveable/Saver;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lifecycle-viewmodel-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SavedStateHandleSaverKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object value, Object obj, KProperty kProperty) {
        Intrinsics.checkNotNullParameter(value, "$value");
        Intrinsics.checkNotNullParameter(kProperty, "<anonymous parameter 1>");
        return value;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            saver = Saver2.autoSaver();
        }
        return m8228saveable(savedStateHandle, str, saver, function0);
    }

    @SavedStateHandleSaveableApi
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m8228saveable(SavedStateHandle savedStateHandle, String key, final Saver<T, ? extends Object> saver, Function0<? extends T> init) {
        final T tInvoke;
        Object obj;
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get("value")) == null || (tInvoke = saver.restore(obj)) == null) {
            tInvoke = init.invoke();
        }
        savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda1
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return SavedStateHandleSaverKt.saveable$lambda$1(saver, tInvoke);
            }
        });
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object value) {
        Intrinsics.checkNotNullParameter(saver, "$saver");
        Intrinsics.checkNotNullParameter(value, "$value");
        return Bundle2.bundleOf(Tuples4.m3642to("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.INSTANCE), value)));
    }

    @SavedStateHandleSaveableApi
    public static final <T> SnapshotState<T> saveable(SavedStateHandle savedStateHandle, String key, Saver<T, ? extends Object> stateSaver, Function0<? extends SnapshotState<T>> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return (SnapshotState) m8228saveable(savedStateHandle, key, mutableStateSaver(stateSaver), (Function0) init);
    }

    public static /* synthetic */ Interfaces saveable$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = Saver2.autoSaver();
        }
        return saveable(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    public static final <T> Interfaces<Object, Interfaces2<Object, T>> saveable(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> saver, final Function0<? extends T> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(saver, "saver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new Interfaces() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda0
            @Override // kotlin.properties.Interfaces
            public final Object provideDelegate(Object obj, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$3(savedStateHandle, saver, init, obj, kProperty);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interfaces2 saveable$lambda$3(SavedStateHandle this_saveable, Saver saver, Function0 init, Object obj, KProperty property) {
        String str;
        Intrinsics.checkNotNullParameter(this_saveable, "$this_saveable");
        Intrinsics.checkNotNullParameter(saver, "$saver");
        Intrinsics.checkNotNullParameter(init, "$init");
        Intrinsics.checkNotNullParameter(property, "property");
        if (obj != null) {
            str = Reflection.getOrCreateKotlinClass(obj.getClass()).getQualifiedName() + '.';
        } else {
            str = "";
        }
        final Object objM8228saveable = m8228saveable(this_saveable, str + property.getName(), (Saver<Object, ? extends Object>) saver, (Function0<? extends Object>) init);
        return new Interfaces2() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda3
            @Override // kotlin.properties.Interfaces2
            public final Object getValue(Object obj2, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(objM8228saveable, obj2, kProperty);
            }
        };
    }

    public static /* synthetic */ Interfaces saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            saver = Saver2.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    @JvmName
    public static final <T, M extends SnapshotState<T>> Interfaces<Object, Interfaces3<Object, T>> saveableMutableState(final SavedStateHandle savedStateHandle, final Saver<T, ? extends Object> stateSaver, final Function0<? extends M> init) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "<this>");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        return new Interfaces() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$$ExternalSyntheticLambda2
            @Override // kotlin.properties.Interfaces
            public final Object provideDelegate(Object obj, KProperty kProperty) {
                return SavedStateHandleSaverKt.saveable$lambda$4(savedStateHandle, stateSaver, init, obj, kProperty);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Interfaces3 saveable$lambda$4(SavedStateHandle this_saveable, Saver stateSaver, Function0 init, Object obj, KProperty property) {
        String str;
        Intrinsics.checkNotNullParameter(this_saveable, "$this_saveable");
        Intrinsics.checkNotNullParameter(stateSaver, "$stateSaver");
        Intrinsics.checkNotNullParameter(init, "$init");
        Intrinsics.checkNotNullParameter(property, "property");
        if (obj != null) {
            str = Reflection.getOrCreateKotlinClass(obj.getClass()).getQualifiedName() + '.';
        } else {
            str = "";
        }
        final SnapshotState snapshotStateSaveable = saveable(this_saveable, str + property.getName(), stateSaver, init);
        return new Interfaces3<Object, T>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            @Override // kotlin.properties.Interfaces3, kotlin.properties.Interfaces2
            public T getValue(Object thisRef, KProperty<?> property2) {
                Intrinsics.checkNotNullParameter(property2, "property");
                return snapshotStateSaveable.getValue();
            }

            @Override // kotlin.properties.Interfaces3
            public void setValue(Object thisRef, KProperty<?> property2, T value) {
                Intrinsics.checkNotNullParameter(property2, "property");
                snapshotStateSaveable.setValue(value);
            }
        };
    }

    private static final <T> Saver<SnapshotState<T>, SnapshotState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return Saver2.Saver(new Function2<Saver5, SnapshotState<T>, SnapshotState<Object>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final SnapshotState<Object> invoke(Saver5 Saver, SnapshotState<T> state) {
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(state, "state");
                if (!(state instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object objSave = saver.save(Saver, state.getValue());
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) state).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(objSave, policy);
            }
        }, new Function1<SnapshotState<Object>, SnapshotState<T>>() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SnapshotState<T> invoke(SnapshotState<Object> it) {
                T tRestore;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (it.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = it.getValue();
                    Intrinsics.checkNotNull(value);
                    tRestore = saver2.restore(value);
                } else {
                    tRestore = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) it).getPolicy();
                Intrinsics.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5?>");
                SnapshotState<T> snapshotStateMutableStateOf = SnapshotStateKt.mutableStateOf(tRestore, policy);
                Intrinsics.checkNotNull(snapshotStateMutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver$lambda$5>");
                return snapshotStateMutableStateOf;
            }
        });
    }
}
