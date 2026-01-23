package microgram.service.protocol;

import java.lang.annotation.Annotation;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations;
import microgram.service.protocol.ProtocolMessage3;
import microgram.service.protocol.ProtocolMessage6;

/* compiled from: ProtocolMessage.kt */
@JsonAnnotations(discriminator = "kind")
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lmicrogram/service/protocol/ProtocolMessage;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lmicrogram/service/protocol/ProtocolMessage;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Lmicrogram/service/protocol/Request;", "Lmicrogram/service/protocol/Response;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public abstract class ProtocolMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.service.protocol.ProtocolMessage$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ProtocolMessage._init_$_anonymous_();
        }
    });

    public /* synthetic */ ProtocolMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(ProtocolMessage self, Encoding3 output, SerialDescriptor serialDesc) {
    }

    private ProtocolMessage() {
    }

    public /* synthetic */ ProtocolMessage(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* compiled from: ProtocolMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lmicrogram/service/protocol/ProtocolMessage$Companion;", "", "<init>", "()V", "DISCRIMINATOR", "", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/service/protocol/ProtocolMessage;", "microgram-service"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) ProtocolMessage.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ProtocolMessage> serializer() {
            return get$cachedSerializer();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedSerializer("microgram.service.protocol.ProtocolMessage", Reflection.getOrCreateKotlinClass(ProtocolMessage.class), new KClass[]{Reflection.getOrCreateKotlinClass(ProtocolMessage3.Call.class), Reflection.getOrCreateKotlinClass(ProtocolMessage3.Cancellation.class), Reflection.getOrCreateKotlinClass(ProtocolMessage6.Emission.class), Reflection.getOrCreateKotlinClass(ProtocolMessage6.Termination.class)}, new KSerializer[]{ProtocolMessage4.INSTANCE, ProtocolMessage5.INSTANCE, ProtocolMessage7.INSTANCE, ProtocolMessage8.INSTANCE}, new Annotation[]{new ProtocolMessage2("kind")});
    }
}
