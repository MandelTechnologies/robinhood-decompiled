package io.ktor.serialization.kotlinx.json;

import io.ktor.http.ContentTypes2;
import io.ktor.serialization.ContentConverter2;
import io.ktor.serialization.kotlinx.KotlinxSerializationConverter4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: JsonSupport.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a%\u0010\u0002\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0002\u0010\u0006\"\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lio/ktor/serialization/Configuration;", "Lkotlinx/serialization/json/Json;", "json", "Lio/ktor/http/ContentType;", "contentType", "", "(Lio/ktor/serialization/Configuration;Lkotlinx/serialization/json/Json;Lio/ktor/http/ContentType;)V", "DefaultJson", "Lkotlinx/serialization/json/Json;", "getDefaultJson", "()Lkotlinx/serialization/json/Json;", "ktor-serialization-kotlinx-json"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.serialization.kotlinx.json.JsonSupportKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonSupport {
    private static final Json DefaultJson = Json6.Json$default(null, new Function1<Json4, Unit>() { // from class: io.ktor.serialization.kotlinx.json.JsonSupportKt$DefaultJson$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Json4 json4) {
            invoke2(json4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setEncodeDefaults(true);
            Json.setLenient(true);
            Json.setAllowSpecialFloatingPointValues(true);
            Json.setAllowStructuredMapKeys(true);
            Json.setPrettyPrint(false);
            Json.setUseArrayPolymorphism(false);
        }
    }, 1, null);

    public static /* synthetic */ void json$default(ContentConverter2 contentConverter2, Json json, ContentTypes2 contentTypes2, int i, Object obj) {
        if ((i & 1) != 0) {
            json = DefaultJson;
        }
        if ((i & 2) != 0) {
            contentTypes2 = ContentTypes2.Application.INSTANCE.getJson();
        }
        json(contentConverter2, json, contentTypes2);
    }

    public static final void json(ContentConverter2 contentConverter2, Json json, ContentTypes2 contentType) {
        Intrinsics.checkNotNullParameter(contentConverter2, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        KotlinxSerializationConverter4.serialization(contentConverter2, contentType, json);
    }
}
