package microgram.p507ui.core.screen;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

/* compiled from: ScreenEventMessage.kt */
@SerialName("TEARDOWN")
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nHÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lmicrogram/ui/core/screen/ScreenTeardownMessage;", "Lmicrogram/ui/core/screen/ScreenEventMessage;", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "core"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class ScreenTeardownMessage extends ScreenEventMessage {
    public static final ScreenTeardownMessage INSTANCE = new ScreenTeardownMessage();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.core.screen.ScreenTeardownMessage.1
        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return new ObjectSerializer("TEARDOWN", ScreenTeardownMessage.INSTANCE, new Annotation[]{new C46812xc4ce9206("message_type")});
        }
    });

    public boolean equals(Object other) {
        return this == other || (other instanceof ScreenTeardownMessage);
    }

    public int hashCode() {
        return -1824910019;
    }

    public String toString() {
        return "ScreenTeardownMessage";
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<ScreenTeardownMessage> serializer() {
        return get$cachedSerializer();
    }

    private ScreenTeardownMessage() {
        super(null);
    }
}
