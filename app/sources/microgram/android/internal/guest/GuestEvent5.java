package microgram.android.internal.guest;

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

/* compiled from: GuestEvent.kt */
@SerialName("init")
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/android/internal/guest/InitEvent;", "Lmicrogram/android/internal/guest/GuestEvent;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* renamed from: microgram.android.internal.guest.InitEvent, reason: use source file name */
/* loaded from: classes14.dex */
public final class GuestEvent5 extends GuestEvent {
    public static final GuestEvent5 INSTANCE = new GuestEvent5();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: microgram.android.internal.guest.InitEvent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return GuestEvent5._init_$_anonymous_();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ObjectSerializer("init", INSTANCE, new Annotation[]{new GuestEvent4("type")});
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<GuestEvent5> serializer() {
        return get$cachedSerializer();
    }

    private GuestEvent5() {
        super(null);
    }
}
