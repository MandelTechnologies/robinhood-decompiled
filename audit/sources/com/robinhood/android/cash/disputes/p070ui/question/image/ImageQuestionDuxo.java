package com.robinhood.android.cash.disputes.p070ui.question.image;

import androidx.lifecycle.SavedStateHandle;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.question.ResponseValidationResult;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionDuxo;
import com.robinhood.android.cash.disputes.p070ui.question.image.ImageQuestionFragment;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.minerva.ApiDisputeValidationRequest;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ImageQuestionDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Minerva;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "observeFileSelections", "", "selectedFilesRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "Lcom/robinhood/android/cash/disputes/ui/question/image/FileSelectionItem;", "updateIsTextInputBlank", "isTextInputBlank", "", "updatePreFillText", "response", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionResponse$Media;", "validateResponse", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ImageQuestionDuxo extends OldBaseDuxo<ImageQuestionViewState> implements HasSavedState {
    private final Minerva minerva;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ImageQuestionDuxo(Minerva minerva, SavedStateHandle savedStateHandle) {
        super(new ImageQuestionViewState(((ImageQuestionFragment.Args) INSTANCE.getArgs(savedStateHandle)).getQuestion(), null, false, null, null, null, 62, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.minerva = minerva;
        this.savedStateHandle = savedStateHandle;
    }

    public final void observeFileSelections(BehaviorRelay<List<FileSelectionItem>> selectedFilesRelay) {
        Intrinsics.checkNotNullParameter(selectedFilesRelay, "selectedFilesRelay");
        LifecycleHost.DefaultImpls.bind$default(this, selectedFilesRelay, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionDuxo.observeFileSelections$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observeFileSelections$lambda$1(ImageQuestionDuxo imageQuestionDuxo, final List list) {
        imageQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionDuxo.observeFileSelections$lambda$1$lambda$0(list, (ImageQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionViewState observeFileSelections$lambda$1$lambda$0(List list, ImageQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return ImageQuestionViewState.copy$default(applyMutation, null, list, false, null, null, null, 61, null);
    }

    public final void updateIsTextInputBlank(final boolean isTextInputBlank) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionDuxo.updateIsTextInputBlank$lambda$2(isTextInputBlank, (ImageQuestionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionViewState updateIsTextInputBlank$lambda$2(boolean z, ImageQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ImageQuestionViewState.copy$default(applyMutation, null, null, false, Boolean.valueOf(z), null, null, 55, null);
    }

    public final void updatePreFillText(DisputeQuestionResponse.Media response) {
        Intrinsics.checkNotNullParameter(response, "response");
        final String answerText = response.getAnswerText();
        if (answerText != null) {
            applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageQuestionDuxo.updatePreFillText$lambda$3(answerText, (ImageQuestionViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionViewState updatePreFillText$lambda$3(String str, ImageQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ImageQuestionViewState.copy$default(applyMutation, null, null, false, null, new UiEvent(str), null, 47, null);
    }

    /* compiled from: ImageQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$validateResponse$1", m3645f = "ImageQuestionDuxo.kt", m3646l = {54}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$validateResponse$1 */
    static final class C100321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DisputeQuestionResponse.Media $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C100321(DisputeQuestionResponse.Media media, Continuation<? super C100321> continuation) {
            super(2, continuation);
            this.$response = media;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImageQuestionDuxo.this.new C100321(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C100321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = ImageQuestionDuxo.this.minerva;
                List<UUID> transactionIds = ((ImageQuestionFragment.Args) ImageQuestionDuxo.INSTANCE.getArgs((HasSavedState) ImageQuestionDuxo.this)).getTransactionIds();
                UUID id = this.$response.getQuestion().getId();
                String answerText = this.$response.getAnswerText();
                if (answerText == null) {
                    answerText = "";
                }
                String str = answerText;
                List<DisputeFileData> files = this.$response.getFiles();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
                Iterator<T> it = files.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DisputeFileData) it.next()).getId());
                }
                ApiDisputeValidationRequest apiDisputeValidationRequest = new ApiDisputeValidationRequest(transactionIds, new ApiDisputeValidationRequest.Answer(id, str, null, arrayList, 4, null));
                this.label = 1;
                if (minerva.validateDisputeQuestionResponse(apiDisputeValidationRequest, this) == coroutine_suspended) {
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
    }

    public final void validateResponse(final DisputeQuestionResponse.Media response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Completable completableDoOnSubscribe = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C100321(response, null), 1, null).doOnSubscribe(new C100332());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImageQuestionDuxo.validateResponse$lambda$5(this.f$0, response);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionDuxo.validateResponse$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: ImageQuestionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$validateResponse$2 */
    static final class C100332<T> implements Consumer {
        C100332() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            ImageQuestionDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$validateResponse$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageQuestionDuxo.C100332.accept$lambda$0((ImageQuestionViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ImageQuestionViewState accept$lambda$0(ImageQuestionViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return ImageQuestionViewState.copy$default(applyMutation, null, null, true, null, null, null, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$5(ImageQuestionDuxo imageQuestionDuxo, final DisputeQuestionResponse.Media media) {
        imageQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ImageQuestionDuxo.validateResponse$lambda$5$lambda$4(media, (ImageQuestionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionViewState validateResponse$lambda$5$lambda$4(DisputeQuestionResponse.Media media, ImageQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ImageQuestionViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(new ResponseValidationResult.Success(media)), 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateResponse$lambda$7(ImageQuestionDuxo imageQuestionDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (Throwables.isNetworkRelated(throwable)) {
            imageQuestionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionDuxo$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ImageQuestionDuxo.validateResponse$lambda$7$lambda$6(throwable, (ImageQuestionViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageQuestionViewState validateResponse$lambda$7$lambda$6(Throwable th, ImageQuestionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ImageQuestionViewState.copy$default(applyMutation, null, null, false, null, null, new UiEvent(new ResponseValidationResult.Error(th)), 27, null);
    }

    /* compiled from: ImageQuestionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionDuxo;", "Lcom/robinhood/android/cash/disputes/ui/question/image/ImageQuestionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ImageQuestionDuxo, ImageQuestionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ImageQuestionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ImageQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ImageQuestionFragment.Args getArgs(ImageQuestionDuxo imageQuestionDuxo) {
            return (ImageQuestionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, imageQuestionDuxo);
        }
    }
}
