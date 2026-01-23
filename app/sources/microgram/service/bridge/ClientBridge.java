package microgram.service.bridge;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.JsonElement;
import microgram.service.protocol.ProtocolMessageSubscriber;

/* compiled from: ClientBridge.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/service/bridge/ClientBridge;", "Lmicrogram/service/protocol/ProtocolMessageSubscriber;", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "limit", "", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ClientBridge extends ProtocolMessageSubscriber {
    Flow<JsonElement> call(JsonElement body, Integer limit);
}
