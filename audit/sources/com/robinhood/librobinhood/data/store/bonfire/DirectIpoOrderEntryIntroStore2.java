package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.directipo.models.api.ApiDirectIpoOrderEntryIntro;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DirectIpoOrderEntryIntroStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectIpoOrderEntryIntroStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DirectIpoOrderEntryIntroStore2 extends FunctionReferenceImpl implements Function2<UUID, Continuation<? super ApiDirectIpoOrderEntryIntro>, Object>, ContinuationImpl6 {
    DirectIpoOrderEntryIntroStore2(Object obj) {
        super(2, obj, DirectIpoApi.class, "getDirectIpoOrderEntryIntro", "getDirectIpoOrderEntryIntro(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiDirectIpoOrderEntryIntro> continuation) {
        return ((DirectIpoApi) this.receiver).getDirectIpoOrderEntryIntro(uuid, continuation);
    }
}
