package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.shareholderx.ShareholderXApi;
import com.robinhood.shareholderx.models.api.ApiShareholderEventsSection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ShareholderEventsSectionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore$eventsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderEventsSectionStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiShareholderEventsSection>, Object>, ContinuationImpl6 {
    ShareholderEventsSectionStore2(Object obj) {
        super(2, obj, ShareholderXApi.class, "getShareholderQaEventSection", "getShareholderQaEventSection(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiShareholderEventsSection> continuation) {
        return ((ShareholderXApi) this.receiver).getShareholderQaEventSection(uuid, continuation);
    }
}
