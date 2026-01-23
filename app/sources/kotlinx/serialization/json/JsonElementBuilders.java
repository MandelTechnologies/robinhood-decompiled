package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: JsonElementBuilders.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0005\u001a4\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\f\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "key", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Lkotlinx/serialization/json/JsonElement;", "putJsonObject", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonElement;", "", "value", "put", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/JsonElement;", "(Lkotlinx/serialization/json/JsonObjectBuilder;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.serialization.json.JsonElementBuildersKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonElementBuilders {
    public static final JsonElement putJsonObject(JsonElementBuilders2 jsonElementBuilders2, String key, Function1<? super JsonElementBuilders2, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(jsonElementBuilders2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonElementBuilders2 jsonElementBuilders22 = new JsonElementBuilders2();
        builderAction.invoke(jsonElementBuilders22);
        return jsonElementBuilders2.put(key, jsonElementBuilders22.build());
    }

    public static final JsonElement put(JsonElementBuilders2 jsonElementBuilders2, String key, Number number) {
        Intrinsics.checkNotNullParameter(jsonElementBuilders2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonElementBuilders2.put(key, JsonElement3.JsonPrimitive(number));
    }

    public static final JsonElement put(JsonElementBuilders2 jsonElementBuilders2, String key, String str) {
        Intrinsics.checkNotNullParameter(jsonElementBuilders2, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return jsonElementBuilders2.put(key, JsonElement3.JsonPrimitive(str));
    }
}
