package microgram.p507ui.sdui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer2;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement3;
import kotlinx.serialization.json.JsonElement7;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartAxisRangeSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lmicrogram/ui/sdui/SduiChartAxisRange;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SduiChartAxisRangeSerializer extends JsonContentPolymorphicSerializer<SduiChartAxisRange> {
    public static final SduiChartAxisRangeSerializer INSTANCE = new SduiChartAxisRangeSerializer();

    private SduiChartAxisRangeSerializer() {
        super(Reflection.getOrCreateKotlinClass(SduiChartAxisRange.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    protected KSerializer2<SduiChartAxisRange> selectDeserializer(JsonElement element) throws Exception {
        JsonElement7 jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElement3.getJsonObject(element).get((Object) "type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (Intrinsics.areEqual(content, "money")) {
            return SduiMoneyAxisRange.INSTANCE.serializer();
        }
        if (Intrinsics.areEqual(content, "unitless")) {
            return SduiUnitlessAxisRange.INSTANCE.serializer();
        }
        throw new Exception("ERROR: No Serializer found. Serialization failed");
    }
}
