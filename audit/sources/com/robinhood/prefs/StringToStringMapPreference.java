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
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringToStringMapPreference.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u000e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u000e0\u00070\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R<\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/prefs/StringToStringMapPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "_values", "value", "values", "getValues", "()Ljava/util/Map;", "setValues", "(Ljava/util/Map;)V", "put", "", "deserialize", "json", "serialize", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class StringToStringMapPreference extends StringPreference {
    private Map<String, String> _values;
    private final Map<String, String> default;
    private final LazyMoshi moshi;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToStringMapPreference(SharedPreferences preferences, String key, LazyMoshi moshi) {
        this(preferences, key, null, moshi, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    public /* synthetic */ StringToStringMapPreference(SharedPreferences sharedPreferences, String str, Map map, LazyMoshi lazyMoshi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? MapsKt.emptyMap() : map, lazyMoshi);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToStringMapPreference(SharedPreferences preferences, String key, Map<String, String> defaultValue, LazyMoshi moshi) {
        super(preferences, key, null, null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        this.default = defaultValue;
    }

    private final JsonAdapter<Map<String, String>> getAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<Map<String, String>>() { // from class: com.robinhood.prefs.StringToStringMapPreference$special$$inlined$getAdapter$1
        }.getType());
    }

    public final Map<String, String> getValues() {
        Map<String, String> map = this._values;
        if (map != null) {
            return map;
        }
        String str = get();
        Map<String, String> mapDeserialize = str != null ? deserialize(str) : null;
        this._values = mapDeserialize;
        return mapDeserialize == null ? this.default : mapDeserialize;
    }

    public final void setValues(Map<String, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values = value;
        set(serialize(value));
    }

    public final void put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> mutableMap = MapsKt.toMutableMap(getValues());
        mutableMap.put(key, value);
        setValues(mutableMap);
    }

    private final Map<String, String> deserialize(String json) throws IOException {
        Map<String, String> mapFromJson = getAdapter().fromJson(json);
        return mapFromJson == null ? MapsKt.emptyMap() : mapFromJson;
    }

    private final String serialize(Map<String, String> map) {
        String json = getAdapter().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
