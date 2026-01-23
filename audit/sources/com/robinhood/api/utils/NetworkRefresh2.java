package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: NetworkRefresh.kt */
@kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.NetworkRefresh$saveAction$1$1, reason: use source file name */
/* loaded from: classes16.dex */
/* synthetic */ class NetworkRefresh2<T> extends FunctionReferenceImpl implements Function1<T, Unit> {
    NetworkRefresh2(Object obj) {
        super(1, obj, SaveAction.class, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "save(Ljava/lang/Object;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((NetworkRefresh2<T>) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SaveAction) this.receiver).save(p0);
    }
}
