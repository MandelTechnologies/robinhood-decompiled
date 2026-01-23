package p479j$.time.temporal;

import java.util.Map;
import p479j$.time.format.C45757B;
import p479j$.time.format.ResolverStyle;

/* loaded from: classes29.dex */
public interface TemporalField {
    <R extends Temporal> R adjustInto(R r, long j);

    long getFrom(TemporalAccessor temporalAccessor);

    boolean isDateBased();

    boolean isSupportedBy(TemporalAccessor temporalAccessor);

    ValueRange range();

    ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor);

    /* renamed from: c */
    default TemporalAccessor mo3597c(Map map, C45757B c45757b, ResolverStyle resolverStyle) {
        return null;
    }
}
