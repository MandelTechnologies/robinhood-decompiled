package com.truelayer.payments.p419ui.screens.providerselection;

import com.truelayer.payments.core.store.CountryStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelectionViewModelBase.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$selectDefaultCountry$lastUsedCountry$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {419}, m3647m = "invokeSuspend")
/* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$selectDefaultCountry$lastUsedCountry$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ProviderSelectionViewModelBase5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ ProviderSelectionViewModelBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProviderSelectionViewModelBase5(ProviderSelectionViewModelBase providerSelectionViewModelBase, Continuation<? super ProviderSelectionViewModelBase5> continuation) {
        super(2, continuation);
        this.this$0 = providerSelectionViewModelBase;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProviderSelectionViewModelBase5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((ProviderSelectionViewModelBase5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CountryStore country = this.this$0.store.getCountry();
        this.label = 1;
        Object lastUsedCountryCode = country.getLastUsedCountryCode(this);
        return lastUsedCountryCode == coroutine_suspended ? coroutine_suspended : lastUsedCountryCode;
    }
}
