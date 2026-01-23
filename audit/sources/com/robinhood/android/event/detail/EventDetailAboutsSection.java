package com.robinhood.android.event.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: EventDetailAboutsSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.ComposableSingletons$EventDetailAboutsSectionKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventDetailAboutsSection {
    public static final EventDetailAboutsSection INSTANCE = new EventDetailAboutsSection();
    private static Function2<Composer, Integer, Unit> lambda$172443697 = ComposableLambda3.composableLambdaInstance(172443697, false, EventDetailAboutsSection2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$172443697$feature_event_detail_externalDebug() {
        return lambda$172443697;
    }
}
