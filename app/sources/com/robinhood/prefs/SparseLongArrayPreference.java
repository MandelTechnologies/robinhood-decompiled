package com.robinhood.prefs;

import android.content.SharedPreferences;
import android.util.SparseLongArray;
import com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SparseLongArrayPreference.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\u0086\u0002J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0010H\u0086\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0011R\u001b\u0010\n\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/prefs/SparseLongArrayPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "Landroid/util/SparseLongArray;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Landroid/util/SparseLongArray;)V", "mapping", "getMapping", "()Landroid/util/SparseLongArray;", "mapping$delegate", "Lkotlin/Lazy;", "get", "", "", "set", "", "value", "remove", "Companion", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class SparseLongArrayPreference extends StringPreference {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: mapping$delegate, reason: from kotlin metadata */
    private final Lazy mapping;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SparseLongArrayPreference(SharedPreferences preferences, String key) {
        this(preferences, key, null, 4, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
    }

    public /* synthetic */ SparseLongArrayPreference(SharedPreferences sharedPreferences, String str, SparseLongArray sparseLongArray, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? null : sparseLongArray);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public SparseLongArrayPreference(SharedPreferences preferences, String key, SparseLongArray sparseLongArray) {
        String strSerialize;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        super(preferences, key, (sparseLongArray == null || (strSerialize = INSTANCE.serialize(sparseLongArray)) == null) ? "[]" : strSerialize, null, 8, null);
        this.mapping = LazyKt.lazy(new Function0() { // from class: com.robinhood.prefs.SparseLongArrayPreference$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SparseLongArrayPreference.mapping_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SparseLongArray getMapping() {
        return (SparseLongArray) this.mapping.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparseLongArray mapping_delegate$lambda$0(SparseLongArrayPreference sparseLongArrayPreference) {
        SparseLongArray sparseLongArrayDeserialize;
        String str = sparseLongArrayPreference.get();
        return (str == null || (sparseLongArrayDeserialize = INSTANCE.deserialize(str)) == null) ? new SparseLongArray() : sparseLongArrayDeserialize;
    }

    public final long get(int key) {
        return getMapping().get(key);
    }

    public final void set(int key, long value) {
        getMapping().put(key, value);
        set(INSTANCE.serialize(getMapping()));
    }

    public final void remove(int key) {
        getMapping().delete(key);
        set(INSTANCE.serialize(getMapping()));
    }

    /* compiled from: SparseLongArrayPreference.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\f\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/prefs/SparseLongArrayPreference$Companion;", "Lcom/robinhood/utils/moshi/jsonadapter/NullSafeJsonAdapter;", "Landroid/util/SparseLongArray;", "<init>", "()V", "readFrom", "reader", "Lcom/squareup/moshi/JsonReader;", "writeTo", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "serialize", "", "deserialize", "json", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends NullSafeJsonAdapter<SparseLongArray> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public SparseLongArray readFrom(JsonReader reader) throws IOException {
            Intrinsics.checkNotNullParameter(reader, "reader");
            SparseLongArray sparseLongArray = new SparseLongArray();
            reader.beginArray();
            while (reader.hasNext()) {
                reader.beginArray();
                sparseLongArray.put(reader.nextInt(), reader.nextLong());
                Unit unit = Unit.INSTANCE;
                reader.endArray();
            }
            Unit unit2 = Unit.INSTANCE;
            reader.endArray();
            return sparseLongArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String serialize(SparseLongArray sparseLongArray) {
            String json = toJson(sparseLongArray);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return json;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SparseLongArray deserialize(String json) throws IOException {
            SparseLongArray sparseLongArrayFromJson = fromJson(json);
            return sparseLongArrayFromJson == null ? new SparseLongArray() : sparseLongArrayFromJson;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.robinhood.utils.moshi.jsonadapter.NullSafeJsonAdapter
        public void writeTo(JsonWriter writer, SparseLongArray value) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.beginArray();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = value.keyAt(i);
                long jValueAt = value.valueAt(i);
                writer.beginArray();
                writer.value(Integer.valueOf(iKeyAt));
                writer.value(jValueAt);
                writer.endArray();
            }
            writer.endArray();
        }
    }
}
