package microgram.service.protocol;

import com.robinhood.android.car.result.CarResultComposable2;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.JsonElement;

/* compiled from: ServiceCallable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/service/protocol/ServiceCallable;", "", "call", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/serialization/json/JsonElement;", CarResultComposable2.BODY, "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface ServiceCallable {
    Flow<JsonElement> call(JsonElement body);
}
