package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LongSetPreference.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/prefs/LongSetPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/Set;)V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "_values", "value", "values", "getValues", "()Ljava/util/Set;", "setValues", "(Ljava/util/Set;)V", "Companion", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class LongSetPreference extends StringPreference {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Set<Long> _values;
    private final Set<Long> default;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LongSetPreference(SharedPreferences preferences, String key) {
        this(preferences, key, null, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public /* synthetic */ LongSetPreference(SharedPreferences sharedPreferences, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LongSetPreference(SharedPreferences preferences, String key, Set<Long> defaultValue) {
        super(preferences, key, INSTANCE.serialize(defaultValue), null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.default = defaultValue;
    }

    public final Set<Long> getValues() {
        Set<Long> set = this._values;
        if (set != null) {
            return set;
        }
        String str = get();
        Set<Long> setDeserialize = str != null ? INSTANCE.deserialize(str) : null;
        this._values = setDeserialize;
        return setDeserialize == null ? this.default : setDeserialize;
    }

    public final void setValues(Set<Long> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values = value;
        set(INSTANCE.serialize(value));
    }

    /* compiled from: LongSetPreference.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/prefs/LongSetPreference$Companion;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "", "", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "serialize", "", "deserialize", "json", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends NullSafeJsonAdapter<Set<? extends Long>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public /* bridge */ /* synthetic */ void writeTo(JsonWriter jsonWriter, Set<? extends Long> set) throws IOException {
            writeTo2(jsonWriter, (Set<Long>) set);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public Set<? extends Long> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            reader.beginArray();
            while (reader.hasNext()) {
                linkedHashSet.add(Long.valueOf(reader.nextLong()));
            }
            Unit unit = Unit.INSTANCE;
            reader.endArray();
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String serialize(Set<Long> set) {
            String json = toJson(set);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<Long> deserialize(String json) {
            Set<Long> set = (Set) fromJson(json);
            return set == null ? SetsKt.emptySet() : set;
        }

        /* renamed from: writeTo, reason: avoid collision after fix types in other method */
        protected void writeTo2(JsonWriter writer, Set<Long> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginArray();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                writer.value(((Number) it.next()).longValue());
            }
            writer.endArray();
        }
    }
}
