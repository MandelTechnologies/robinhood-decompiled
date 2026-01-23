package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: NetworkRefresh.kt */
@kotlin.Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B#\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u000e\u0010\u0013J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0017\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001aJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001cJ\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)¨\u0006*"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkRefresh;", "", "T", "Lkotlin/Function2;", "", "j$/time/Instant", "", "staleDecider", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "Lio/reactivex/Maybe;", "networkMaybe", "(Lio/reactivex/Maybe;)Lcom/robinhood/api/utils/NetworkRefresh;", "Lcom/robinhood/api/utils/SaveAction;", "saveAction", "(Lcom/robinhood/api/utils/SaveAction;)Lcom/robinhood/api/utils/NetworkRefresh;", "Lkotlin/Function1;", "", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/api/utils/NetworkRefresh;", "Lio/reactivex/Scheduler;", "subscribeOnScheduler", "(Lio/reactivex/Scheduler;)Lcom/robinhood/api/utils/NetworkRefresh;", "key", "(Ljava/lang/String;)Lcom/robinhood/api/utils/NetworkRefresh;", "Ljava/util/UUID;", "(Ljava/util/UUID;)Lcom/robinhood/api/utils/NetworkRefresh;", "force", "(Z)Lcom/robinhood/api/utils/NetworkRefresh;", "allow", "allowErrors", "Lcom/robinhood/api/utils/NetworkWrapper;", "networkWrapper", "toMaybe", "(Lcom/robinhood/api/utils/NetworkWrapper;)Lio/reactivex/Maybe;", "Lkotlin/jvm/functions/Function2;", "Lio/reactivex/Maybe;", "Lkotlin/jvm/functions/Function1;", "Lio/reactivex/Scheduler;", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Z", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class NetworkRefresh<T> {
    private boolean allowErrors;
    private Boolean force;
    private String key;
    private Maybe<T> networkMaybe;
    private Function1<? super T, Unit> saveAction;
    private final Function2<String, Instant, Boolean> staleDecider;
    private Scheduler subscribeOnScheduler;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRefresh(Function2<? super String, ? super Instant, Boolean> staleDecider) {
        Intrinsics.checkNotNullParameter(staleDecider, "staleDecider");
        this.staleDecider = staleDecider;
    }

    public final NetworkRefresh<T> networkMaybe(Maybe<T> networkMaybe) {
        Intrinsics.checkNotNullParameter(networkMaybe, "networkMaybe");
        this.networkMaybe = networkMaybe;
        return this;
    }

    public final NetworkRefresh<T> saveAction(SaveAction<T> saveAction) {
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        this.saveAction = new NetworkRefresh2(saveAction);
        return this;
    }

    public final NetworkRefresh<T> saveAction(Function1<? super T, Unit> save) {
        Intrinsics.checkNotNullParameter(save, "save");
        this.saveAction = save;
        return this;
    }

    public final NetworkRefresh<T> subscribeOnScheduler(Scheduler subscribeOnScheduler) {
        Intrinsics.checkNotNullParameter(subscribeOnScheduler, "subscribeOnScheduler");
        this.subscribeOnScheduler = subscribeOnScheduler;
        return this;
    }

    public final NetworkRefresh<T> key(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        return this;
    }

    public final NetworkRefresh<T> key(UUID key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key.toString();
        return this;
    }

    public final NetworkRefresh<T> force(boolean force) {
        this.force = Boolean.valueOf(force);
        return this;
    }

    public final NetworkRefresh<T> allowErrors(boolean allow) {
        this.allowErrors = allow;
        return this;
    }

    public final Maybe<T> toMaybe(NetworkWrapper networkWrapper) {
        Intrinsics.checkNotNullParameter(networkWrapper, "networkWrapper");
        Maybe<T> maybe = this.networkMaybe;
        Intrinsics.checkNotNull(maybe);
        Function1<? super T, Unit> function1 = this.saveAction;
        Intrinsics.checkNotNull(function1);
        Function2<String, Instant, Boolean> function2 = this.staleDecider;
        Scheduler scheduler = this.subscribeOnScheduler;
        Intrinsics.checkNotNull(scheduler);
        String str = this.key;
        Intrinsics.checkNotNull(str);
        Boolean bool = this.force;
        Intrinsics.checkNotNull(bool);
        return networkWrapper.refresh(maybe, function1, function2, scheduler, str, bool.booleanValue(), this.allowErrors);
    }
}
