package microgram;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer3;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import microgram.serialization.JsonHelpers;

/* compiled from: Message.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlin/reflect/KType;", "type", "", "value", "Lmicrogram/Message;", "encodeToMessage", "(Lkotlinx/serialization/json/Json;Lkotlin/reflect/KType;Ljava/lang/Object;)Lmicrogram/Message;", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Lmicrogram/Message;", "microgram-core"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.MessageKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Message3 {
    public static final Message encodeToMessage(Json json, KType type2, Object obj) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        return encodeToMessage(json, SerializersKt.serializer(json.getSerializersModule(), type2), obj);
    }

    public static final <T> Message encodeToMessage(Json json, KSerializer3<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return new Message(JsonHelpers.encodeToStringFast(json, serializer, t), null, 2, null);
    }
}
