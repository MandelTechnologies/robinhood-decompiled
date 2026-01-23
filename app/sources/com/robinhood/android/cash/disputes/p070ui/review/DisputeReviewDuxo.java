package com.robinhood.android.cash.disputes.p070ui.review;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.extensions.DisputeQuestionResponses;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.review.DisputeReviewDuxo;
import com.robinhood.android.cash.disputes.p070ui.review.DisputeReviewFragment;
import com.robinhood.android.cash.disputes.p070ui.review.DisputeReviewViewState;
import com.robinhood.android.cash.disputes.util.DisputeFileData;
import com.robinhood.android.cash.disputes.util.DisputeFileSelectionUtil;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardTransactionStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.api.minerva.ApiDisputeQuestionnaireAnswer;
import com.robinhood.models.p320db.mcduckling.CardTransaction;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
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
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: DisputeReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001%B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cardTransactionStore", "Lcom/robinhood/librobinhood/data/store/CardTransactionStore;", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CardTransactionStore;Lcom/robinhood/api/retrofit/Minerva;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "uuidListAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Ljava/util/UUID;", "disputeAnswerListAdapter", "Lcom/robinhood/models/api/minerva/ApiDisputeQuestionnaireAnswer;", "onCreate", "", "toggleTransactionListVisibility", "isVisible", "", "submitDispute", "context", "Landroid/content/Context;", "formatAnswers", "formatFiles", "Lokhttp3/MultipartBody$Part;", "getBlankResponsesForUnaskedQuestions", "refreshDisputedTransactions", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeReviewDuxo extends OldBaseDuxo<DisputeReviewViewState> implements HasSavedState {
    private final CardTransactionStore cardTransactionStore;
    private final JsonAdapter<List<ApiDisputeQuestionnaireAnswer>> disputeAnswerListAdapter;
    private final Minerva minerva;
    private final LazyMoshi moshi;
    private final RhyAccountStore rhyAccountStore;
    private final SavedStateHandle savedStateHandle;
    private final JsonAdapter<List<UUID>> uuidListAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final MediaType MULTIPART = MediaType.INSTANCE.parse("multipart/form-data");

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public DisputeReviewDuxo(SavedStateHandle savedStateHandle, CardTransactionStore cardTransactionStore, Minerva minerva, RhyAccountStore rhyAccountStore, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cardTransactionStore, "cardTransactionStore");
        Intrinsics.checkNotNullParameter(minerva, "minerva");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Companion companion = INSTANCE;
        super(new DisputeReviewViewState(((DisputeReviewFragment.Args) companion.getArgs(savedStateHandle)).getQuestionnaire(), ((DisputeReviewFragment.Args) companion.getArgs(savedStateHandle)).getQuestionResponses(), ((DisputeReviewFragment.Args) companion.getArgs(savedStateHandle)).getSelectedTransactionIds().size(), null, false, false, null, 120, null), null, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
        this.cardTransactionStore = cardTransactionStore;
        this.minerva = minerva;
        this.rhyAccountStore = rhyAccountStore;
        this.moshi = moshi;
        Types types = Types.INSTANCE;
        this.uuidListAdapter = moshi.adapter(new TypeToken<List<? extends UUID>>() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$special$$inlined$getAdapter$1
        }.getType());
        this.disputeAnswerListAdapter = moshi.adapter(new TypeToken<List<? extends ApiDisputeQuestionnaireAnswer>>() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$special$$inlined$getAdapter$2
        }.getType());
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.cardTransactionStore.streamSettledTransactionSet(CollectionsKt.toSet(((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSelectedTransactionIds())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.onCreate$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DisputeReviewDuxo disputeReviewDuxo, final List transactions) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        disputeReviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.onCreate$lambda$1$lambda$0(transactions, (DisputeReviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReviewViewState onCreate$lambda$1$lambda$0(List list, DisputeReviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeReviewViewState.copy$default(applyMutation, null, null, 0, list, false, false, null, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReviewViewState toggleTransactionListVisibility$lambda$2(boolean z, DisputeReviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeReviewViewState.copy$default(applyMutation, null, null, 0, null, !z, false, null, 111, null);
    }

    public final void toggleTransactionListVisibility(final boolean isVisible) {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.toggleTransactionListVisibility$lambda$2(isVisible, (DisputeReviewViewState) obj);
            }
        });
    }

    public final void submitDispute(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Completable completableFlatMapCompletable = this.rhyAccountStore.streamMinervaCardAccount().doOnSubscribe(new C100421()).distinctUntilChanged().firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo.submitDispute.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(MinervaAccount minervaAccount) {
                Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
                RequestBody.Companion companion = RequestBody.INSTANCE;
                JsonAdapter jsonAdapter = DisputeReviewDuxo.this.uuidListAdapter;
                Companion companion2 = DisputeReviewDuxo.INSTANCE;
                String json = jsonAdapter.toJson(((DisputeReviewFragment.Args) companion2.getArgs((HasSavedState) DisputeReviewDuxo.this)).getSelectedTransactionIds());
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                RequestBody requestBodyCreate = companion.create(json, DisputeReviewDuxo.MULTIPART);
                String string2 = minervaAccount.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                RequestBody requestBodyCreate2 = companion.create(string2, DisputeReviewDuxo.MULTIPART);
                RequestBody requestBodyCreate3 = companion.create(((DisputeReviewFragment.Args) companion2.getArgs((HasSavedState) DisputeReviewDuxo.this)).getQuestionnaire().getDisputeReason(), DisputeReviewDuxo.MULTIPART);
                String json2 = DisputeReviewDuxo.this.disputeAnswerListAdapter.toJson(DisputeReviewDuxo.this.formatAnswers());
                Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                RequestBody requestBodyCreate4 = companion.create(json2, DisputeReviewDuxo.MULTIPART);
                DisputeReviewDuxo disputeReviewDuxo = DisputeReviewDuxo.this;
                return RxFactory.DefaultImpls.rxCompletable$default(disputeReviewDuxo, null, new AnonymousClass1(disputeReviewDuxo, requestBodyCreate2, requestBodyCreate3, requestBodyCreate, requestBodyCreate4, context, null), 1, null);
            }

            /* compiled from: DisputeReviewDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$submitDispute$2$1", m3645f = "DisputeReviewDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$submitDispute$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Context $context;
                final /* synthetic */ RequestBody $formattedAccountId;
                final /* synthetic */ RequestBody $formattedAnswers;
                final /* synthetic */ RequestBody $formattedDisputeReason;
                final /* synthetic */ RequestBody $formattedSettlementEvents;
                int label;
                final /* synthetic */ DisputeReviewDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DisputeReviewDuxo disputeReviewDuxo, RequestBody requestBody, RequestBody requestBody2, RequestBody requestBody3, RequestBody requestBody4, Context context, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = disputeReviewDuxo;
                    this.$formattedAccountId = requestBody;
                    this.$formattedDisputeReason = requestBody2;
                    this.$formattedSettlementEvents = requestBody3;
                    this.$formattedAnswers = requestBody4;
                    this.$context = context;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$formattedAccountId, this.$formattedDisputeReason, this.$formattedSettlementEvents, this.$formattedAnswers, this.$context, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Minerva minerva = this.this$0.minerva;
                        RequestBody requestBody = this.$formattedAccountId;
                        RequestBody requestBody2 = this.$formattedDisputeReason;
                        RequestBody requestBody3 = this.$formattedSettlementEvents;
                        RequestBody requestBody4 = this.$formattedAnswers;
                        List<MultipartBody.Part> files = this.this$0.formatFiles(this.$context);
                        this.label = 1;
                        if (minerva.submitDispute(requestBody, requestBody2, requestBody3, requestBody4, files, this) == coroutine_suspended) {
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
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableFlatMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisputeReviewDuxo.submitDispute$lambda$4(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.submitDispute$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: DisputeReviewDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$submitDispute$1 */
    static final class C100421<T> implements Consumer {
        C100421() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            DisputeReviewDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$submitDispute$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DisputeReviewDuxo.C100421.accept$lambda$0((DisputeReviewViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisputeReviewViewState accept$lambda$0(DisputeReviewViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return DisputeReviewViewState.copy$default(applyMutation, null, null, 0, null, false, true, null, 95, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitDispute$lambda$4(DisputeReviewDuxo disputeReviewDuxo) {
        disputeReviewDuxo.refreshDisputedTransactions();
        disputeReviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.submitDispute$lambda$4$lambda$3((DisputeReviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReviewViewState submitDispute$lambda$4$lambda$3(DisputeReviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeReviewViewState.copy$default(applyMutation, null, null, 0, null, false, false, new UiEvent(DisputeReviewViewState.DisputeSubmitResult.Success.INSTANCE), 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitDispute$lambda$6(DisputeReviewDuxo disputeReviewDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        disputeReviewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.review.DisputeReviewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReviewDuxo.submitDispute$lambda$6$lambda$5(throwable, (DisputeReviewViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisputeReviewViewState submitDispute$lambda$6$lambda$5(Throwable th, DisputeReviewViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DisputeReviewViewState.copy$default(applyMutation, null, null, 0, null, false, false, new UiEvent(new DisputeReviewViewState.DisputeSubmitResult.Error(th)), 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ApiDisputeQuestionnaireAnswer> formatAnswers() {
        List<DisputeQuestionResponse> questionResponses = ((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getQuestionResponses();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(questionResponses, 10));
        Iterator<T> it = questionResponses.iterator();
        while (it.hasNext()) {
            arrayList.add(DisputeQuestionResponses.toApiDisputeQuestionnaireAnswer((DisputeQuestionResponse) it.next()));
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) getBlankResponsesForUnaskedQuestions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MultipartBody.Part> formatFiles(Context context) throws FileNotFoundException {
        List<DisputeQuestionResponse> questionResponses = ((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getQuestionResponses();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questionResponses) {
            if (obj instanceof DisputeQuestionResponse.Media) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<DisputeFileData> files = ((DisputeQuestionResponse.Media) obj2).getFiles();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(files, 10));
            int i3 = 0;
            for (Object obj3 : files) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DisputeFileData disputeFileData = (DisputeFileData) obj3;
                String string2 = disputeFileData.getId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                String string3 = context.getString(C10007R.string.dispute_file_name_format, Integer.valueOf(i), Integer.valueOf(i3), disputeFileData.getExtension());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                byte[] bArrLoadFileDataAsByteArray = DisputeFileSelectionUtil.INSTANCE.loadFileDataAsByteArray(context, disputeFileData);
                RequestBody requestBodyCreate$default = bArrLoadFileDataAsByteArray != null ? RequestBody.Companion.create$default(RequestBody.INSTANCE, bArrLoadFileDataAsByteArray, MULTIPART, 0, 0, 6, (Object) null) : null;
                MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                Intrinsics.checkNotNull(requestBodyCreate$default);
                arrayList3.add(companion.createFormData(string2, string3, requestBodyCreate$default));
                i3 = i4;
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
            i = i2;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    private final List<ApiDisputeQuestionnaireAnswer> getBlankResponsesForUnaskedQuestions() {
        ArrayList arrayList = new ArrayList();
        List<DisputeQuestionnaire.Question> questions = ((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getQuestionnaire().getQuestions();
        LinkedHashSet linkedHashSet = questions instanceof Collection ? new LinkedHashSet(questions.size()) : new LinkedHashSet();
        Iterator<T> it = questions.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((DisputeQuestionnaire.Question) it.next()).getId());
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        List<DisputeQuestionResponse> questionResponses = ((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getQuestionResponses();
        LinkedHashSet linkedHashSet2 = questionResponses instanceof Collection ? new LinkedHashSet(questionResponses.size()) : new LinkedHashSet();
        Iterator<T> it2 = questionResponses.iterator();
        while (it2.hasNext()) {
            linkedHashSet2.add(((DisputeQuestionResponse) it2.next()).getQuestion().getId());
        }
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(...)");
        Iterator it3 = SetsKt.minus(setUnmodifiableSet, (Iterable) setUnmodifiableSet2).iterator();
        while (it3.hasNext()) {
            arrayList.add(new ApiDisputeQuestionnaireAnswer((UUID) it3.next(), "", null, null));
        }
        return arrayList;
    }

    private final void refreshDisputedTransactions() {
        Iterator<T> it = ((DisputeReviewFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getSelectedTransactionIds().iterator();
        while (it.hasNext()) {
            this.cardTransactionStore.refresh(CardTransaction.Status.SETTLED, (UUID) it.next(), true);
        }
    }

    /* compiled from: DisputeReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewDuxo;", "Lcom/robinhood/android/cash/disputes/ui/review/DisputeReviewFragment$Args;", "<init>", "()V", "MULTIPART", "Lokhttp3/MediaType;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DisputeReviewDuxo, DisputeReviewFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DisputeReviewFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DisputeReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DisputeReviewFragment.Args getArgs(DisputeReviewDuxo disputeReviewDuxo) {
            return (DisputeReviewFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, disputeReviewDuxo);
        }
    }
}
