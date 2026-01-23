package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.shareholderx.models.api.ApiShareholderEntryPointResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ShareholderEventStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventStore$entryEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderEventStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiShareholderEntryPointResponse>, Object>, ContinuationImpl6 {
    ShareholderEventStore2(Object obj) {
        super(2, obj, ShareholderXApi.class, "getShareholderEntryPointInfo", "getShareholderEntryPointInfo(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiShareholderEntryPointResponse> continuation) {
        return ((ShareholderXApi) this.receiver).getShareholderEntryPointInfo(uuid, continuation);
    }
}
