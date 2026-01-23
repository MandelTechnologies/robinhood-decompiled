package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElement2;
import kotlinx.serialization.json.JsonElement6;
import kotlinx.serialization.json.JsonElement7;
import kotlinx.serialization.json.JsonElementSerializers;
import kotlinx.serialization.json.JsonElementSerializers6;

/* compiled from: TreeJsonEncoder.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lkotlinx/serialization/json/internal/JsonTreeMapEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "tag", "", "isKey", "", "putElement", "key", "element", "getCurrent", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.JsonTreeMapEncoder, reason: use source file name */
/* loaded from: classes14.dex */
final class TreeJsonEncoder5 extends TreeJsonEncoder3 {
    private boolean isKey;
    private String tag;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreeJsonEncoder5(Json json, Function1<? super JsonElement, Unit> nodeConsumer) {
        super(json, nodeConsumer);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.TreeJsonEncoder3, kotlinx.serialization.json.internal.TreeJsonEncoder
    public void putElement(String key, JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.isKey) {
            if (element instanceof JsonElement7) {
                this.tag = ((JsonElement7) element).getContent();
                this.isKey = false;
                return;
            } else {
                if (element instanceof JsonElement6) {
                    throw JsonExceptions4.InvalidKeyKindException(JsonElementSerializers6.INSTANCE.getDescriptor());
                }
                if (!(element instanceof JsonElement2)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw JsonExceptions4.InvalidKeyKindException(JsonElementSerializers.INSTANCE.getDescriptor());
            }
        }
        Map<String, JsonElement> content = getContent();
        String str = this.tag;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            str = null;
        }
        content.put(str, element);
        this.isKey = true;
    }

    @Override // kotlinx.serialization.json.internal.TreeJsonEncoder3, kotlinx.serialization.json.internal.TreeJsonEncoder
    public JsonElement getCurrent() {
        return new JsonElement6(getContent());
    }
}
