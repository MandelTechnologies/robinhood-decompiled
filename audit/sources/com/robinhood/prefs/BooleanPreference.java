package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BooleanPreference.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/prefs/BooleanPreference;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;ZLkotlinx/coroutines/CoroutineDispatcher;)V", "valueRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "changes", "Lio/reactivex/Observable;", "getChanges", "()Lio/reactivex/Observable;", "get", "coGet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "value", "coSet", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSet", AnalyticsStrings.BUTTON_LIST_DELETE, "coDelete", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class BooleanPreference {
    private final Observable<Boolean> changes;
    private final boolean defaultValue;
    private final CoroutineDispatcher ioDispatcher;
    private final String key;
    private final SharedPreferences preferences;
    private final BehaviorRelay<Boolean> valueRelay;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BooleanPreference(SharedPreferences preferences, String key) {
        this(preferences, key, false, null, 12, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BooleanPreference(SharedPreferences preferences, String key, boolean z) {
        this(preferences, key, z, null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @JvmOverloads
    public BooleanPreference(SharedPreferences preferences, String key, boolean z, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = z;
        this.ioDispatcher = ioDispatcher;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.valueRelay = behaviorRelayCreate;
        Observable<Boolean> observableDistinctUntilChanged = behaviorRelayCreate.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.changes = observableDistinctUntilChanged;
    }

    public /* synthetic */ BooleanPreference(SharedPreferences sharedPreferences, String str, boolean z, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final Observable<Boolean> getChanges() {
        get();
        return this.changes;
    }

    public final boolean get() {
        Boolean value = this.valueRelay.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        boolean z = this.preferences.getBoolean(this.key, this.defaultValue);
        this.valueRelay.accept(Boolean.valueOf(z));
        return z;
    }

    /* compiled from: BooleanPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.BooleanPreference$coGet$2", m3645f = "BooleanPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.BooleanPreference$coGet$2 */
    /* loaded from: classes26.dex */
    static final class C361172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        C361172(Continuation<? super C361172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BooleanPreference.this.new C361172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C361172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(BooleanPreference.this.get());
        }
    }

    public final Object coGet(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C361172(null), continuation);
    }

    public final void set(boolean value) {
        this.preferences.edit().putBoolean(this.key, value).apply();
        this.valueRelay.accept(Boolean.valueOf(value));
    }

    /* compiled from: BooleanPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.BooleanPreference$coSet$2", m3645f = "BooleanPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.BooleanPreference$coSet$2 */
    /* loaded from: classes26.dex */
    static final class C361182 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361182(boolean z, Continuation<? super C361182> continuation) {
            super(2, continuation);
            this.$value = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BooleanPreference.this.new C361182(this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BooleanPreference.this.set(this.$value);
            return Unit.INSTANCE;
        }
    }

    public final Object coSet(boolean z, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361182(z, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean isSet() {
        return this.preferences.contains(this.key);
    }

    public final void delete() {
        this.preferences.edit().remove(this.key).apply();
        this.valueRelay.accept(Boolean.valueOf(this.defaultValue));
    }

    /* compiled from: BooleanPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.BooleanPreference$coDelete$2", m3645f = "BooleanPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.BooleanPreference$coDelete$2 */
    /* loaded from: classes26.dex */
    static final class C361162 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C361162(Continuation<? super C361162> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BooleanPreference.this.new C361162(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BooleanPreference.this.delete();
            return Unit.INSTANCE;
        }
    }

    public final Object coDelete(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361162(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
