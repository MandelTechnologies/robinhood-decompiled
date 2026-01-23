package com.robinhood.scarlet.property;

import android.util.Property;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty4;

/* compiled from: StyleableProperty.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u001dBa\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b¢\u0006\u0002\b\t\u0012!\u0010\n\u001a\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b¢\u0006\u0002\b\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00018\u0001H\u0096\u0002¢\u0006\u0002\u0010\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\n\u001a\u001d\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b¢\u0006\u0002\b\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/scarlet/property/StyleableProperty;", "T", "", "V", "Landroid/util/Property;", "receiverType", "Ljava/lang/Class;", "getValue", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setValue", "Lkotlin/Function2;", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lcom/robinhood/scarlet/property/StyleProperty;)V", "getReceiverType", "()Ljava/lang/Class;", "getStyleProperty", "()Lcom/robinhood/scarlet/property/StyleProperty;", "isReadOnly", "", "get", "obj", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class StyleableProperty<T, V> extends Property<T, V> {
    private final Function1<T, V> getValue;
    private final Class<T> receiverType;
    private final Function2<T, V, Object> setValue;
    private final StyleProperty<V> styleProperty;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // android.util.Property
    public boolean isReadOnly() {
        return false;
    }

    public final Class<T> getReceiverType() {
        return this.receiverType;
    }

    public final StyleProperty<V> getStyleProperty() {
        return this.styleProperty;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StyleableProperty(Class<T> receiverType, Function1<? super T, ? extends V> getValue, Function2<? super T, ? super V, ? extends Object> setValue, StyleProperty<V> styleProperty) {
        super(styleProperty.getResourceType().getJavaType(), styleProperty.getName());
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        Intrinsics.checkNotNullParameter(setValue, "setValue");
        Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
        this.receiverType = receiverType;
        this.getValue = getValue;
        this.setValue = setValue;
        this.styleProperty = styleProperty;
    }

    @Override // android.util.Property
    public V get(T obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return this.getValue.invoke(obj);
    }

    @Override // android.util.Property
    public void set(T obj, V value) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        this.setValue.invoke(obj, value);
    }

    /* compiled from: StyleableProperty.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\n\b\u0002\u0010\u0006\u0018\u0001*\u00020\u0001\"\n\b\u0003\u0010\u0007\u0018\u0001*\u00020\u00012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH\u0086\bJX\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0001\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r2\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bJ|\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\n\b\u0002\u0010\u0006\u0018\u0001*\u00020\u0001\"\b\b\u0003\u0010\u0007*\u00020\u00012\u001b\b\b\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u000f¢\u0006\u0002\b\u00102!\b\b\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH\u0086\bø\u0001\u0000J~\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0001\"\b\b\u0003\u0010\u0007*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\r2\u0019\u0010\u000e\u001a\u0015\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u000f¢\u0006\u0002\b\u00102\u001f\u0010\u0011\u001a\u001b\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0002\b\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/scarlet/property/StyleableProperty$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/scarlet/property/StyleableProperty;", "T", "V", "kProperty", "Lkotlin/reflect/KMutableProperty1;", "styleProperty", "Lcom/robinhood/scarlet/property/StyleProperty;", "receiverType", "Ljava/lang/Class;", "getValue", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setValue", "Lkotlin/Function2;", "", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ <T, V> StyleableProperty<T, V> from(KProperty4<T, V> kProperty, StyleProperty<V> styleProperty) {
            Intrinsics.checkNotNullParameter(kProperty, "kProperty");
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            Intrinsics.reifiedOperationMarker(4, "T");
            return from(Object.class, kProperty, styleProperty);
        }

        public final <T, V> StyleableProperty<T, V> from(Class<T> receiverType, KProperty4<T, V> kProperty, StyleProperty<V> styleProperty) {
            Intrinsics.checkNotNullParameter(receiverType, "receiverType");
            Intrinsics.checkNotNullParameter(kProperty, "kProperty");
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            return from(receiverType, new StyleableProperty2(kProperty), new StyleableProperty3(kProperty), styleProperty);
        }

        public final /* synthetic */ <T, V> StyleableProperty<T, V> from(Function1<? super T, ? extends V> getValue, Function2<? super T, ? super V, Unit> setValue, StyleProperty<V> styleProperty) {
            Intrinsics.checkNotNullParameter(getValue, "getValue");
            Intrinsics.checkNotNullParameter(setValue, "setValue");
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            Intrinsics.reifiedOperationMarker(4, "T");
            return from(Object.class, getValue, setValue, styleProperty);
        }

        public final <T, V> StyleableProperty<T, V> from(Class<T> receiverType, Function1<? super T, ? extends V> getValue, Function2<? super T, ? super V, Unit> setValue, StyleProperty<V> styleProperty) {
            Intrinsics.checkNotNullParameter(receiverType, "receiverType");
            Intrinsics.checkNotNullParameter(getValue, "getValue");
            Intrinsics.checkNotNullParameter(setValue, "setValue");
            Intrinsics.checkNotNullParameter(styleProperty, "styleProperty");
            return new StyleableProperty<>(receiverType, getValue, setValue, styleProperty);
        }
    }
}
