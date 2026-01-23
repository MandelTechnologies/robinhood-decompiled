package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringToLongMapPreference.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\bH\u0086\u0002J\u0019\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0086\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u000f\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u000f0\u00070\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, m3636d2 = {"Lcom/robinhood/prefs/StringToLongMapPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "_values", "value", "values", "getValues", "()Ljava/util/Map;", "setValues", "(Ljava/util/Map;)V", "set", "", "get", "deserialize", "json", "serialize", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class StringToLongMapPreference extends StringPreference {
    private Map<String, Long> _values;
    private final Map<String, Long> default;
    private final LazyMoshi moshi;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToLongMapPreference(SharedPreferences preferences, String key, LazyMoshi moshi) {
        this(preferences, key, null, moshi, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    public /* synthetic */ StringToLongMapPreference(SharedPreferences sharedPreferences, String str, Map map, LazyMoshi lazyMoshi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? MapsKt.emptyMap() : map, lazyMoshi);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToLongMapPreference(SharedPreferences preferences, String key, Map<String, Long> defaultValue, LazyMoshi moshi) {
        super(preferences, key, null, null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        this.default = defaultValue;
    }

    private final JsonAdapter<Map<String, Long>> getAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<Map<String, Long>>() { // from class: com.robinhood.prefs.StringToLongMapPreference$special$$inlined$getAdapter$1
        }.getType());
    }

    public final Map<String, Long> getValues() {
        Map<String, Long> map = this._values;
        if (map != null) {
            return map;
        }
        String str = get();
        Map<String, Long> mapDeserialize = str != null ? deserialize(str) : null;
        this._values = mapDeserialize;
        return mapDeserialize == null ? this.default : mapDeserialize;
    }

    public final void setValues(Map<String, Long> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values = value;
        set(serialize(value));
    }

    public final void set(String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        setValues(MapsKt.plus(getValues(), MapsKt.mapOf(Tuples4.m3642to(key, Long.valueOf(value)))));
    }

    public final long get(String key, long defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getValues().getOrDefault(key, Long.valueOf(defaultValue)).longValue();
    }

    private final Map<String, Long> deserialize(String json) throws IOException {
        Map<String, Long> mapFromJson = getAdapter().fromJson(json);
        return mapFromJson == null ? MapsKt.emptyMap() : mapFromJson;
    }

    private final String serialize(Map<String, Long> map) {
        String json = getAdapter().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
