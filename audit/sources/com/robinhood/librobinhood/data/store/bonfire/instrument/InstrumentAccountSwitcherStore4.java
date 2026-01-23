package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.models.dao.bonfire.instrument.InstrumentAccountSwitcherDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: InstrumentAccountSwitcherStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountSwitcher", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentAccountSwitcher;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$accountSwitcherEndpoint$2", m3645f = "InstrumentAccountSwitcherStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$accountSwitcherEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class InstrumentAccountSwitcherStore4 extends ContinuationImpl7 implements Function2<InstrumentAccountSwitcher, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstrumentAccountSwitcherDao $dao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstrumentAccountSwitcherStore4(InstrumentAccountSwitcherDao instrumentAccountSwitcherDao, Continuation<? super InstrumentAccountSwitcherStore4> continuation) {
        super(2, continuation);
        this.$dao = instrumentAccountSwitcherDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstrumentAccountSwitcherStore4 instrumentAccountSwitcherStore4 = new InstrumentAccountSwitcherStore4(this.$dao, continuation);
        instrumentAccountSwitcherStore4.L$0 = obj;
        return instrumentAccountSwitcherStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstrumentAccountSwitcher instrumentAccountSwitcher, Continuation<? super Unit> continuation) {
        return ((InstrumentAccountSwitcherStore4) create(instrumentAccountSwitcher, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$dao.insert((InstrumentAccountSwitcherDao) this.L$0);
        return Unit.INSTANCE;
    }
}
