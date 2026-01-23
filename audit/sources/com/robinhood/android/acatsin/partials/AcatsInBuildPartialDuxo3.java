package com.robinhood.android.acatsin.partials;

import com.plaid.internal.EnumC7081g;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInBuildPartialDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$3$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$3$1, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsInBuildPartialDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contentfulId;
    int label;
    final /* synthetic */ AcatsInBuildPartialDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsInBuildPartialDuxo3(AcatsInBuildPartialDuxo acatsInBuildPartialDuxo, String str, Continuation<? super AcatsInBuildPartialDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = acatsInBuildPartialDuxo;
        this.$contentfulId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AcatsInBuildPartialDuxo3(this.this$0, this.$contentfulId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AcatsInBuildPartialDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        AcatsInBuildPartialDuxo3 acatsInBuildPartialDuxo3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StaticContentStore staticContentStore = this.this$0.staticContentStore;
            String str = this.$contentfulId;
            this.label = 1;
            acatsInBuildPartialDuxo3 = this;
            obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, acatsInBuildPartialDuxo3, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            acatsInBuildPartialDuxo3 = this;
        }
        acatsInBuildPartialDuxo3.this$0.applyMutation(new C79571(((OtherMarkdown) ((EntryResource) obj).getValue()).getMarkdown2(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInBuildPartialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/AcatsInBuildPartialDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$3$1$1", m3645f = "AcatsInBuildPartialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.AcatsInBuildPartialDuxo$onStart$3$1$1 */
    static final class C79571 extends ContinuationImpl7 implements Function2<AcatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState>, Object> {
        final /* synthetic */ String $bannerContentfulTemplate;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79571(String str, Continuation<? super C79571> continuation) {
            super(2, continuation);
            this.$bannerContentfulTemplate = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79571 c79571 = new C79571(this.$bannerContentfulTemplate, continuation);
            c79571.L$0 = obj;
            return c79571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInBuildPartialDataState acatsInBuildPartialDataState, Continuation<? super AcatsInBuildPartialDataState> continuation) {
            return ((C79571) create(acatsInBuildPartialDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInBuildPartialDataState.copy$default((AcatsInBuildPartialDataState) this.L$0, null, null, null, this.$bannerContentfulTemplate, null, null, null, null, null, false, 1015, null);
        }
    }
}
