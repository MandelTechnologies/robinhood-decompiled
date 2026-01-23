package com.robinhood.utils.datetime;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.temporal.TemporalAccessor;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* compiled from: TemporalTransformer.kt */
@Metadata(m3635d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"com/robinhood/utils/datetime/TemporalTransformer$Companion$invoke$1", "Lcom/robinhood/utils/datetime/TemporalTransformer;", "source", "transform", "(Lj$/time/temporal/TemporalAccessor;)Lj$/time/temporal/TemporalAccessor;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
/* renamed from: com.robinhood.utils.datetime.TemporalTransformer$Companion$invoke$1, reason: use source file name */
/* loaded from: classes12.dex */
public final class TemporalTransformer5<R, T> implements TemporalTransformer<T, R> {
    final /* synthetic */ Function1<T, R> $transform;

    /* JADX WARN: Multi-variable type inference failed */
    public TemporalTransformer5(Function1<? super T, ? extends R> function1) {
        this.$transform = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (TT;)TR; */
    @Override // com.robinhood.utils.datetime.TemporalTransformer
    public TemporalAccessor transform(TemporalAccessor source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return (TemporalAccessor) this.$transform.invoke(source);
    }
}
