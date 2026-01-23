package com.robinhood.android.support.call.survey;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo;
import com.robinhood.android.support.call.survey.SurveyYesNoQuestionViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CxVoiceContentIds;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SurveyYesNoQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/contentful/StaticContentStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "submitAnswer", "selectedYes", "", "onError", "error", "", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SurveyYesNoQuestionDuxo extends OldBaseDuxo<SurveyYesNoQuestionViewState> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurveyYesNoQuestionDuxo(PathfinderStore pathfinderStore, StaticContentStore staticContentStore, SavedStateHandle savedStateHandle) {
        super(new SurveyYesNoQuestionViewState(((LegacyFragmentKey.SurveyYesNoQuestion) INSTANCE.getArgs(savedStateHandle)).getUserViewState(), null, null, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.staticContentStore = staticContentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C289641(null), 1, null).map(new Function() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final String apply(CxVoiceContent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getGeneralButtonDismiss();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyYesNoQuestionDuxo.onStart$lambda$1(this.f$0, (String) obj);
            }
        });
    }

    /* compiled from: SurveyYesNoQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$onStart$1", m3645f = "SurveyYesNoQuestionDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$onStart$1 */
    static final class C289641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CxVoiceContent>, Object> {
        int label;

        C289641(Continuation<? super C289641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SurveyYesNoQuestionDuxo.this.new C289641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CxVoiceContent> continuation) {
            return ((C289641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StaticContentStore staticContentStore = SurveyYesNoQuestionDuxo.this.staticContentStore;
                this.label = 1;
                obj = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CxVoiceContentIds.CX_VOICE_CONTENT_CONTENTFUL_ID, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((EntryResource) obj).getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SurveyYesNoQuestionDuxo surveyYesNoQuestionDuxo, final String str) {
        surveyYesNoQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyYesNoQuestionDuxo.onStart$lambda$1$lambda$0(str, (SurveyYesNoQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyYesNoQuestionViewState onStart$lambda$1$lambda$0(String str, SurveyYesNoQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(str);
        return SurveyYesNoQuestionViewState.copy$default(applyMutation, null, str, null, null, 13, null);
    }

    /* compiled from: SurveyYesNoQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$submitAnswer$1", m3645f = "SurveyYesNoQuestionDuxo.kt", m3646l = {51}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$submitAnswer$1 */
    static final class C289661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $selectedYes;
        int label;
        final /* synthetic */ SurveyYesNoQuestionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C289661(boolean z, SurveyYesNoQuestionDuxo surveyYesNoQuestionDuxo, Continuation<? super C289661> continuation) {
            super(2, continuation);
            this.$selectedYes = z;
            this.this$0 = surveyYesNoQuestionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C289661(this.$selectedYes, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C289661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            final SurveyYesNoQuestionViewState.LoadingState loadingState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$selectedYes) {
                    loadingState = SurveyYesNoQuestionViewState.LoadingState.LOADING_SELECTED_YES;
                } else {
                    loadingState = SurveyYesNoQuestionViewState.LoadingState.LOADING_SELECTED_NO;
                }
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$submitAnswer$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SurveyYesNoQuestionDuxo.C289661.invokeSuspend$lambda$0(loadingState, (SurveyYesNoQuestionViewState) obj2);
                    }
                });
                PathfinderStore pathfinderStore = this.this$0.pathfinderStore;
                Companion companion = SurveyYesNoQuestionDuxo.INSTANCE;
                UUID inquiryId = ((LegacyFragmentKey.SurveyYesNoQuestion) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
                int sequence = ((LegacyFragmentKey.SurveyYesNoQuestion) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
                UserViewInput.SurveyYesNoQuestionPageInput surveyYesNoQuestionPageInput = new UserViewInput.SurveyYesNoQuestionPageInput(this.$selectedYes);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (pathfinderStore.handleUserInput(inquiryId, sequence, surveyYesNoQuestionPageInput, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SurveyYesNoQuestionViewState invokeSuspend$lambda$0(SurveyYesNoQuestionViewState.LoadingState loadingState, SurveyYesNoQuestionViewState surveyYesNoQuestionViewState) {
            return SurveyYesNoQuestionViewState.copy$default(surveyYesNoQuestionViewState, null, null, loadingState, null, 11, null);
        }

        /* compiled from: SurveyYesNoQuestionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$submitAnswer$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, SurveyYesNoQuestionDuxo.class, "onError", "onError(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((SurveyYesNoQuestionDuxo) this.receiver).onError(p0));
            }
        }
    }

    public final void submitAnswer(boolean selectedYes) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C289661(selectedYes, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onError(final Throwable error) {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.survey.SurveyYesNoQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SurveyYesNoQuestionDuxo.onError$lambda$2(error, (SurveyYesNoQuestionViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurveyYesNoQuestionViewState onError$lambda$2(Throwable th, SurveyYesNoQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SurveyYesNoQuestionViewState.copy$default(applyMutation, null, null, SurveyYesNoQuestionViewState.LoadingState.NOT_LOADING, new UiEvent(th), 3, null);
    }

    /* compiled from: SurveyYesNoQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/call/survey/SurveyYesNoQuestionDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SurveyYesNoQuestion;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SurveyYesNoQuestionDuxo, LegacyFragmentKey.SurveyYesNoQuestion> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyYesNoQuestion getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.SurveyYesNoQuestion) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SurveyYesNoQuestion getArgs(SurveyYesNoQuestionDuxo surveyYesNoQuestionDuxo) {
            return (LegacyFragmentKey.SurveyYesNoQuestion) DuxoCompanion.DefaultImpls.getArgs(this, surveyYesNoQuestionDuxo);
        }
    }
}
