package microgram.manifest;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: DeployJson.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"DeployJson", "Lkotlinx/serialization/json/Json;", "getDeployJson", "()Lkotlinx/serialization/json/Json;", "microgram-manifest"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.manifest.DeployJsonKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class DeployJson {
    private static final Json DeployJson = Json6.Json$default(null, new Function1() { // from class: microgram.manifest.DeployJsonKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return DeployJson.DeployJson$lambda$0((Json4) obj);
        }
    }, 1, null);

    public static final Json getDeployJson() {
        return DeployJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeployJson$lambda$0(Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
