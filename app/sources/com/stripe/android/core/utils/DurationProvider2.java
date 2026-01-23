package com.stripe.android.core.utils;

import android.os.SystemClock;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.utils.DurationProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: DurationProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"Lcom/stripe/android/core/utils/DefaultDurationProvider;", "Lcom/stripe/android/core/utils/DurationProvider;", "()V", PlaceTypes.STORE, "", "Lcom/stripe/android/core/utils/DurationProvider$Key;", "", "end", "Lkotlin/time/Duration;", "key", "end-LV8wdWc", "start", "", "reset", "", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.utils.DefaultDurationProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class DurationProvider2 implements DurationProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DurationProvider2 instance = new DurationProvider2();
    private final Map<DurationProvider.Key, Long> store = new LinkedHashMap();

    private DurationProvider2() {
    }

    @Override // com.stripe.android.core.utils.DurationProvider
    public void start(DurationProvider.Key key, boolean reset) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (reset || !this.store.containsKey(key)) {
            this.store.put(key, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    @Override // com.stripe.android.core.utils.DurationProvider
    /* renamed from: end-LV8wdWc, reason: not valid java name */
    public Duration mo26848endLV8wdWc(DurationProvider.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Long lRemove = this.store.remove(key);
        if (lRemove == null) {
            return null;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - lRemove.longValue();
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m28726boximpl(Duration3.toDuration(jUptimeMillis, DurationUnitJvm.MILLISECONDS));
    }

    /* compiled from: DurationProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/core/utils/DefaultDurationProvider$Companion;", "", "()V", "instance", "Lcom/stripe/android/core/utils/DefaultDurationProvider;", "getInstance", "()Lcom/stripe/android/core/utils/DefaultDurationProvider;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.core.utils.DefaultDurationProvider$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DurationProvider2 getInstance() {
            return DurationProvider2.instance;
        }
    }
}
