package com.robinhood.utils.extensions;

import com.robinhood.utils.p408rx.error.RxErrorCheckpoint;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;

/* compiled from: Consumers.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/extensions/Consumers;", "", "<init>", "()V", "onError", "Lio/reactivex/functions/Consumer;", "", "onErrorLambda", "Lkotlin/Function1;", "", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Consumers {
    public static final Consumers INSTANCE = new Consumers();

    private Consumers() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final Consumer<Throwable> onError() {
        return new RxErrorCheckpoint(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Function1<Throwable, Unit> onErrorLambda() {
        return new RxErrorCheckpoint(null, 1, 0 == true ? 1 : 0);
    }
}
