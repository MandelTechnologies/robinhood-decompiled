package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringSetPreference.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0005J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/prefs/StringSetPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/Set;)V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "_values", "value", "values", "getValues", "()Ljava/util/Set;", "setValues", "(Ljava/util/Set;)V", "changesAsSet", "Lio/reactivex/Observable;", "add", "", "get", "set", "Companion", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class StringSetPreference extends StringPreference {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Set<String> _values;
    private final Set<String> default;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringSetPreference(SharedPreferences preferences, String key) {
        this(preferences, key, null, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public /* synthetic */ StringSetPreference(SharedPreferences sharedPreferences, String str, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringSetPreference(SharedPreferences preferences, String key, Set<String> defaultValue) {
        super(preferences, key, INSTANCE.serialize(defaultValue), null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.default = defaultValue;
    }

    public final Set<String> getValues() {
        Set<String> set = this._values;
        if (set != null) {
            return set;
        }
        String str = super.get();
        Set<String> setDeserialize = str != null ? INSTANCE.deserialize(str) : null;
        this._values = setDeserialize;
        return setDeserialize == null ? this.default : setDeserialize;
    }

    public final void setValues(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values = value;
        super.set(INSTANCE.serialize(value));
    }

    public final Observable<Set<String>> changesAsSet() {
        Observable map = changes().map(new Function() { // from class: com.robinhood.prefs.StringSetPreference.changesAsSet.1
            @Override // io.reactivex.functions.Function
            public final Set<String> apply(Optional<String> optional) {
                Set<String> setDeserialize;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                return (strComponent1 == null || (setDeserialize = StringSetPreference.INSTANCE.deserialize(strComponent1)) == null) ? StringSetPreference.this.default : setDeserialize;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void add(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Set<String> mutableSet = CollectionsKt.toMutableSet(getValues());
        mutableSet.add(value);
        setValues(mutableSet);
    }

    @Override // com.robinhood.prefs.StringPreference
    public String get() {
        return super.get();
    }

    @Override // com.robinhood.prefs.StringPreference
    public void set(String value) {
        super.set(value);
    }

    /* compiled from: StringSetPreference.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/prefs/StringSetPreference$Companion;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "", "", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "serialize", "deserialize", "json", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends NullSafeJsonAdapter<Set<? extends String>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public /* bridge */ /* synthetic */ void writeTo(JsonWriter jsonWriter, Set<? extends String> set) throws IOException {
            writeTo2(jsonWriter, (Set<String>) set);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public Set<? extends String> readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            reader.beginArray();
            while (reader.hasNext()) {
                String strNextString = reader.nextString();
                Intrinsics.checkNotNullExpressionValue(strNextString, "nextString(...)");
                linkedHashSet.add(strNextString);
            }
            Unit unit = Unit.INSTANCE;
            reader.endArray();
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String serialize(Set<String> set) {
            String json = toJson(set);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Set<String> deserialize(String json) {
            Set<String> set = (Set) fromJson(json);
            return set == null ? SetsKt.emptySet() : set;
        }

        /* renamed from: writeTo, reason: avoid collision after fix types in other method */
        protected void writeTo2(JsonWriter writer, Set<String> value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginArray();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                writer.value((String) it.next());
            }
            writer.endArray();
        }
    }
}
