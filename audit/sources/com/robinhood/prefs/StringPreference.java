package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: StringPreference.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u000e\u0010\u001d\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0013J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0014\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006!"}, m3636d2 = {"Lcom/robinhood/prefs/StringPreference;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getKey", "()Ljava/lang/String;", "cachedValue", "changes", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "get", "coGet", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSet", "", "()Z", "set", "", "value", "coSet", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsStrings.BUTTON_LIST_DELETE, "coDelete", "convertToStoredString", "input", "convertFromStoredString", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public class StringPreference {
    private String cachedValue;
    private final String defaultValue;
    private final CoroutineDispatcher ioDispatcher;
    private final String key;
    private final SharedPreferences preferences;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringPreference(SharedPreferences preferences, String key) {
        this(preferences, key, null, null, 12, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringPreference(SharedPreferences preferences, String key, String str) {
        this(preferences, key, str, null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public String convertFromStoredString(String input) {
        return input;
    }

    public String convertToStoredString(String input) {
        return input;
    }

    @JvmOverloads
    public StringPreference(SharedPreferences preferences, String key, String str, CoroutineDispatcher ioDispatcher) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = str;
        this.ioDispatcher = ioDispatcher;
    }

    public String getKey() {
        return this.key;
    }

    public /* synthetic */ StringPreference(SharedPreferences sharedPreferences, String str, String str2, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public final Observable<Optional<String>> changes() {
        Observable<Optional<String>> observableDistinctUntilChanged = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.prefs.StringPreference.changes.1
            /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.prefs.StringPreference$changes$1$cancellable$1, io.reactivex.functions.Cancellable] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Optional<String>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final StringPreference stringPreference = StringPreference.this;
                ?? r0 = new Cancellable(emitter) { // from class: com.robinhood.prefs.StringPreference$changes$1$cancellable$1
                    private final SharedPreferences.OnSharedPreferenceChangeListener listener;

                    {
                        this.listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.robinhood.prefs.StringPreference$changes$1$cancellable$1$listener$1
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                                if (Intrinsics.areEqual(str, stringPreference.getKey())) {
                                    emitter.onNext(Optional3.asOptional(stringPreference.convertFromStoredString(sharedPreferences.getString(str, null))));
                                }
                            }
                        };
                    }

                    public final SharedPreferences.OnSharedPreferenceChangeListener getListener() {
                        return this.listener;
                    }

                    @Override // io.reactivex.functions.Cancellable
                    public void cancel() {
                        this.this$0.preferences.unregisterOnSharedPreferenceChangeListener(this.listener);
                    }
                };
                emitter.onNext(Optional3.asOptional(StringPreference.this.get()));
                StringPreference.this.preferences.registerOnSharedPreferenceChangeListener(r0.getListener());
                emitter.setCancellable(r0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public String get() {
        if (this.cachedValue == null) {
            this.cachedValue = convertFromStoredString(this.preferences.getString(getKey(), this.defaultValue));
        }
        return this.cachedValue;
    }

    /* compiled from: StringPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.StringPreference$coGet$2", m3645f = "StringPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.StringPreference$coGet$2 */
    /* loaded from: classes26.dex */
    static final class C361242 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        int label;

        C361242(Continuation<? super C361242> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StringPreference.this.new C361242(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C361242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StringPreference.this.get();
        }
    }

    public final Object coGet(Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C361242(null), continuation);
    }

    /* renamed from: isSet */
    public boolean mo23850isSet() {
        return this.cachedValue != null || this.preferences.contains(getKey());
    }

    public void set(String value) {
        this.cachedValue = value;
        this.preferences.edit().putString(getKey(), convertToStoredString(value)).apply();
    }

    /* compiled from: StringPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.StringPreference$coSet$2", m3645f = "StringPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.StringPreference$coSet$2 */
    /* loaded from: classes26.dex */
    static final class C361252 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361252(String str, Continuation<? super C361252> continuation) {
            super(2, continuation);
            this.$value = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StringPreference.this.new C361252(this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringPreference.this.set(this.$value);
            return Unit.INSTANCE;
        }
    }

    public final Object coSet(String str, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361252(str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public void delete() {
        this.cachedValue = null;
        this.preferences.edit().remove(getKey()).apply();
    }

    /* compiled from: StringPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.StringPreference$coDelete$2", m3645f = "StringPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.StringPreference$coDelete$2 */
    /* loaded from: classes26.dex */
    static final class C361232 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C361232(Continuation<? super C361232> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StringPreference.this.new C361232(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringPreference.this.delete();
            return Unit.INSTANCE;
        }
    }

    public final Object coDelete(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361232(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
