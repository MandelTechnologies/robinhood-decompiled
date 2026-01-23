package com.robinhood.android.shareholderexperience.askquestion;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.shareholderexperience.askquestion.AskQuestionViewState2;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.ShareholderExperienceStore;
import com.robinhood.shareholderx.models.api.ApiShareholderNewQuestionResponse;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AskQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "shareholderExperienceStore", "Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/ShareholderExperienceStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submitQuestion", "question", "", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AskQuestionDuxo extends OldBaseDuxo<AskQuestionViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final ShareholderExperienceStore shareholderExperienceStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionDuxo(ShareholderExperienceStore shareholderExperienceStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(shareholderExperienceStore, "shareholderExperienceStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        super(new AskQuestionViewState(null, objArr, 3, 0 == true ? 1 : 0), objArr2, 2, 0 == true ? 1 : 0);
        this.shareholderExperienceStore = shareholderExperienceStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        ShareholderExperienceStore shareholderExperienceStore = this.shareholderExperienceStore;
        Companion companion = INSTANCE;
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, shareholderExperienceStore.getMetadataQuery(((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((HasSavedState) this)).getInstrumentId(), ((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((HasSavedState) this)).getEventSlug()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.onStart$lambda$1(this.f$0, (QaEventMetadata) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AskQuestionDuxo askQuestionDuxo, final QaEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        askQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.onStart$lambda$1$lambda$0(metadata, (AskQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskQuestionViewState onStart$lambda$1$lambda$0(QaEventMetadata qaEventMetadata, AskQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AskQuestionViewState.copy$default(applyMutation, qaEventMetadata.getAskQuestionInfo(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AskQuestionDuxo askQuestionDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        askQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.onStart$lambda$3$lambda$2((AskQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskQuestionViewState onStart$lambda$3$lambda$2(AskQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AskQuestionViewState.copy$default(applyMutation, null, new UiEvent(AskQuestionViewState2.Error.INSTANCE), 1, null);
    }

    /* compiled from: AskQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shareholderx/models/api/ApiShareholderNewQuestionResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$submitQuestion$1", m3645f = "AskQuestionDuxo.kt", m3646l = {42}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$submitQuestion$1 */
    static final class C284861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiShareholderNewQuestionResponse>, Object> {
        final /* synthetic */ String $question;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C284861(String str, Continuation<? super C284861> continuation) {
            super(2, continuation);
            this.$question = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AskQuestionDuxo.this.new C284861(this.$question, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiShareholderNewQuestionResponse> continuation) {
            return ((C284861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            ShareholderExperienceStore shareholderExperienceStore = AskQuestionDuxo.this.shareholderExperienceStore;
            Companion companion = AskQuestionDuxo.INSTANCE;
            UUID instrumentId = ((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((HasSavedState) AskQuestionDuxo.this)).getInstrumentId();
            String eventSlug = ((LegacyFragmentKey.ShareholderAskQuestion) companion.getArgs((HasSavedState) AskQuestionDuxo.this)).getEventSlug();
            String str = this.$question;
            this.label = 1;
            Object objPostQuestion = shareholderExperienceStore.postQuestion(instrumentId, eventSlug, str, this);
            return objPostQuestion == coroutine_suspended ? coroutine_suspended : objPostQuestion;
        }
    }

    public final void submitQuestion(String question) {
        Intrinsics.checkNotNullParameter(question, "question");
        Single singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C284861(question, null), 1, null).doOnSuccess(new Consumer() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo.submitQuestion.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiShareholderNewQuestionResponse apiShareholderNewQuestionResponse) {
                AskQuestionDuxo.this.shareholderExperienceStore.refresh();
            }
        }).map(new Function() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo.submitQuestion.3
            @Override // io.reactivex.functions.Function
            public final AskQuestionViewState2 apply(ApiShareholderNewQuestionResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new AskQuestionViewState2.Success(it.getFull_page_content().getShare_copy());
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo.submitQuestion.4
            @Override // io.reactivex.functions.Function
            public final AskQuestionViewState2 apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AskQuestionViewState2.Error.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.submitQuestion$lambda$5(this.f$0, (AskQuestionViewState2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitQuestion$lambda$5(AskQuestionDuxo askQuestionDuxo, final AskQuestionViewState2 askQuestionViewState2) {
        askQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.shareholderexperience.askquestion.AskQuestionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDuxo.submitQuestion$lambda$5$lambda$4(askQuestionViewState2, (AskQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AskQuestionViewState submitQuestion$lambda$5$lambda$4(AskQuestionViewState2 askQuestionViewState2, AskQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AskQuestionViewState.copy$default(applyMutation, null, new UiEvent(askQuestionViewState2), 1, null);
    }

    /* compiled from: AskQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/shareholderexperience/askquestion/AskQuestionDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ShareholderAskQuestion;", "<init>", "()V", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AskQuestionDuxo, LegacyFragmentKey.ShareholderAskQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderAskQuestion getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.ShareholderAskQuestion) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ShareholderAskQuestion getArgs(AskQuestionDuxo askQuestionDuxo) {
            return (LegacyFragmentKey.ShareholderAskQuestion) DuxoCompanion.DefaultImpls.getArgs(this, askQuestionDuxo);
        }
    }
}
