package com.truelayer.payments.p419ui.screens.providerselection;

import com.truelayer.payments.core.domain.payments.PaymentProvider;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import com.truelayer.payments.p419ui.utils.FlagIconUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelectionViewModelBase.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$initialize$1", m3645f = "ProviderSelectionViewModelBase.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionViewModelBase$initialize$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ProviderSelectionViewModelBase2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProviderSelectionViewData $data;
    int label;
    final /* synthetic */ ProviderSelectionViewModelBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProviderSelectionViewModelBase2(ProviderSelectionViewModelBase providerSelectionViewModelBase, ProviderSelectionViewData providerSelectionViewData, Continuation<? super ProviderSelectionViewModelBase2> continuation) {
        super(2, continuation);
        this.this$0 = providerSelectionViewModelBase;
        this.$data = providerSelectionViewData;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProviderSelectionViewModelBase2(this.this$0, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProviderSelectionViewModelBase2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String selectedProviderId;
        Object next;
        String countryCode;
        ProviderSelectionViewData providerSelectionViewData;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ProviderSelectionViewModelBase providerSelectionViewModelBase = this.this$0;
        if (providerSelectionViewModelBase.isInitialized && ((providerSelectionViewData = this.$data) == null || Intrinsics.areEqual(providerSelectionViewData, providerSelectionViewModelBase.getData()))) {
            return Unit.INSTANCE;
        }
        this.this$0.onClearNavigationStack();
        this.this$0.emitScreen(ProviderSelectionScreen.Init.INSTANCE);
        ProviderSelectionViewData providerSelectionViewData2 = this.$data;
        if (providerSelectionViewData2 != null) {
            providerSelectionViewModelBase.setData(providerSelectionViewData2);
            this.this$0.providers = CollectionsKt.toList(this.$data.getProviders());
            ProviderSelectionViewModelBase providerSelectionViewModelBase2 = this.this$0;
            List<PaymentProvider> recommendedProviders = this.$data.getRecommendedProviders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recommendedProviders, 10));
            Iterator<T> it = recommendedProviders.iterator();
            while (it.hasNext()) {
                arrayList.add(PaymentProviderViewData3.intoViewData((PaymentProvider) it.next(), true));
            }
            providerSelectionViewModelBase2.recommendedProviders = arrayList;
        }
        this.this$0.isInitialized = true;
        PaymentProvider preselectedProvider = providerSelectionViewModelBase.getData().getPreselectedProvider();
        if (preselectedProvider == null || (selectedProviderId = preselectedProvider.getId()) == null) {
            selectedProviderId = providerSelectionViewModelBase.getData().getPayment().getSelectedProviderId();
        }
        Unit unit = null;
        country = null;
        Country country = null;
        if (selectedProviderId != null) {
            ProviderSelectionViewModelBase providerSelectionViewModelBase3 = this.this$0;
            Iterator<T> it2 = providerSelectionViewModelBase.getData().getProviders().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.areEqual(((PaymentProvider) next).getId(), selectedProviderId)) {
                    break;
                }
            }
            providerSelectionViewModelBase3.setCurrentProvider((PaymentProvider) next);
            PaymentProvider currentProvider = providerSelectionViewModelBase3.getCurrentProvider();
            if (currentProvider != null && (countryCode = currentProvider.getCountryCode()) != null) {
                country = new Country(countryCode, FlagIconUtils.INSTANCE.getFlagUri(countryCode));
            }
            providerSelectionViewModelBase3.setCurrentCountry(country);
            providerSelectionViewModelBase3.process();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.this$0.setProviders$payments_ui_release(providerSelectionViewModelBase.getData().getProviders());
        }
        return Unit.INSTANCE;
    }
}
