package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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

/* compiled from: StringToBooleanMapPreference.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00070\u001dJ\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\bH\u0086\u0002J\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0086\u0002J\u001e\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010!J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010%\u001a\u00020\u0005H\u0002J\u0018\u0010&\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u000f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0011\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u00110\u00070\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R<\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, m3636d2 = {"Lcom/robinhood/prefs/StringToBooleanMapPreference;", "Lcom/robinhood/prefs/StringPreference;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "defaultValue", "", "", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/util/Map;Lcom/robinhood/utils/moshi/LazyMoshi;Lkotlinx/coroutines/CoroutineDispatcher;)V", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "_values", "value", "values", "getValues", "()Ljava/util/Map;", "setValues", "(Ljava/util/Map;)V", "streamChanges", "Lio/reactivex/Observable;", "set", "", "coPut", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "coGetOrDefault", "deserialize", "json", "serialize", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class StringToBooleanMapPreference extends StringPreference {
    private Map<String, Boolean> _values;
    private final Map<String, Boolean> default;
    private final CoroutineDispatcher ioDispatcher;
    private final LazyMoshi moshi;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToBooleanMapPreference(SharedPreferences preferences, String key, LazyMoshi moshi) {
        this(preferences, key, null, moshi, null, 20, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToBooleanMapPreference(SharedPreferences preferences, String key, Map<String, Boolean> defaultValue, LazyMoshi moshi) {
        this(preferences, key, defaultValue, moshi, null, 16, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
    }

    public /* synthetic */ StringToBooleanMapPreference(SharedPreferences sharedPreferences, String str, Map map, LazyMoshi lazyMoshi, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i & 4) != 0 ? MapsKt.emptyMap() : map, lazyMoshi, (i & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StringToBooleanMapPreference(SharedPreferences preferences, String key, Map<String, Boolean> defaultValue, LazyMoshi moshi, CoroutineDispatcher ioDispatcher) {
        super(preferences, key, null, null, 8, null);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.moshi = moshi;
        this.ioDispatcher = ioDispatcher;
        this.default = defaultValue;
    }

    private final JsonAdapter<Map<String, Boolean>> getAdapter() {
        LazyMoshi lazyMoshi = this.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<Map<String, Boolean>>() { // from class: com.robinhood.prefs.StringToBooleanMapPreference$special$$inlined$getAdapter$1
        }.getType());
    }

    public final Map<String, Boolean> getValues() {
        Map<String, Boolean> map = this._values;
        if (map != null) {
            return map;
        }
        String str = get();
        Map<String, Boolean> mapDeserialize = str != null ? deserialize(str) : null;
        this._values = mapDeserialize;
        return mapDeserialize == null ? this.default : mapDeserialize;
    }

    public final void setValues(Map<String, Boolean> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values = value;
        set(serialize(value));
    }

    public final Observable<Map<String, Boolean>> streamChanges() {
        Observable map = changes().map(new Function() { // from class: com.robinhood.prefs.StringToBooleanMapPreference.streamChanges.1
            @Override // io.reactivex.functions.Function
            public final Map<String, Boolean> apply(Optional<String> optional) {
                Map<String, Boolean> mapDeserialize;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                return (strComponent1 == null || (mapDeserialize = StringToBooleanMapPreference.this.deserialize(strComponent1)) == null) ? StringToBooleanMapPreference.this.default : mapDeserialize;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void set(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        setValues(MapsKt.plus(getValues(), MapsKt.mapOf(Tuples4.m3642to(key, Boolean.valueOf(value)))));
    }

    /* compiled from: StringToBooleanMapPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.StringToBooleanMapPreference$coPut$2", m3645f = "StringToBooleanMapPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.StringToBooleanMapPreference$coPut$2 */
    static final class C361282 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361282(String str, boolean z, Continuation<? super C361282> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StringToBooleanMapPreference.this.new C361282(this.$key, this.$value, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C361282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringToBooleanMapPreference stringToBooleanMapPreference = StringToBooleanMapPreference.this;
            stringToBooleanMapPreference.setValues(MapsKt.plus(stringToBooleanMapPreference.getValues(), MapsKt.mapOf(Tuples4.m3642to(this.$key, boxing.boxBoolean(this.$value)))));
            return Unit.INSTANCE;
        }
    }

    public final Object coPut(String str, boolean z, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.ioDispatcher, new C361282(str, z, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final boolean get(String key, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getValues().getOrDefault(key, Boolean.valueOf(defaultValue)).booleanValue();
    }

    /* compiled from: StringToBooleanMapPreference.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.prefs.StringToBooleanMapPreference$coGetOrDefault$2", m3645f = "StringToBooleanMapPreference.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.prefs.StringToBooleanMapPreference$coGetOrDefault$2 */
    static final class C361272 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ boolean $defaultValue;
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C361272(String str, boolean z, Continuation<? super C361272> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$defaultValue = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StringToBooleanMapPreference.this.new C361272(this.$key, this.$defaultValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C361272) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StringToBooleanMapPreference.this.getValues().getOrDefault(this.$key, boxing.boxBoolean(this.$defaultValue));
        }
    }

    public final Object coGetOrDefault(String str, boolean z, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new C361272(str, z, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Boolean> deserialize(String json) throws IOException {
        Map<String, Boolean> mapFromJson = getAdapter().fromJson(json);
        return mapFromJson == null ? MapsKt.emptyMap() : mapFromJson;
    }

    private final String serialize(Map<String, Boolean> map) {
        String json = getAdapter().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
