package microgram.android.http;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.MessageHandler;
import microgram.android.extension.ServiceExtension;

/* compiled from: HttpServiceModule.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/http/HttpServiceExtension;", "Lmicrogram/android/extension/ServiceExtension;", "service", "Lmicrogram/android/http/HttpService;", "<init>", "(Lmicrogram/android/http/HttpService;)V", "instance", "getInstance", "()Lmicrogram/android/http/HttpService;", "createMessageHandlers", "", "", "Lmicrogram/android/MessageHandler;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.http.HttpServiceExtension, reason: use source file name */
/* loaded from: classes14.dex */
public final class HttpServiceModule implements ServiceExtension {
    private final HttpService service;

    public HttpServiceModule(HttpService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    @Override // microgram.android.extension.ServiceExtension
    /* renamed from: getInstance, reason: from getter */
    public HttpService getService() {
        return this.service;
    }

    @Override // microgram.android.extension.ServiceExtension
    public Map<String, MessageHandler> createMessageHandlers() {
        return MapsKt.mapOf(Tuples4.m3642to("mg.http", HttpService2.requestHandler(this.service)), Tuples4.m3642to("mg.http.cancellation", HttpService2.cancellationHandler(this.service)));
    }
}
