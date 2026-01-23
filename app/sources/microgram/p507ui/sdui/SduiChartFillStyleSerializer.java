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
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiChartFillStyleSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lmicrogram/ui/sdui/SduiChartFillStyle;", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class SduiChartFillStyleSerializer extends JsonContentPolymorphicSerializer<SduiChartFillStyle> {
    public static final SduiChartFillStyleSerializer INSTANCE = new SduiChartFillStyleSerializer();

    private SduiChartFillStyleSerializer() {
        super(Reflection.getOrCreateKotlinClass(SduiChartFillStyle.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    protected KSerializer2<SduiChartFillStyle> selectDeserializer(JsonElement element) throws Exception {
        JsonElement7 jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElement3.getJsonObject(element).get((Object) "type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElement3.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -1325970902:
                    if (content.equals("dotted")) {
                        return SduiDottedChartFillStyle.INSTANCE.serializer();
                    }
                    break;
                case 31248693:
                    if (content.equals("gradient_animation")) {
                        return SduiGradientAnimationChartFillStyle.INSTANCE.serializer();
                    }
                    break;
                case 89650992:
                    if (content.equals("gradient")) {
                        return SduiGradientChartFillStyle.INSTANCE.serializer();
                    }
                    break;
                case 541237821:
                    if (content.equals("rounded_solid_color")) {
                        return SduiRoundedSolidChartFillStyle.INSTANCE.serializer();
                    }
                    break;
                case 1216433359:
                    if (content.equals("solid_color")) {
                        return SduiSolidChartFillStyle.INSTANCE.serializer();
                    }
                    break;
            }
        }
        throw new Exception("ERROR: No Serializer found. Serialization failed");
    }
}
