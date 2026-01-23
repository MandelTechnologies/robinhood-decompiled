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
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LongPreference.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\u0007J\r\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/prefs/LongPreference;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;J)V", "cachedValue", "Ljava/lang/Long;", "changes", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "get", "getOrNull", "()Ljava/lang/Long;", "isSet", "", "()Z", "set", "", "value", AnalyticsStrings.BUTTON_LIST_DELETE, "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class LongPreference {
    private Long cachedValue;
    private final long defaultValue;
    private final String key;
    private final SharedPreferences preferences;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LongPreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0L, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @JvmOverloads
    public LongPreference(SharedPreferences preferences, String key, long j) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = j;
    }

    public /* synthetic */ LongPreference(SharedPreferences sharedPreferences, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? 0L : j);
    }

    public final Observable<Optional<Long>> changes() {
        Observable<Optional<Long>> observableDistinctUntilChanged = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.prefs.LongPreference.changes.1
            /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.prefs.LongPreference$changes$1$cancellable$1, io.reactivex.functions.Cancellable] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Optional<Long>> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final LongPreference longPreference = LongPreference.this;
                ?? r0 = new Cancellable(emitter) { // from class: com.robinhood.prefs.LongPreference$changes$1$cancellable$1
                    private final SharedPreferences.OnSharedPreferenceChangeListener listener;

                    {
                        this.listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.robinhood.prefs.LongPreference$changes$1$cancellable$1$listener$1
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                                if (Intrinsics.areEqual(str, longPreference.key)) {
                                    emitter.onNext(Optional3.asOptional(Long.valueOf(sharedPreferences.getLong(str, longPreference.defaultValue))));
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
                emitter.onNext(Optional3.asOptional(Long.valueOf(LongPreference.this.get())));
                LongPreference.this.preferences.registerOnSharedPreferenceChangeListener(r0.getListener());
                emitter.setCancellable(r0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final long get() {
        if (this.cachedValue == null) {
            this.cachedValue = Long.valueOf(this.preferences.getLong(this.key, this.defaultValue));
        }
        Long l = this.cachedValue;
        Intrinsics.checkNotNull(l);
        return l.longValue();
    }

    public final Long getOrNull() {
        if (isSet()) {
            return Long.valueOf(get());
        }
        return null;
    }

    public final boolean isSet() {
        return this.cachedValue != null || this.preferences.contains(this.key);
    }

    public final void set(long value) {
        this.cachedValue = Long.valueOf(value);
        this.preferences.edit().putLong(this.key, value).apply();
    }

    public final void delete() {
        this.cachedValue = null;
        this.preferences.edit().remove(this.key).apply();
    }
}
