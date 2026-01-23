package microgram.android.internal.bundle.rollout;

import com.robinhood.prefs.LongPreference;
import io.github.z4kn4fein.semver.Version;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.Random2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: AudienceIdProvider.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\tH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/bundle/rollout/RealAudienceIdProvider;", "Lmicrogram/android/internal/bundle/rollout/AudienceIdProvider;", "audienceIdPref", "Lcom/robinhood/prefs/LongPreference;", "random", "Lkotlin/random/Random;", "<init>", "(Lcom/robinhood/prefs/LongPreference;Lkotlin/random/Random;)V", "getOrAssignAudienceId", "", "appIdentifier", "", "version", "Lio/github/z4kn4fein/semver/Version;", "getOrAssignBaseAudienceId", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: microgram.android.internal.bundle.rollout.RealAudienceIdProvider, reason: use source file name */
/* loaded from: classes14.dex */
public final class AudienceIdProvider2 implements AudienceIdProvider {
    private final LongPreference audienceIdPref;
    private final Random random;

    public AudienceIdProvider2(LongPreference audienceIdPref, Random random) {
        Intrinsics.checkNotNullParameter(audienceIdPref, "audienceIdPref");
        Intrinsics.checkNotNullParameter(random, "random");
        this.audienceIdPref = audienceIdPref;
        this.random = random;
    }

    @Override // microgram.android.internal.bundle.rollout.AudienceIdProvider
    public long getOrAssignAudienceId(String appIdentifier, Version version) {
        Intrinsics.checkNotNullParameter(appIdentifier, "appIdentifier");
        Intrinsics.checkNotNullParameter(version, "version");
        Sequence sequenceFlatMapIterable = SequencesKt.flatMapIterable(SequencesKt.sequenceOf(appIdentifier, version.toString()), new Function1() { // from class: microgram.android.internal.bundle.rollout.RealAudienceIdProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudienceIdProvider2.getOrAssignAudienceId$lambda$0((String) obj);
            }
        });
        long orAssignBaseAudienceId = getOrAssignBaseAudienceId();
        Iterator itIterator2 = sequenceFlatMapIterable.iterator2();
        while (itIterator2.hasNext()) {
            orAssignBaseAudienceId ^= ((Character) r7.component2()).charValue() << (((IndexedValue) itIterator2.next()).getIndex() % 64);
        }
        return orAssignBaseAudienceId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable getOrAssignAudienceId$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.withIndex(it);
    }

    private final synchronized long getOrAssignBaseAudienceId() {
        long jNextLong;
        try {
            if (this.audienceIdPref.isSet() && this.audienceIdPref.get() != -1) {
                jNextLong = this.audienceIdPref.get();
            } else {
                jNextLong = Random2.nextLong(this.random, RangesKt.until(0, Long.MAX_VALUE));
                this.audienceIdPref.set(jNextLong);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jNextLong;
    }
}
