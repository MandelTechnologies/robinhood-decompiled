package com.robinhood.android.cash.disputes.p070ui.reason;

import com.robinhood.android.cash.disputes.p070ui.reason.DisputeReasonSelectionViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.ApiDisputeQuestionnaire;
import com.robinhood.models.p355ui.DisputeQuestionnaire2;
import com.robinhood.utils.extensions.Throwables;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DisputeReasonSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;)V", "onCreate", "", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeReasonSelectionDuxo extends OldBaseDuxo<DisputeReasonSelectionViewState> {
    public static final int $stable = 8;
    private final Minerva minerva;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DisputeReasonSelectionDuxo(Minerva minerva) {
        super(DisputeReasonSelectionViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        this.minerva = minerva;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C100381(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReasonSelectionDuxo.onCreate$lambda$2(this.f$0, (ApiDisputeQuestionnaire) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReasonSelectionDuxo.onCreate$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: DisputeReasonSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/minerva/ApiDisputeQuestionnaire;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$onCreate$1", m3645f = "DisputeReasonSelectionDuxo.kt", m3646l = {18}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$onCreate$1 */
    static final class C100381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDisputeQuestionnaire>, Object> {
        int label;

        C100381(Continuation<? super C100381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DisputeReasonSelectionDuxo.this.new C100381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDisputeQuestionnaire> continuation) {
            return ((C100381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Minerva minerva = DisputeReasonSelectionDuxo.this.minerva;
            this.label = 1;
            Object disputeQuestionnaire = minerva.getDisputeQuestionnaire(this);
            return disputeQuestionnaire == coroutine_suspended ? coroutine_suspended : disputeQuestionnaire;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(DisputeReasonSelectionDuxo disputeReasonSelectionDuxo, final ApiDisputeQuestionnaire apiDisputeQuestionnaire) {
        Intrinsics.checkNotNullParameter(apiDisputeQuestionnaire, "apiDisputeQuestionnaire");
        disputeReasonSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReasonSelectionDuxo.onCreate$lambda$2$lambda$1(apiDisputeQuestionnaire, (DisputeReasonSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReasonSelectionViewState onCreate$lambda$2$lambda$1(ApiDisputeQuestionnaire apiDisputeQuestionnaire, DisputeReasonSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String display_title = apiDisputeQuestionnaire.getDisplay_title();
        List<ApiDisputeQuestionnaire.Questionnaire> questionnaires = apiDisputeQuestionnaire.getQuestionnaires();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questionnaires, 10));
        Iterator<T> it = questionnaires.iterator();
        while (it.hasNext()) {
            arrayList.add(DisputeQuestionnaire2.toUiModel((ApiDisputeQuestionnaire.Questionnaire) it.next()));
        }
        return new DisputeReasonSelectionViewState.Loaded(display_title, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(DisputeReasonSelectionDuxo disputeReasonSelectionDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            disputeReasonSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DisputeReasonSelectionDuxo.onCreate$lambda$4$lambda$3(throwable, (DisputeReasonSelectionViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReasonSelectionViewState onCreate$lambda$4$lambda$3(Throwable th, DisputeReasonSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new DisputeReasonSelectionViewState.Error(th);
    }
}
