package com.robinhood.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Optional.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/Optional;", "T", "", "<init>", "()V", "component1", "()Ljava/lang/Object;", "getOrNull", "Companion", "Lcom/robinhood/utils/None;", "Lcom/robinhood/utils/Some;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class Optional<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Optional(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    /* renamed from: of */
    public static final <T> Optional<T> m2971of(T t) {
        return INSTANCE.m2972of(t);
    }

    public abstract T getOrNull();

    private Optional() {
    }

    public T component1() {
        return getOrNull();
    }

    /* compiled from: Optional.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/Optional$Companion;", "", "<init>", "()V", "of", "Lcom/robinhood/utils/Optional;", "T", "value", "(Ljava/lang/Object;)Lcom/robinhood/utils/Optional;", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: of */
        public final <T> Optional<T> m2972of(T value) {
            if (value == null) {
                return Optional2.INSTANCE;
            }
            return new Optional4(value);
        }
    }
}
