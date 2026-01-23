package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.models.api.ApiSlipAgreementsSection;
import com.robinhood.models.p355ui.UiSlipAgreementsSection;
import com.robinhood.models.p355ui.UiSlipAgreementsSection2;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SlipAgreementsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/UiSlipAgreementsSection;", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsSectionEndpoint$1", m3645f = "SlipAgreementsStore.kt", m3646l = {97}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipAgreementsStore$getSlipAgreementsSectionEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipAgreementsStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends String, ? extends String>, Continuation<? super Optional<? extends UiSlipAgreementsSection>>, Object> {
    final /* synthetic */ SlipApi $slipApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipAgreementsStore4(SlipApi slipApi, Continuation<? super SlipAgreementsStore4> continuation) {
        super(2, continuation);
        this.$slipApi = slipApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlipAgreementsStore4 slipAgreementsStore4 = new SlipAgreementsStore4(this.$slipApi, continuation);
        slipAgreementsStore4.L$0 = obj;
        return slipAgreementsStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends String> tuples2, Continuation<? super Optional<? extends UiSlipAgreementsSection>> continuation) {
        return invoke2((Tuples2<String, String>) tuples2, (Continuation<? super Optional<UiSlipAgreementsSection>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, String> tuples2, Continuation<? super Optional<UiSlipAgreementsSection>> continuation) {
        return ((SlipAgreementsStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Optional.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            String str = (String) tuples2.component1();
            String str2 = (String) tuples2.component2();
            Optional.Companion companion2 = Optional.INSTANCE;
            SlipApi slipApi = this.$slipApi;
            this.L$0 = companion2;
            this.label = 1;
            obj = slipApi.getSlipAgreementsSection(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Optional.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return companion.m2972of(UiSlipAgreementsSection2.toUiModel((ApiSlipAgreementsSection) obj));
    }
}
