package com.nimbusds.jose.shaded.json.writer;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONAware;
import com.nimbusds.jose.shaded.json.JSONAwareEx;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes27.dex */
public class JsonReader {
    public JsonReaderI<JSONAwareEx> DEFAULT;
    public JsonReaderI<JSONAwareEx> DEFAULT_ORDERED;

    /* renamed from: cache, reason: collision with root package name */
    private final ConcurrentHashMap<Type, JsonReaderI<?>> f9865cache;

    public JsonReader() {
        ConcurrentHashMap<Type, JsonReaderI<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.f9865cache = concurrentHashMap;
        concurrentHashMap.put(Date.class, BeansMapper.MAPPER_DATE);
        concurrentHashMap.put(int[].class, ArraysMapper.MAPPER_PRIM_INT);
        concurrentHashMap.put(Integer[].class, ArraysMapper.MAPPER_INT);
        concurrentHashMap.put(short[].class, ArraysMapper.MAPPER_PRIM_INT);
        concurrentHashMap.put(Short[].class, ArraysMapper.MAPPER_INT);
        concurrentHashMap.put(long[].class, ArraysMapper.MAPPER_PRIM_LONG);
        concurrentHashMap.put(Long[].class, ArraysMapper.MAPPER_LONG);
        concurrentHashMap.put(byte[].class, ArraysMapper.MAPPER_PRIM_BYTE);
        concurrentHashMap.put(Byte[].class, ArraysMapper.MAPPER_BYTE);
        concurrentHashMap.put(char[].class, ArraysMapper.MAPPER_PRIM_CHAR);
        concurrentHashMap.put(Character[].class, ArraysMapper.MAPPER_CHAR);
        concurrentHashMap.put(float[].class, ArraysMapper.MAPPER_PRIM_FLOAT);
        concurrentHashMap.put(Float[].class, ArraysMapper.MAPPER_FLOAT);
        concurrentHashMap.put(double[].class, ArraysMapper.MAPPER_PRIM_DOUBLE);
        concurrentHashMap.put(Double[].class, ArraysMapper.MAPPER_DOUBLE);
        concurrentHashMap.put(boolean[].class, ArraysMapper.MAPPER_PRIM_BOOL);
        concurrentHashMap.put(Boolean[].class, ArraysMapper.MAPPER_BOOL);
        this.DEFAULT = new DefaultMapper(this);
        this.DEFAULT_ORDERED = new DefaultMapperOrdered(this);
        concurrentHashMap.put(JSONAwareEx.class, this.DEFAULT);
        concurrentHashMap.put(JSONAware.class, this.DEFAULT);
        concurrentHashMap.put(JSONArray.class, this.DEFAULT);
        concurrentHashMap.put(JSONObject.class, this.DEFAULT);
    }
}
