package microgram.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import kotlinx.serialization.modules.SerializersModule;
import microgram.serialization.SerializationComponent;

/* compiled from: SerializationComponent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m3636d2 = {"Lmicrogram/serialization/SerializationComponent;", "", "Companion", "microgram-serialization"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface SerializationComponent {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: SerializationComponent.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/serialization/SerializationComponent$Companion;", "", "<init>", "()V", "defaultJson", "Lkotlinx/serialization/json/Json;", "serializers", "Lkotlinx/serialization/modules/SerializersModule;", "microgram-serialization"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Json defaultJson(final SerializersModule serializers) {
            Intrinsics.checkNotNullParameter(serializers, "serializers");
            return Json6.Json$default(null, new Function1() { // from class: microgram.serialization.SerializationComponent$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SerializationComponent.Companion.defaultJson$lambda$0(serializers, (Json4) obj);
                }
            }, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit defaultJson$lambda$0(SerializersModule serializersModule, Json4 Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setCoerceInputValues(true);
            Json.setIgnoreUnknownKeys(true);
            Json.setEncodeDefaults(true);
            Json.setExplicitNulls(false);
            Json.setClassDiscriminator("_className");
            Json.setSerializersModule(serializersModule);
            return Unit.INSTANCE;
        }
    }
}
