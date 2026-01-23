package com.robinhood.android.serialization.moshi.p252di;

import com.robinhood.android.serialization.moshi.p252di.MoshiModule;
import com.robinhood.contentful.binding.ContentTypeBindingRegistry;
import com.robinhood.contentful.json.Moshi2;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.Path;
import com.robinhood.models.api.ApiMessagePageWindow;
import com.robinhood.models.api.serverdrivenui.MoshiBuilders;
import com.robinhood.models.jsonadapter.ErrorResponseJsonAdapterFactory;
import com.robinhood.models.jsonadapter.MoneyJsonAdapterFactory;
import com.robinhood.models.serverdriven.experimental.SDUI_INTERFACE_moshi;
import com.robinhood.models.serverdriven.utils.MoshiBuilders2;
import com.robinhood.utils.Json2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.moshi.jsonadapter.StackAmendingJsonAdapterFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.ProtoAdapter;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MoshiModule.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\n¢\u0006\u0002\b\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\rH\u0007J\u007f\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132!\u0010\u0015\u001a\u001d\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\n0\u0013¢\u0006\u0002\b\r2\u0017\u0010\u0016\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\r0\u000f0\u00132+\u0010\u0018\u001a'\u0012#\u0012!\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a¢\u0006\u0002\b\r0\nj\u0002`\u001c0\u0013H\u0007JG\u0010\u001d\u001a\u00020\u001e2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\n2%\u0010\u0018\u001a!\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u001a¢\u0006\u0002\b\r0\nj\u0002`\u001cH\u0002R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule;", "", "<init>", "()V", "baseApiMoshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getBaseApiMoshi$annotations", "getBaseApiMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "provideJsonAdapterMap", "", "Ljava/lang/reflect/Type;", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "bindings", "", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "provideLazyMoshi", "contentTypeBindingRegistry", "Ldagger/Lazy;", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "jsonAdapters", "jsonAdapterFactories", "Lcom/squareup/moshi/JsonAdapter$Factory;", "protoAdapterSupplierMap", "", "Lkotlin/Function0;", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/idl/ProtoAdapterSupplierMap;", "newBaseApiMoshi", "Lcom/squareup/moshi/Moshi;", "Holder", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MoshiModule {
    public static final MoshiModule INSTANCE = new MoshiModule();

    public static /* synthetic */ void getBaseApiMoshi$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Moshi newBaseApiMoshi(Map<Type, ? extends JsonAdapter<?>> jsonAdapters, Map<String, Function0<ProtoAdapter<?>>> protoAdapterSupplierMap) {
        Moshi.Builder builderAdd = new Moshi.Builder().add((JsonAdapter.Factory) StackAmendingJsonAdapterFactory.INSTANCE);
        Json2.addGenericAdapters(builderAdd, protoAdapterSupplierMap);
        SDUI_INTERFACE_moshi.addExperimentalServerDrivenUiAdapters(builderAdd);
        PaginationCursor.JsonAdapter jsonAdapter = PaginationCursor.JsonAdapter.INSTANCE;
        Types types = Types.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(builderAdd.add(new TypeToken<PaginationCursor>() { // from class: com.robinhood.android.serialization.moshi.di.MoshiModule$newBaseApiMoshi$lambda$2$$inlined$addAdapter$1
        }.getType(), jsonAdapter), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builderAdd.add(new TypeToken<ApiMessagePageWindow>() { // from class: com.robinhood.android.serialization.moshi.di.MoshiModule$newBaseApiMoshi$lambda$2$$inlined$addAdapter$2
        }.getType(), ApiMessagePageWindow.JsonAdapter.INSTANCE), "add(...)");
        Intrinsics.checkNotNullExpressionValue(builderAdd.add(new TypeToken<Path>() { // from class: com.robinhood.android.serialization.moshi.di.MoshiModule$newBaseApiMoshi$lambda$2$$inlined$addAdapter$3
        }.getType(), Path.JsonAdapter.INSTANCE), "add(...)");
        MoshiBuilders.addOdysseyApiAdapters(builderAdd);
        MoshiBuilders2.addServerDrivenUiApiAdapters(builderAdd);
        MoshiBuilders2.addServerDrivenUiDbAdapters(builderAdd);
        for (Map.Entry<Type, ? extends JsonAdapter<?>> entry : jsonAdapters.entrySet()) {
            builderAdd.add(entry.getKey(), entry.getValue());
        }
        builderAdd.add((JsonAdapter.Factory) ErrorResponseJsonAdapterFactory.INSTANCE);
        builderAdd.add((JsonAdapter.Factory) MoneyJsonAdapterFactory.INSTANCE);
        Moshi moshiBuild = builderAdd.build();
        Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
        return moshiBuild;
    }

    private MoshiModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MoshiModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/serialization/moshi/di/MoshiModule$Holder;", "", "<init>", "()V", "baseApiMoshi", "Lcom/squareup/moshi/Moshi;", "getBaseApiMoshi", "()Lcom/squareup/moshi/Moshi;", "lib-serialization-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final class Holder {
        public static final Holder INSTANCE = new Holder();
        private static final Moshi baseApiMoshi;

        private Holder() {
        }

        static {
            Moshi moshiBuild = MoshiModule.INSTANCE.newBaseApiMoshi(MapsKt.emptyMap(), MapsKt.emptyMap()).newBuilder().build();
            Intrinsics.checkNotNullExpressionValue(moshiBuild, "build(...)");
            baseApiMoshi = moshiBuild;
        }

        public final Moshi getBaseApiMoshi() {
            return baseApiMoshi;
        }
    }

    public final LazyMoshi getBaseApiMoshi() {
        return new LazyMoshi(new Lazy() { // from class: com.robinhood.android.serialization.moshi.di.MoshiModule$baseApiMoshi$1
            @Override // dagger.Lazy
            public final Moshi get() {
                return MoshiModule.Holder.INSTANCE.getBaseApiMoshi();
            }
        });
    }

    public final Map<Type, JsonAdapter<?>> provideJsonAdapterMap(Set<JsonAdapterBinding> bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        LinkedHashMap linkedHashMap = new LinkedHashMap(bindings.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (JsonAdapterBinding jsonAdapterBinding : bindings) {
            Type type2 = jsonAdapterBinding.getType();
            JsonAdapter<?> jsonAdapterComponent2 = jsonAdapterBinding.component2();
            if (!linkedHashMap.containsKey(type2)) {
                linkedHashMap.put(type2, jsonAdapterComponent2);
            } else {
                Object arrayList = linkedHashMap2.get(type2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(type2, arrayList);
                }
                List list = (List) arrayList;
                list.add(MapsKt.getValue(linkedHashMap, type2));
                list.add(jsonAdapterComponent2);
            }
        }
        if (!linkedHashMap2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("One or more `JsonAdapter`s have been bound to the same type. ");
            sb.append("Please bind each type only once. Issues found:");
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Type type3 = (Type) entry.getKey();
                List list2 = (List) entry.getValue();
                sb.append("\n  - ");
                sb.append(type3);
                sb.append(" -> ");
                sb.append(list2);
            }
            throw new IllegalStateException(sb.toString().toString());
        }
        Map<Type, JsonAdapter<?>> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final LazyMoshi provideLazyMoshi(final Lazy<ContentTypeBindingRegistry> contentTypeBindingRegistry, final Lazy<Map<Type, JsonAdapter<?>>> jsonAdapters, final Lazy<Set<JsonAdapter.Factory>> jsonAdapterFactories, final Lazy<Map<String, Function0<ProtoAdapter<?>>>> protoAdapterSupplierMap) {
        Intrinsics.checkNotNullParameter(contentTypeBindingRegistry, "contentTypeBindingRegistry");
        Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
        Intrinsics.checkNotNullParameter(jsonAdapterFactories, "jsonAdapterFactories");
        Intrinsics.checkNotNullParameter(protoAdapterSupplierMap, "protoAdapterSupplierMap");
        Lazy lazy = DoubleCheck.lazy(new Provider() { // from class: com.robinhood.android.serialization.moshi.di.MoshiModule.provideLazyMoshi.1
            @Override // javax.inject.Provider
            public final Moshi get() {
                MoshiModule moshiModule = MoshiModule.INSTANCE;
                Map<Type, JsonAdapter<?>> map = jsonAdapters.get();
                Intrinsics.checkNotNullExpressionValue(map, "get(...)");
                Map<String, Function0<ProtoAdapter<?>>> map2 = protoAdapterSupplierMap.get();
                Intrinsics.checkNotNullExpressionValue(map2, "get(...)");
                Moshi.Builder builderNewBuilder = moshiModule.newBaseApiMoshi(map, map2).newBuilder();
                Set<JsonAdapter.Factory> set = jsonAdapterFactories.get();
                Intrinsics.checkNotNullExpressionValue(set, "get(...)");
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    builderNewBuilder = builderNewBuilder.add((JsonAdapter.Factory) it.next());
                }
                Lazy<ContentTypeBindingRegistry> lazy2 = contentTypeBindingRegistry;
                Intrinsics.checkNotNull(builderNewBuilder);
                ContentTypeBindingRegistry contentTypeBindingRegistry2 = lazy2.get();
                Intrinsics.checkNotNullExpressionValue(contentTypeBindingRegistry2, "get(...)");
                Moshi2.addContentfulJsonAdapters(builderNewBuilder, contentTypeBindingRegistry2);
                return builderNewBuilder.build();
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return new LazyMoshi(lazy);
    }
}
