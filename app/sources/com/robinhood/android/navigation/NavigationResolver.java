package com.robinhood.android.navigation;

import com.robinhood.android.navigation.NavigationResolver;
import com.robinhood.hammer.android.RequiresHammerPlugin;
import com.robinhood.hammer.core.internal.InternalHammerApi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: NavigationResolver.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/NavigationResolver;", "Lcom/robinhood/hammer/android/RequiresHammerPlugin;", "Companion", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/IntentResolver;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface NavigationResolver extends RequiresHammerPlugin {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: NavigationResolver.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/navigation/NavigationResolver$Companion;", "", "<init>", "()V", "lazyGetter", "Lkotlin/Function0;", "Lcom/robinhood/android/navigation/NavigationResolver;", "className", "", "fieldName", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @InternalHammerApi
        public final Function0<NavigationResolver> lazyGetter(final String className, final String fieldName) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            final Lazy lazy = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.navigation.NavigationResolver$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavigationResolver.Companion.lazyGetter$lambda$0(className, fieldName);
                }
            });
            return new PropertyReference0Impl(lazy) { // from class: com.robinhood.android.navigation.NavigationResolver$Companion$lazyGetter$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((Lazy) this.receiver).getValue();
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NavigationResolver lazyGetter$lambda$0(String str, String str2) throws IllegalAccessException, IllegalArgumentException {
            Object obj = Class.forName(str).getDeclaredField(str2).get(null);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.robinhood.android.navigation.NavigationResolver");
            return (NavigationResolver) obj;
        }
    }
}
