package microgram.manifest;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.json.JsonAnnotations;

/* compiled from: Rollout.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u0003*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lmicrogram/manifest/Rollout;", "", "C", "Companion", "Lmicrogram/manifest/DefaultRollout;", "Lmicrogram/manifest/ExperimentRollout;", "Lmicrogram/manifest/PercentageRollout;", "Lmicrogram/manifest/TimePhasedRollout;", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
@JsonAnnotations(discriminator = "type")
/* loaded from: classes14.dex */
public interface Rollout<C> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Rollout.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, m3636d2 = {"Lmicrogram/manifest/Rollout$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/manifest/Rollout;", "C", "typeSerial0", "microgram-manifest"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <C> KSerializer<Rollout<C>> serializer(KSerializer<C> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new SealedSerializer("microgram.manifest.Rollout", Reflection.getOrCreateKotlinClass(Rollout.class), new KClass[]{Reflection.getOrCreateKotlinClass(DefaultRollout.class), Reflection.getOrCreateKotlinClass(ExperimentRollout.class), Reflection.getOrCreateKotlinClass(PercentageRollout.class), Reflection.getOrCreateKotlinClass(TimePhasedRollout.class)}, new KSerializer[]{new ObjectSerializer(AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, DefaultRollout.INSTANCE, new Annotation[]{new C46777xba650a2e("type")}), ExperimentRollout$$serializer.INSTANCE, PercentageRollout$$serializer.INSTANCE, TimePhasedRollout$$serializer.INSTANCE}, new Annotation[]{new C46777xba650a2e("type")});
        }
    }
}
