package com.robinhood.api.utils;

import com.robinhood.api.ErrorResumer;
import io.reactivex.Maybe;
import io.reactivex.MaybeTransformer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkTransformer.kt */
@kotlin.Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0004B;\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkTransformer;", "T", "", "Lcom/robinhood/api/utils/NetworkRequestHandler;", "Lio/reactivex/MaybeTransformer;", "metadata", "Lcom/robinhood/api/utils/Metadata;", "metadataSubject", "Lio/reactivex/subjects/BehaviorSubject;", "saveAction", "Lkotlin/Function1;", "", "allowErrors", "", "<init>", "(Lcom/robinhood/api/utils/Metadata;Lio/reactivex/subjects/BehaviorSubject;Lkotlin/jvm/functions/Function1;Z)V", "apply", "Lio/reactivex/Maybe;", "upstream", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class NetworkTransformer<T> extends NetworkRequestHandler<T> implements MaybeTransformer<T, T> {
    private final boolean allowErrors;

    public /* synthetic */ NetworkTransformer(Metadata metadata, BehaviorSubject behaviorSubject, Function1 function1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(metadata, behaviorSubject, function1, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTransformer(Metadata metadata, BehaviorSubject<Metadata> metadataSubject, Function1<? super T, Unit> saveAction, boolean z) {
        super(metadata, metadataSubject, saveAction);
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(metadataSubject, "metadataSubject");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        this.allowErrors = z;
    }

    @Override // io.reactivex.MaybeTransformer
    public Maybe<T> apply(Maybe<T> upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Maybe<T> maybeDoOnSuccess = upstream.observeOn(Schedulers.m3346io()).onErrorResumeNext(new ErrorResumer(this, this.allowErrors)).doOnSubscribe(new Consumer(this) { // from class: com.robinhood.api.utils.NetworkTransformer.apply.1
            final /* synthetic */ NetworkTransformer<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                this.this$0.onRequestStarting();
            }
        }).doFinally(new Action(this) { // from class: com.robinhood.api.utils.NetworkTransformer.apply.2
            final /* synthetic */ NetworkTransformer<T> $tmp0;

            {
                this.$tmp0 = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                this.$tmp0.onRequestEnding();
            }
        }).doOnSuccess(new Consumer(this) { // from class: com.robinhood.api.utils.NetworkTransformer.apply.3
            final /* synthetic */ NetworkTransformer<T> $tmp0;

            {
                this.$tmp0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(T p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.$tmp0.on200Response(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeDoOnSuccess, "doOnSuccess(...)");
        return maybeDoOnSuccess;
    }
}
