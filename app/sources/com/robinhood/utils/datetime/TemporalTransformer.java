package com.robinhood.utils.datetime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: TemporalTransformer.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0004:\u0001\bJ\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/datetime/TemporalTransformer;", "j$/time/temporal/TemporalAccessor", "T", "R", "", "source", "transform", "(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/TemporalAccessor;", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TemporalTransformer<T extends TemporalAccessor, R extends TemporalAccessor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    R transform(T source);

    /* compiled from: TemporalTransformer.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\b\b\u0003\u0010\u0006*\u00020\u00042\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007H\u0086\nø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/datetime/TemporalTransformer$Companion;", "", "<init>", "()V", "j$/time/temporal/TemporalAccessor", "T", "R", "Lkotlin/Function1;", "transform", "Lcom/robinhood/utils/datetime/TemporalTransformer;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/utils/datetime/TemporalTransformer;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T extends TemporalAccessor, R extends TemporalAccessor> TemporalTransformer<T, R> invoke(Function1<? super T, ? extends R> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return new TemporalTransformer5(transform);
        }
    }
}
