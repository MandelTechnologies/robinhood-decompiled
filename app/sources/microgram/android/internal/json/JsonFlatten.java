package microgram.android.internal.json;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement5;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.json.JsonElementBuilders2;

/* compiled from: JsonFlatten.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¨\u0006\b"}, m3636d2 = {"flattenTo", "", "Lkotlinx/serialization/json/JsonElement;", "result", "Lkotlinx/serialization/json/JsonObjectBuilder;", "keys", "", "", "lib-microgram_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.json.JsonFlattenKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class JsonFlatten {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void flattenTo(JsonElement jsonElement, JsonElementBuilders2 result, List<String> keys) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(keys, "keys");
        if ((jsonElement instanceof JsonElement5) || (jsonElement instanceof JsonElement7)) {
            result.put(CollectionsKt.joinToString$default(keys, ".", null, null, 0, null, null, 62, null), jsonElement);
            return;
        }
        if (jsonElement instanceof JsonElement2) {
            Iterator it = ((Iterable) jsonElement).iterator();
            int i = 0;
            while (it.hasNext()) {
                flattenTo((JsonElement) it.next(), result, CollectionsKt.plus((Collection<? extends String>) keys, String.valueOf(i)));
                i++;
            }
            return;
        }
        if (!(jsonElement instanceof JsonElement6)) {
            throw new NoWhenBranchMatchedException();
        }
        for (Map.Entry entry : ((Map) jsonElement).entrySet()) {
            flattenTo((JsonElement) entry.getValue(), result, CollectionsKt.plus((Collection<? extends String>) keys, (String) entry.getKey()));
        }
    }
}
