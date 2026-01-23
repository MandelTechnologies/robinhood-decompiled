package com.stripe.hcaptcha.encode;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: Encode.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\b\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "", "encodeToJson", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "getJson$annotations", "()V", "hcaptcha_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.hcaptcha.encode.EncodeKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Encode2 {
    private static final Json json = Json6.Json$default(null, new Function1<Json4, Unit>() { // from class: com.stripe.hcaptcha.encode.EncodeKt$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Json4 json4) {
            invoke2(json4);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            Json.setLenient(true);
            Json.setEncodeDefaults(true);
        }
    }, 1, null);

    public static final <T> String encodeToJson(KSerializer3<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return json.encodeToString(serializer, t);
    }
}
