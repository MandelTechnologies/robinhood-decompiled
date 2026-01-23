package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: EnumPreference.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u000e\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u0016\u0010 \u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u001eJ\r\u0010%\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0013J\u0015\u0010&\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR$\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/prefs/EnumPreference;", "E", "", "", "type", "Ljava/lang/Class;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Ljava/lang/Class;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Enum;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljava/lang/Enum;", "_value", "value", "getValue", "()Ljava/lang/Enum;", "setValue", "(Ljava/lang/Enum;)V", "changes", "Lio/reactivex/Observable;", "getChanges", "()Lio/reactivex/Observable;", "get", "coGet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "newValue", "coSet", "(Ljava/lang/Enum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSet", "", AnalyticsStrings.BUTTON_LIST_DELETE, "read", "write", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class EnumPreference<E extends Enum<E>> {
    private E _value;
    private final Observable<E> changes;
    private final E defaultValue;
    private final CoroutineDispatcher ioDispatcher;
    private final String key;
    private final SharedPreferences preferences;
    private final Class<E> type;

    public EnumPreference(Class<E> type2, SharedPreferences preferences, String key, E defaultValue, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.type = type2;
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = defaultValue;
        this.ioDispatcher = ioDispatcher;
        Observable<E> observableDistinctUntilChanged = Observable.create(new ObservableOnSubscribe(this) { // from class: com.robinhood.prefs.EnumPreference$changes$1
            final /* synthetic */ EnumPreference<E> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.prefs.EnumPreference$changes$1$cancellable$1, io.reactivex.functions.Cancellable] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<E> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final EnumPreference<E> enumPreference = this.this$0;
                ?? r0 = new Cancellable(enumPreference, emitter) { // from class: com.robinhood.prefs.EnumPreference$changes$1$cancellable$1
                    private final SharedPreferences.OnSharedPreferenceChangeListener listener;
                    final /* synthetic */ EnumPreference<E> this$0;

                    {
                        this.this$0 = enumPreference;
                        this.listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.robinhood.prefs.EnumPreference$changes$1$cancellable$1$listener$1
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                                if (Intrinsics.areEqual(str, ((EnumPreference) enumPreference).key)) {
                                    emitter.onNext(enumPreference.read());
                                }
                            }
                        };
                    }

                    public final SharedPreferences.OnSharedPreferenceChangeListener getListener() {
                        return this.listener;
                    }

                    @Override // io.reactivex.functions.Cancellable
                    public void cancel() {
                        ((EnumPreference) this.this$0).preferences.unregisterOnSharedPreferenceChangeListener(this.listener);
                    }
                };
                emitter.onNext(this.this$0.getValue());
                ((EnumPreference) this.this$0).preferences.registerOnSharedPreferenceChangeListener(r0.getListener());
                emitter.setCancellable(r0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.changes = observableDistinctUntilChanged;
    }

    public /* synthetic */ EnumPreference(Class cls, SharedPreferences sharedPreferences, String str, Enum r10, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, sharedPreferences, str, r10, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final E getValue() {
        E e = this._value;
        return e != null ? e : (E) read();
    }

    public final void setValue(E value) {
        Intrinsics.checkNotNullParameter(value, "value");
        write(value);
    }

    public final Observable<E> getChanges() {
        return this.changes;
    }

    public final E get() {
        return (E) getValue();
    }

    /* compiled from: EnumPreference.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "E", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.EnumPreference$coGet$2", m3645f = "EnumPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.EnumPreference$coGet$2 */
    /* loaded from: classes26.dex */
    static final class C361192 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super E>, Object> {
        int label;
        final /* synthetic */ EnumPreference<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361192(EnumPreference<E> enumPreference, Continuation<? super C361192> continuation) {
            super(2, continuation);
            this.this$0 = enumPreference;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361192(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super E> continuation) {
            return ((C361192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.this$0.get();
        }
    }

    public final Object coGet(Continuation<? super E> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C361192(this, null), continuation);
    }

    public final void set(E newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        setValue(newValue);
    }

    /* compiled from: EnumPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.EnumPreference$coSet$2", m3645f = "EnumPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.EnumPreference$coSet$2 */
    /* loaded from: classes26.dex */
    static final class C361202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ E $value;
        int label;
        final /* synthetic */ EnumPreference<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361202(EnumPreference<E> enumPreference, E e, Continuation<? super C361202> continuation) {
            super(2, continuation);
            this.this$0 = enumPreference;
            this.$value = e;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C361202(this.this$0, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.set(this.$value);
            return Unit.INSTANCE;
        }
    }

    public final Object coSet(E e, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361202(this, e, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean isSet() {
        return this.preferences.contains(this.key);
    }

    public final void delete() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.remove(this.key);
        editorEdit.apply();
        this._value = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E read() {
        E e;
        try {
            e = (E) Enum.valueOf(this.type, this.preferences.getString(this.key, this.defaultValue.name()));
        } catch (IllegalArgumentException unused) {
            e = this.defaultValue;
        }
        this._value = e;
        Intrinsics.checkNotNull(e);
        return e;
    }

    private final void write(E value) {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putString(this.key, value.name());
        editorEdit.apply();
        this._value = value;
    }
}
