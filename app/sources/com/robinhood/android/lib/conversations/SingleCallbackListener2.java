package com.robinhood.android.lib.conversations;

import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.CancellationToken;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleCallbackListener.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001¢\u0006\u0002\b\b\u001a7\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u0005H\u0001¢\u0006\u0002\b\f¨\u0006\r"}, m3636d2 = {"singleFrom", "Lio/reactivex/Single;", "T", "", "block", "Lkotlin/Function1;", "Lcom/twilio/conversations/CallbackListener;", "Lcom/twilio/conversations/CancellationToken;", "callbackToSingleWithCancellationToken", "singleFromUncancellable", "function", "", "callbackToSingle", "lib-conversations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.conversations.SingleCallbackListenerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SingleCallbackListener2 {
    @JvmName
    public static final <T> Single<T> callbackToSingleWithCancellationToken(final Function1<? super CallbackListener<T>, ? extends CancellationToken> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Single<T> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.lib.conversations.SingleCallbackListenerKt$singleFrom$1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter<T> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                final CancellationToken cancellationTokenInvoke = block.invoke(new SingleCallbackListener(emitter));
                emitter.setCancellable(new Cancellable() { // from class: com.robinhood.android.lib.conversations.SingleCallbackListenerKt$singleFrom$1.1
                    @Override // io.reactivex.functions.Cancellable
                    public final void cancel() {
                        cancellationTokenInvoke.cancel();
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        return singleCreate;
    }

    @JvmName
    public static final <T> Single<T> callbackToSingle(final Function1<? super CallbackListener<T>, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        Single<T> singleCreate = Single.create(new SingleOnSubscribe() { // from class: com.robinhood.android.lib.conversations.SingleCallbackListenerKt$singleFromUncancellable$1
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter<T> emitter) {
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                function.invoke(new SingleCallbackListener(emitter));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleCreate, "create(...)");
        return singleCreate;
    }
}
