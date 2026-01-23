package com.robinhood.utils.dagger;

import com.plaid.internal.EnumC7081g;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Lazy.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0086\n¢\u0006\u0002\u0010\u0007\u001a$\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\n\u001a,\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\fH\u0086\bø\u0001\u0000\u001a,\u0010\r\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086H¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, m3636d2 = {"getValue", "T", "", "Ldagger/Lazy;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ldagger/Lazy;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "daggerLazy", "provider", "Ldagger/internal/Provider;", "initializer", "Lkotlin/Function0;", "coGet", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class LazyKt {

    /* compiled from: Lazy.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.robinhood.utils.dagger.LazyKt", m3645f = "Lazy.kt", m3646l = {34}, m3647m = "coGet")
    /* renamed from: com.robinhood.utils.dagger.LazyKt$coGet$1 */
    /* loaded from: classes12.dex */
    static final class C418751<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C418751(Continuation<? super C418751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyKt.coGet(null, null, this);
        }
    }

    public static final <T> T getValue(Lazy<T> lazy, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = lazy.get();
        Intrinsics.checkNotNullExpressionValue(t, "get(...)");
        return t;
    }

    public static final <T> Lazy<T> daggerLazy(Provider<T> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Lazy<T> lazy = DoubleCheck.lazy((Provider) provider);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return lazy;
    }

    public static final <T> Lazy<T> daggerLazy(final Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return daggerLazy(new Provider() { // from class: com.robinhood.utils.dagger.LazyKt.daggerLazy.1
            @Override // javax.inject.Provider
            public final T get() {
                return initializer.invoke();
            }
        });
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Lazy.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0007H\u0001¢\u0006\u0002\b\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0003*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "T", "Lkotlin/jvm/internal/EnhancedNullability;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    @DebugMetadata(m3644c = "com.robinhood.utils.dagger.LazyKt$coGet$2", m3645f = "Lazy.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.dagger.LazyKt$coGet$2 */
    /* loaded from: classes12.dex */
    public static final class C418762<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Lazy<T> $this_coGet;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C418762(Lazy<T> lazy, Continuation<? super C418762> continuation) {
            super(2, continuation);
            this.$this_coGet = lazy;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C418762(this.$this_coGet, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C418762) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$this_coGet.get();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object coGet(Lazy<T> lazy, CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        C418751 c418751;
        if (continuation instanceof C418751) {
            c418751 = (C418751) continuation;
            int i = c418751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c418751.label = i - Integer.MIN_VALUE;
            } else {
                c418751 = new C418751(continuation);
            }
        }
        Object objWithContext = c418751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c418751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            C418762 c418762 = new C418762(lazy, null);
            c418751.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, c418762, c418751);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    public static /* synthetic */ Object coGet$default(Lazy lazy, CoroutineDispatcher coroutineDispatcher, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineDispatcher = Dispatchers.getDefault();
        }
        C418762 c418762 = new C418762(lazy, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, c418762, continuation);
        InlineMarker.mark(1);
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }

    private static final <T> Object coGet$$forInline(Lazy<T> lazy, CoroutineDispatcher coroutineDispatcher, Continuation<? super T> continuation) {
        C418762 c418762 = new C418762(lazy, null);
        InlineMarker.mark(0);
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, c418762, continuation);
        InlineMarker.mark(1);
        Intrinsics.checkNotNullExpressionValue(objWithContext, "withContext(...)");
        return objWithContext;
    }
}
