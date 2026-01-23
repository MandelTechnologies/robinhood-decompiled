package microgram.p507ui.core.screen;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations;

/* compiled from: ScreenEventMessage.kt */
@JsonAnnotations(discriminator = "message_type")
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eHÇ\u0001\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/ui/core/screen/ScreenEventMessage;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lmicrogram/ui/core/screen/ActionTriggeredMessage;", "Lmicrogram/ui/core/screen/ScreenAppearedMessage;", "Lmicrogram/ui/core/screen/ScreenDisappearedMessage;", "Lmicrogram/ui/core/screen/ScreenStateUpdatedMessage;", "Lmicrogram/ui/core/screen/ScreenTeardownMessage;", "core"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public abstract class ScreenEventMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.core.screen.ScreenEventMessage.Companion.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new SealedSerializer("microgram.ui.core.screen.ScreenEventMessage", Reflection.getOrCreateKotlinClass(ScreenEventMessage.class), new KClass[]{Reflection.getOrCreateKotlinClass(ActionTriggeredMessage.class), Reflection.getOrCreateKotlinClass(ScreenAppearedMessage.class), Reflection.getOrCreateKotlinClass(ScreenDisappearedMessage.class), Reflection.getOrCreateKotlinClass(ScreenStateUpdatedMessage.class), Reflection.getOrCreateKotlinClass(ScreenTeardownMessage.class)}, new KSerializer[]{ActionTriggeredMessage$$serializer.INSTANCE, new ObjectSerializer("APPEARED", ScreenAppearedMessage.INSTANCE, new Annotation[]{new C46812xc4ce9206("message_type")}), new ObjectSerializer("DISAPPEARED", ScreenDisappearedMessage.INSTANCE, new Annotation[]{new C46812xc4ce9206("message_type")}), ScreenStateUpdatedMessage$$serializer.INSTANCE, new ObjectSerializer("TEARDOWN", ScreenTeardownMessage.INSTANCE, new Annotation[]{new C46812xc4ce9206("message_type")})}, new Annotation[]{new C46812xc4ce9206("message_type")});
        }
    });

    public /* synthetic */ ScreenEventMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ScreenEventMessage self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    /* compiled from: ScreenEventMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/core/screen/ScreenEventMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/core/screen/ScreenEventMessage;", "core"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ScreenEventMessage.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ScreenEventMessage> serializer() {
            return get$cachedSerializer();
        }
    }

    private ScreenEventMessage() {
    }

    @Deprecated
    public /* synthetic */ ScreenEventMessage(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
