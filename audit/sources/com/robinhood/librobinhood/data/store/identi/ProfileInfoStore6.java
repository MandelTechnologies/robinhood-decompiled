package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.p355ui.identi.UiProfileInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.reflect.KFunction;

/* compiled from: ProfileInfoStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$updateProfileInfoEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ProfileInfoStore6 extends AdaptedFunctionReference implements Function2<UiProfileInfo, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ProfileInfoStore6(Object obj) {
        super(2, obj, KFunction.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UiProfileInfo uiProfileInfo, Continuation<? super Unit> continuation) {
        return ProfileInfoStore.updateProfileInfoEndpoint$invoke((KFunction) this.receiver, uiProfileInfo, continuation);
    }
}
