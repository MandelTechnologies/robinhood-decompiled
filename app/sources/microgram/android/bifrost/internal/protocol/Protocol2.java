package microgram.android.bifrost.internal.protocol;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* compiled from: Protocol.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"Lkotlinx/serialization/json/Json;", "JSON", "Lkotlinx/serialization/json/Json;", "getJSON", "()Lkotlinx/serialization/json/Json;", "getJSON$annotations", "()V", "lib-microgram-bifrost_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.bifrost.internal.protocol.ProtocolKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class Protocol2 {
    private static final Json JSON = Json6.Json$default(null, new Function1() { // from class: microgram.android.bifrost.internal.protocol.ProtocolKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Protocol2.JSON$lambda$0((Json4) obj);
        }
    }, 1, null);

    public static final Json getJSON() {
        return JSON;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JSON$lambda$0(Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setClassDiscriminator("_className");
        Json.setIgnoreUnknownKeys(true);
        Json.setExplicitNulls(false);
        return Unit.INSTANCE;
    }
}
