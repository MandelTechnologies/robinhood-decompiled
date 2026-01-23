package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Cancellable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FloatPreference.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/prefs/FloatPreference;", "", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;F)V", "cachedValue", "Ljava/lang/Float;", "get", "changes", "Lio/reactivex/Observable;", "getChanges", "()Lio/reactivex/Observable;", "isSet", "", "()Z", "set", "", "value", AnalyticsStrings.BUTTON_LIST_DELETE, "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class FloatPreference {
    private Float cachedValue;
    private final Observable<Float> changes;
    private final float defaultValue;
    private final String key;
    private final SharedPreferences preferences;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatPreference(SharedPreferences preferences, String key) {
        this(preferences, key, 0.0f, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @JvmOverloads
    public FloatPreference(SharedPreferences preferences, String key, float f) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        this.preferences = preferences;
        this.key = key;
        this.defaultValue = f;
        Observable<Float> observableDistinctUntilChanged = Observable.create(new ObservableOnSubscribe() { // from class: com.robinhood.prefs.FloatPreference$changes$1
            /* JADX WARN: Type inference failed for: r0v1, types: [com.robinhood.prefs.FloatPreference$changes$1$cancellable$1, io.reactivex.functions.Cancellable] */
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(final ObservableEmitter<Float> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final FloatPreference floatPreference = this.this$0;
                ?? r0 = new Cancellable(emitter) { // from class: com.robinhood.prefs.FloatPreference$changes$1$cancellable$1
                    private final SharedPreferences.OnSharedPreferenceChangeListener listener;

                    {
                        this.listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.robinhood.prefs.FloatPreference$changes$1$cancellable$1$listener$1
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                                if (Intrinsics.areEqual(str, floatPreference.key)) {
                                    emitter.onNext(Float.valueOf(sharedPreferences.getFloat(str, floatPreference.defaultValue)));
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
                emitter.onNext(Float.valueOf(this.this$0.get()));
                this.this$0.preferences.registerOnSharedPreferenceChangeListener(r0.getListener());
                emitter.setCancellable(r0);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.changes = observableDistinctUntilChanged;
    }

    public /* synthetic */ FloatPreference(SharedPreferences sharedPreferences, String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? 0.0f : f);
    }

    public final float get() {
        if (this.cachedValue == null) {
            this.cachedValue = Float.valueOf(this.preferences.getFloat(this.key, this.defaultValue));
        }
        Float f = this.cachedValue;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final Observable<Float> getChanges() {
        return this.changes;
    }

    public final boolean isSet() {
        return this.cachedValue != null || this.preferences.contains(this.key);
    }

    public final void set(float value) {
        this.cachedValue = Float.valueOf(value);
        this.preferences.edit().putFloat(this.key, value).apply();
    }

    public final void delete() {
        this.cachedValue = null;
        this.preferences.edit().remove(this.key).apply();
    }
}
