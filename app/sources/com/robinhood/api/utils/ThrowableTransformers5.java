package com.robinhood.api.utils;

import com.robinhood.api.utils.RhCallAdapterFactory;

/* compiled from: ThrowableTransformers.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/api/utils/ThrowableTransformerModule;", "", "bindMalformedResponse", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "transformer", "Lcom/robinhood/api/utils/MalformedResponseThrowableTransformer;", "bindRemoteConfig", "Lcom/robinhood/api/utils/RemoteConfigThrowableTransformer;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.ThrowableTransformerModule, reason: use source file name */
/* loaded from: classes16.dex */
public interface ThrowableTransformers5 {
    @ThrowableTransformers6
    RhCallAdapterFactory.ThrowableTransformer bindMalformedResponse(ThrowableTransformers transformer);

    @ThrowableTransformers7
    RhCallAdapterFactory.ThrowableTransformer bindRemoteConfig(ThrowableTransformers3 transformer);
}
