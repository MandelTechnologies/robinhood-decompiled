package com.plaid.internal.classic.networking.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.plaid.link.result.LinkErrorType;
import java.lang.reflect.Type;
import kotlin.Metadata;

@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/plaid/internal/classic/networking/adapter/PlaidErrorTypeAdapter;", "Lcom/google/gson/JsonSerializer;", "Lcom/plaid/link/result/LinkErrorType;", "Lcom/google/gson/JsonDeserializer;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PlaidErrorTypeAdapter implements JsonSerializer<LinkErrorType>, JsonDeserializer<LinkErrorType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public LinkErrorType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        if (json == null) {
            return new LinkErrorType.UNKNOWN("null");
        }
        try {
            return LinkErrorType.INSTANCE.convert(json.getAsString());
        } catch (Exception unused) {
            return new LinkErrorType.UNKNOWN("null");
        }
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(LinkErrorType src, Type typeOfSrc, JsonSerializationContext context) {
        String json;
        if (src == null || (json = src.getJson()) == null) {
            json = "";
        }
        return new JsonPrimitive(json);
    }
}
