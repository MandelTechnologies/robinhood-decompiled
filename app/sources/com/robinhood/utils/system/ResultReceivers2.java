package com.robinhood.utils.system;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.jakewharton.rxrelay2.BehaviorRelay;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResultReceivers.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/system/RxResultReceiver;", "Landroid/os/ResultReceiver;", "<init>", "()V", "relay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/system/RemoteResultData;", "onReceiveResult", "", "resultCode", "", "resultData", "Landroid/os/Bundle;", "asObservable", "Lio/reactivex/Observable;", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.system.RxResultReceiver, reason: use source file name */
/* loaded from: classes12.dex */
public final class ResultReceivers2 extends ResultReceiver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BehaviorRelay<RemoteResultData> relay;

    public ResultReceivers2() {
        super(null);
        BehaviorRelay<RemoteResultData> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.relay = behaviorRelayCreate;
    }

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int resultCode, Bundle resultData) {
        this.relay.accept(new RemoteResultData(resultCode, resultData));
    }

    public final Observable<RemoteResultData> asObservable() {
        Observable<RemoteResultData> observableTake = this.relay.take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }

    /* compiled from: ResultReceivers.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/system/RxResultReceiver$Companion;", "", "<init>", "()V", "call", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/system/RemoteResultData;", "block", "Lkotlin/Function1;", "Landroid/os/ResultReceiver;", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.utils.system.RxResultReceiver$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Observable<RemoteResultData> call(Function1<? super ResultReceiver, Boolean> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            ResultReceivers2 resultReceivers2 = new ResultReceivers2();
            if (block.invoke(resultReceivers2).booleanValue()) {
                return resultReceivers2.asObservable();
            }
            Observable<RemoteResultData> observableEmpty = Observable.empty();
            Intrinsics.checkNotNullExpressionValue(observableEmpty, "empty(...)");
            return observableEmpty;
        }
    }
}
