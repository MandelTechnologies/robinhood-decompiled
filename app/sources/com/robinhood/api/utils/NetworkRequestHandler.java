package com.robinhood.api.utils;

import com.robinhood.Logger;
import com.robinhood.api.ErrorHandler;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import io.reactivex.subjects.BehaviorSubject;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import retrofit2.Response;
import timber.log.Timber;

/* compiled from: NetworkRequestHandler.kt */
@kotlin.Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tJ\u0013\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/api/utils/NetworkRequestHandler;", "T", "Lcom/robinhood/api/ErrorHandler;", "metadata", "Lcom/robinhood/api/utils/Metadata;", "metadataSubject", "Lio/reactivex/subjects/BehaviorSubject;", "saveAction", "Lkotlin/Function1;", "", "<init>", "(Lcom/robinhood/api/utils/Metadata;Lio/reactivex/subjects/BehaviorSubject;Lkotlin/jvm/functions/Function1;)V", "onRequestStarting", "onRequestEnding", "on200Response", WebsocketGatewayConstants.DATA_KEY, "(Ljava/lang/Object;)V", "onNon200Error", "", "response", "Lretrofit2/Response;", "onNetworkError", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "onProgrammingError", "t", "", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public class NetworkRequestHandler<T> implements ErrorHandler {
    private final Metadata metadata;
    private final BehaviorSubject<Metadata> metadataSubject;
    private final Function1<T, Unit> saveAction;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRequestHandler(Metadata metadata, BehaviorSubject<Metadata> metadataSubject, Function1<? super T, Unit> saveAction) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(metadataSubject, "metadataSubject");
        Intrinsics.checkNotNullParameter(saveAction, "saveAction");
        this.metadata = metadata;
        this.metadataSubject = metadataSubject;
        this.saveAction = saveAction;
    }

    public final void onRequestStarting() {
        this.metadata.setInFlight(true);
        this.metadata.setSyncState(SyncState.PENDING);
        this.metadataSubject.onNext(this.metadata);
    }

    public final void onRequestEnding() {
        this.metadata.setInFlight(false);
        this.metadataSubject.onNext(this.metadata);
    }

    public final void on200Response(T data) {
        this.metadata.setSyncState(SyncState.SUCCESS);
        this.metadata.setLastUpdatedAt(Instant.now());
        this.saveAction.invoke(data);
        this.metadataSubject.onNext(this.metadata);
    }

    @Override // com.robinhood.api.ErrorHandler
    public boolean onNon200Error(Response<?> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.metadata.setSyncState(SyncState.ERROR);
        this.metadataSubject.onNext(this.metadata);
        response.raw().getRequest().getUrl();
        return true;
    }

    @Override // com.robinhood.api.ErrorHandler
    public boolean onNetworkError(IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.metadata.setSyncState(SyncState.ERROR);
        this.metadata.setLastSeenException(e);
        this.metadataSubject.onNext(this.metadata);
        Timber.INSTANCE.mo3353e("Network error %s: %s", e.getClass(), e.getMessage());
        return true;
    }

    @Override // com.robinhood.api.ErrorHandler
    public boolean onProgrammingError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        this.metadata.setSyncState(SyncState.ERROR);
        this.metadata.setLastSeenException(t);
        this.metadataSubject.onNext(this.metadata);
        Logger.INSTANCE.logErrorContext(t, "Network Error");
        return false;
    }
}
