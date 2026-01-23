package com.robinhood.utils.extensions;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: Relays.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a@\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u0002H\u0001H\u0086\u0002¢\u0006\u0002\u0010\u000b\u001aB\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\f0\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0087\u0002¢\u0006\u0004\b\r\u0010\u0007\u001aJ\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\f0\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u0001H\u0001H\u0087\u0002¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"getValue", "T", "", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "Lcom/robinhood/utils/Optional;", "getValueOfOptional", "setValueOfOptional", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.RelaysKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Relays {
    public static final <T> T getValue(BehaviorRelay<T> behaviorRelay, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        T value = behaviorRelay.getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    public static final <T> void setValue(BehaviorRelay<T> behaviorRelay, Object obj, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        behaviorRelay.accept(value);
    }

    @JvmName
    public static final <T> T getValueOfOptional(BehaviorRelay<Optional<T>> behaviorRelay, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        Optional<T> value = behaviorRelay.getValue();
        if (value != null) {
            return value.getOrNull();
        }
        return null;
    }

    @JvmName
    public static final <T> void setValueOfOptional(BehaviorRelay<Optional<T>> behaviorRelay, Object obj, KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        behaviorRelay.accept(Optional3.asOptional(t));
    }
}
