package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtil;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.storage4;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl, reason: use source file name */
/* loaded from: classes21.dex */
public final class JavaNullabilityAnnotationSettings3<T> implements JavaNullabilityAnnotationSettings2<T> {

    /* renamed from: cache, reason: collision with root package name */
    private final storage4<FqName, T> f10748cache;
    private final Map<FqName, T> states;
    private final LockBasedStorageManager storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNullabilityAnnotationSettings3(Map<FqName, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.states = states;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Java nullability annotation states");
        this.storageManager = lockBasedStorageManager;
        storage4<FqName, T> storage4VarCreateMemoizedFunctionWithNullableValues = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$$Lambda$0
            private final JavaNullabilityAnnotationSettings3 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return JavaNullabilityAnnotationSettings3.cache$lambda$0(this.arg$0, (FqName) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(storage4VarCreateMemoizedFunctionWithNullableValues, "createMemoizedFunctionWithNullableValues(...)");
        this.f10748cache = storage4VarCreateMemoizedFunctionWithNullableValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object cache$lambda$0(JavaNullabilityAnnotationSettings3 javaNullabilityAnnotationSettings3, FqName fqName) {
        Intrinsics.checkNotNull(fqName);
        return FqNamesUtil.findValueForMostSpecificFqname(fqName, javaNullabilityAnnotationSettings3.states);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettings2
    public T get(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (T) this.f10748cache.invoke(fqName);
    }
}
