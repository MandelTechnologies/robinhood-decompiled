package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes21.dex */
public final class Moshi {
    static final List<JsonAdapter.Factory> BUILT_IN_FACTORIES;
    private final List<JsonAdapter.Factory> factories;
    private final int lastOffset;
    private final ThreadLocal<LookupChain> lookupChainThreadLocal = new ThreadLocal<>();
    private final Map<Object, JsonAdapter<?>> adapterCache = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        BUILT_IN_FACTORIES = arrayList;
        arrayList.add(StandardJsonAdapters.FACTORY);
        arrayList.add(CollectionJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(ArrayJsonAdapter.FACTORY);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    Moshi(Builder builder) {
        int size = builder.factories.size();
        List<JsonAdapter.Factory> list = BUILT_IN_FACTORIES;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(builder.factories);
        arrayList.addAll(list);
        this.factories = Collections.unmodifiableList(arrayList);
        this.lastOffset = builder.lastOffset;
    }

    public <T> JsonAdapter<T> adapter(Type type2) {
        return adapter(type2, Util.NO_ANNOTATIONS);
    }

    public <T> JsonAdapter<T> adapter(Class<T> cls) {
        return adapter(cls, Util.NO_ANNOTATIONS);
    }

    public <T> JsonAdapter<T> adapter(Type type2, Set<? extends Annotation> set) {
        return adapter(type2, set, null);
    }

    public <T> JsonAdapter<T> adapter(Type type2, Set<? extends Annotation> set, String str) {
        if (type2 == null) {
            throw new NullPointerException("type == null");
        }
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeRemoveSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type2));
        Object objCacheKey = cacheKey(typeRemoveSubtypeWildcard, set);
        synchronized (this.adapterCache) {
            try {
                JsonAdapter<T> jsonAdapter = (JsonAdapter) this.adapterCache.get(objCacheKey);
                if (jsonAdapter != null) {
                    return jsonAdapter;
                }
                LookupChain lookupChain = this.lookupChainThreadLocal.get();
                if (lookupChain == null) {
                    lookupChain = new LookupChain();
                    this.lookupChainThreadLocal.set(lookupChain);
                }
                JsonAdapter<T> jsonAdapterPush = lookupChain.push(typeRemoveSubtypeWildcard, str, objCacheKey);
                try {
                    if (jsonAdapterPush != null) {
                        return jsonAdapterPush;
                    }
                    try {
                        int size = this.factories.size();
                        for (int i = 0; i < size; i++) {
                            JsonAdapter<T> jsonAdapter2 = (JsonAdapter<T>) this.factories.get(i).create(typeRemoveSubtypeWildcard, set, this);
                            if (jsonAdapter2 != null) {
                                lookupChain.adapterFound(jsonAdapter2);
                                lookupChain.pop(true);
                                return jsonAdapter2;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
                    } catch (IllegalArgumentException e) {
                        throw lookupChain.exceptionWithLookupStack(e);
                    }
                } finally {
                    lookupChain.pop(false);
                }
            } finally {
            }
        }
    }

    public <T> JsonAdapter<T> nextAdapter(JsonAdapter.Factory factory, Type type2, Set<? extends Annotation> set) {
        if (set == null) {
            throw new NullPointerException("annotations == null");
        }
        Type typeRemoveSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type2));
        int iIndexOf = this.factories.indexOf(factory);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Unable to skip past unknown factory " + factory);
        }
        int size = this.factories.size();
        for (int i = iIndexOf + 1; i < size; i++) {
            JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) this.factories.get(i).create(typeRemoveSubtypeWildcard, set, this);
            if (jsonAdapter != null) {
                return jsonAdapter;
            }
        }
        throw new IllegalArgumentException("No next JsonAdapter for " + Util.typeAnnotatedWithAnnotations(typeRemoveSubtypeWildcard, set));
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        int i = this.lastOffset;
        for (int i2 = 0; i2 < i; i2++) {
            builder.add(this.factories.get(i2));
        }
        int size = this.factories.size() - BUILT_IN_FACTORIES.size();
        for (int i3 = this.lastOffset; i3 < size; i3++) {
            builder.addLast(this.factories.get(i3));
        }
        return builder;
    }

    private Object cacheKey(Type type2, Set<? extends Annotation> set) {
        return set.isEmpty() ? type2 : Arrays.asList(type2, set);
    }

    public static final class Builder {
        final List<JsonAdapter.Factory> factories = new ArrayList();
        int lastOffset = 0;

        public <T> Builder add(Type type2, JsonAdapter<T> jsonAdapter) {
            return add(Moshi.newAdapterFactory(type2, jsonAdapter));
        }

        public Builder add(JsonAdapter.Factory factory) {
            if (factory == null) {
                throw new IllegalArgumentException("factory == null");
            }
            List<JsonAdapter.Factory> list = this.factories;
            int i = this.lastOffset;
            this.lastOffset = i + 1;
            list.add(i, factory);
            return this;
        }

        public Builder add(Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException("adapter == null");
            }
            return add((JsonAdapter.Factory) AdapterMethodsFactory.get(obj));
        }

        public Builder addLast(JsonAdapter.Factory factory) {
            if (factory == null) {
                throw new IllegalArgumentException("factory == null");
            }
            this.factories.add(factory);
            return this;
        }

        public Moshi build() {
            return new Moshi(this);
        }
    }

    static <T> JsonAdapter.Factory newAdapterFactory(final Type type2, final JsonAdapter<T> jsonAdapter) {
        if (type2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        if (jsonAdapter == null) {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
        return new JsonAdapter.Factory() { // from class: com.squareup.moshi.Moshi.1
            @Override // com.squareup.moshi.JsonAdapter.Factory
            public JsonAdapter<?> create(Type type3, Set<? extends Annotation> set, Moshi moshi) {
                if (set.isEmpty() && Util.typesMatch(type2, type3)) {
                    return jsonAdapter;
                }
                return null;
            }
        };
    }

    final class LookupChain {
        boolean exceptionAnnotated;
        final List<Lookup<?>> callLookups = new ArrayList();
        final Deque<Lookup<?>> stack = new ArrayDeque();

        LookupChain() {
        }

        <T> JsonAdapter<T> push(Type type2, String str, Object obj) {
            int size = this.callLookups.size();
            for (int i = 0; i < size; i++) {
                Lookup<?> lookup = this.callLookups.get(i);
                if (lookup.cacheKey.equals(obj)) {
                    this.stack.add(lookup);
                    JsonAdapter<T> jsonAdapter = (JsonAdapter<T>) lookup.adapter;
                    return jsonAdapter != null ? jsonAdapter : lookup;
                }
            }
            Lookup<?> lookup2 = new Lookup<>(type2, str, obj);
            this.callLookups.add(lookup2);
            this.stack.add(lookup2);
            return null;
        }

        <T> void adapterFound(JsonAdapter<T> jsonAdapter) {
            this.stack.getLast().adapter = jsonAdapter;
        }

        void pop(boolean z) {
            this.stack.removeLast();
            if (this.stack.isEmpty()) {
                Moshi.this.lookupChainThreadLocal.remove();
                if (z) {
                    synchronized (Moshi.this.adapterCache) {
                        try {
                            int size = this.callLookups.size();
                            for (int i = 0; i < size; i++) {
                                Lookup<?> lookup = this.callLookups.get(i);
                                JsonAdapter<T> jsonAdapter = (JsonAdapter) Moshi.this.adapterCache.put(lookup.cacheKey, lookup.adapter);
                                if (jsonAdapter != 0) {
                                    lookup.adapter = jsonAdapter;
                                    Moshi.this.adapterCache.put(lookup.cacheKey, jsonAdapter);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }

        IllegalArgumentException exceptionWithLookupStack(IllegalArgumentException illegalArgumentException) {
            if (!this.exceptionAnnotated) {
                this.exceptionAnnotated = true;
                if (this.stack.size() != 1 || this.stack.getFirst().fieldName != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator<Lookup<?>> itDescendingIterator = this.stack.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        Lookup<?> next = itDescendingIterator.next();
                        sb.append("\nfor ");
                        sb.append(next.f10550type);
                        if (next.fieldName != null) {
                            sb.append(' ');
                            sb.append(next.fieldName);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }
    }

    static final class Lookup<T> extends JsonAdapter<T> {
        JsonAdapter<T> adapter;
        final Object cacheKey;
        final String fieldName;

        /* renamed from: type, reason: collision with root package name */
        final Type f10550type;

        Lookup(Type type2, String str, Object obj) {
            this.f10550type = type2;
            this.fieldName = str;
            this.cacheKey = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader jsonReader) throws IOException {
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            return jsonAdapter.fromJson(jsonReader);
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter jsonWriter, T t) throws IOException {
            JsonAdapter<T> jsonAdapter = this.adapter;
            if (jsonAdapter == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            jsonAdapter.toJson(jsonWriter, (JsonWriter) t);
        }

        public String toString() {
            JsonAdapter<T> jsonAdapter = this.adapter;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }
}
