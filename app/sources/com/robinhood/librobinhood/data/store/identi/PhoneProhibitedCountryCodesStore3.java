package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.api.identi.ApiPhoneProhibitedCountryCodes;
import com.robinhood.models.dao.PhoneProhibitedCountryCodesDao;
import com.robinhood.models.p355ui.identi.PhoneProhibitedCountryCodes2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PhoneProhibitedCountryCodesStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/api/identi/ApiPhoneProhibitedCountryCodes;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.PhoneProhibitedCountryCodesStore$endpoint$2", m3645f = "PhoneProhibitedCountryCodesStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.PhoneProhibitedCountryCodesStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PhoneProhibitedCountryCodesStore3 extends ContinuationImpl7 implements Function2<ApiPhoneProhibitedCountryCodes, Continuation<? super Unit>, Object> {
    final /* synthetic */ PhoneProhibitedCountryCodesDao $dao;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneProhibitedCountryCodesStore3(PhoneProhibitedCountryCodesDao phoneProhibitedCountryCodesDao, Continuation<? super PhoneProhibitedCountryCodesStore3> continuation) {
        super(2, continuation);
        this.$dao = phoneProhibitedCountryCodesDao;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PhoneProhibitedCountryCodesStore3 phoneProhibitedCountryCodesStore3 = new PhoneProhibitedCountryCodesStore3(this.$dao, continuation);
        phoneProhibitedCountryCodesStore3.L$0 = obj;
        return phoneProhibitedCountryCodesStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPhoneProhibitedCountryCodes apiPhoneProhibitedCountryCodes, Continuation<? super Unit> continuation) {
        return ((PhoneProhibitedCountryCodesStore3) create(apiPhoneProhibitedCountryCodes, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$dao.insert(PhoneProhibitedCountryCodes2.toDbModel((ApiPhoneProhibitedCountryCodes) this.L$0));
        return Unit.INSTANCE;
    }
}
