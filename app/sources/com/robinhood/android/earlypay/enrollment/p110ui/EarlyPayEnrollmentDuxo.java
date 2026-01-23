package com.robinhood.android.earlypay.enrollment.p110ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentFragment;
import com.robinhood.android.earlypay.enrollment.p110ui.EarlyPayEnrollmentViewState;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CardStore;
import com.robinhood.librobinhood.data.store.EarlyPayEnrollmentStore;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.api.bonfire.ApiEarlyPayEnrollment;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketing;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.noties.markwon.Markwon;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function3;
import io.reactivex.rxkotlin.Singles;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EarlyPayEnrollmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001eBA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "earlyPayEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;", "logoutKillswitch", "Lcom/robinhood/utils/LogoutKillswitch;", "markwon", "Lio/noties/markwon/Markwon;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "cardStore", "Lcom/robinhood/librobinhood/data/store/CardStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;Lcom/robinhood/librobinhood/data/store/EarlyPayEnrollmentStore;Lcom/robinhood/utils/LogoutKillswitch;Lio/noties/markwon/Markwon;Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/librobinhood/data/store/CardStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "enroll", "skipEnrollment", "loadContent", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAndRefreshCards", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class EarlyPayEnrollmentDuxo extends OldBaseDuxo<EarlyPayEnrollmentViewState> implements HasSavedState {
    public static final String CONTENTFUL_ID_FAQS = "7M1GqZMS6ZQSYQT7be3knZ";
    public static final String CONTENTFUL_ID_VALUE_PROPS = "rSl2WtEsRVENRyGBsF2j1";
    private final CardStore cardStore;
    private final DirectDepositRelationshipStore directDepositRelationshipStore;
    private final EarlyPayEnrollmentStore earlyPayEnrollmentStore;
    private final LogoutKillswitch logoutKillswitch;
    private final Markwon markwon;
    private final SavedStateHandle savedStateHandle;
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo", m3645f = "EarlyPayEnrollmentDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 128, 136, 144, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE}, m3647m = "loadContent")
    /* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$loadContent$1 */
    static final class C144371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C144371(Continuation<? super C144371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EarlyPayEnrollmentDuxo.this.loadContent(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EarlyPayEnrollmentDuxo(DirectDepositRelationshipStore directDepositRelationshipStore, EarlyPayEnrollmentStore earlyPayEnrollmentStore, LogoutKillswitch logoutKillswitch, Markwon markwon, StaticContentStore staticContentStore, CardStore cardStore, SavedStateHandle savedStateHandle) {
        super(new EarlyPayEnrollmentViewState(true, null, null, null, null, ((EarlyPayEnrollmentFragment.Args) INSTANCE.getArgs(savedStateHandle)).getHideActions(), null, false, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "directDepositRelationshipStore");
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentStore, "earlyPayEnrollmentStore");
        Intrinsics.checkNotNullParameter(logoutKillswitch, "logoutKillswitch");
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(cardStore, "cardStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
        this.earlyPayEnrollmentStore = earlyPayEnrollmentStore;
        this.logoutKillswitch = logoutKillswitch;
        this.markwon = markwon;
        this.staticContentStore = staticContentStore;
        this.cardStore = cardStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        EarlyPayEnrollmentStore.refresh$default(this.earlyPayEnrollmentStore, false, 1, null);
        Singles singles = Singles.INSTANCE;
        Single singleOnErrorReturnItem = DirectDepositRelationshipStore.forceFetchHasDirectDepositRelationshipsIfNotCached$default(this.directDepositRelationshipStore, RhEntity.RHY, null, 2, null).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturnItem, "onErrorReturnItem(...)");
        Single<EarlyPayEnrollment> singleFirstOrError = this.earlyPayEnrollmentStore.streamEnrollment().firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        Single singleZip = Single.zip(singleOnErrorReturnItem, singleFirstOrError, RxFactory.DefaultImpls.rxSingle$default(this, null, new C144381(null), 1, null), new Function3<T1, T2, T3, R>() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$onStart$$inlined$zip$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public final R apply(T1 t1, T2 t2, T3 t3) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                Intrinsics.checkParameterIsNotNull(t3, "t3");
                EarlyPayEnrollment earlyPayEnrollment = (EarlyPayEnrollment) t2;
                return (R) new EarlyPayEnrollmentDataBundle(((Boolean) t1).booleanValue(), earlyPayEnrollment, (EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent) t3);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(singleZip, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
        LifecycleHost.DefaultImpls.bind$default(this, singleZip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.onStart$lambda$1(this.f$0, (EarlyPayEnrollmentDataBundle) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentViewState$EarlyPayEnrollmentContent;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$onStart$1", m3645f = "EarlyPayEnrollmentDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$onStart$1 */
    static final class C144381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent>, Object> {
        int label;

        C144381(Continuation<? super C144381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EarlyPayEnrollmentDuxo.this.new C144381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent> continuation) {
            return ((C144381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo = EarlyPayEnrollmentDuxo.this;
            this.label = 1;
            Object objLoadContent = earlyPayEnrollmentDuxo.loadContent(this);
            return objLoadContent == coroutine_suspended ? coroutine_suspended : objLoadContent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo, EarlyPayEnrollmentDataBundle earlyPayEnrollmentDataBundle) {
        Intrinsics.checkNotNullParameter(earlyPayEnrollmentDataBundle, "<destruct>");
        final boolean hasRhyDirectDepositRelationships = earlyPayEnrollmentDataBundle.getHasRhyDirectDepositRelationships();
        final EarlyPayEnrollment earlPayEnrollment = earlyPayEnrollmentDataBundle.getEarlPayEnrollment();
        final EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent = earlyPayEnrollmentDataBundle.getEarlyPayEnrollmentContent();
        earlyPayEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.onStart$lambda$1$lambda$0(earlyPayEnrollmentContent, earlPayEnrollment, hasRhyDirectDepositRelationships, (EarlyPayEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayEnrollmentViewState onStart$lambda$1$lambda$0(EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent earlyPayEnrollmentContent, EarlyPayEnrollment earlyPayEnrollment, boolean z, EarlyPayEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayEnrollmentViewState.copy$default(applyMutation, false, new UiEvent(earlyPayEnrollmentContent), null, null, null, false, earlyPayEnrollment, z, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        earlyPayEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.onStart$lambda$3$lambda$2(it, (EarlyPayEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayEnrollmentViewState onStart$lambda$3$lambda$2(Throwable th, EarlyPayEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayEnrollmentViewState.copy$default(applyMutation, false, null, new UiEvent(th), null, null, false, null, false, 250, null);
    }

    public final void enroll() {
        applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.enroll$lambda$4((EarlyPayEnrollmentViewState) obj);
            }
        });
        Single singleDoOnSuccess = SingleDelay2.minTimeInFlight$default(this.earlyPayEnrollmentStore.updateEnrollment(true), 1000L, null, 2, null).doOnSuccess(new Consumer() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo.enroll.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiEarlyPayEnrollment apiEarlyPayEnrollment) {
                EarlyPayEnrollmentDuxo.this.clearAndRefreshCards();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSuccess, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.enroll$lambda$6(this.f$0, (ApiEarlyPayEnrollment) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.enroll$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayEnrollmentViewState enroll$lambda$4(EarlyPayEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayEnrollmentViewState.copy$default(applyMutation, true, null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enroll$lambda$6(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo, ApiEarlyPayEnrollment apiEarlyPayEnrollment) {
        earlyPayEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.enroll$lambda$6$lambda$5((EarlyPayEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayEnrollmentViewState enroll$lambda$6$lambda$5(EarlyPayEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayEnrollmentViewState.copy$default(applyMutation, false, null, null, new UiEvent(Unit.INSTANCE), null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit enroll$lambda$8(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        earlyPayEnrollmentDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyPayEnrollmentDuxo.enroll$lambda$8$lambda$7(it, (EarlyPayEnrollmentViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyPayEnrollmentViewState enroll$lambda$8$lambda$7(Throwable th, EarlyPayEnrollmentViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyPayEnrollmentViewState.copy$default(applyMutation, false, null, null, null, new UiEvent(th), false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, null);
    }

    public final void skipEnrollment() {
        Single<ApiEarlyPayEnrollment> singleDoOnSuccess = this.earlyPayEnrollmentStore.updateEnrollment(false).doOnSuccess(new Consumer() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo.skipEnrollment.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiEarlyPayEnrollment apiEarlyPayEnrollment) {
                EarlyPayEnrollmentDuxo.this.clearAndRefreshCards();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        ScopedSubscriptionKt.subscribeIn(singleDoOnSuccess, this.logoutKillswitch.getLoggedInScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r1 == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e9 -> B:33:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01bb -> B:53:0x01be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadContent(Continuation<? super EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent> continuation) {
        C144371 c144371;
        Iterator it;
        Collection collection;
        ProductMarketing productMarketing;
        List list;
        List list2;
        EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure;
        Collection arrayList;
        List list3;
        C144371 c1443712;
        Iterator it2;
        EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure2;
        if (continuation instanceof C144371) {
            c144371 = (C144371) continuation;
            int i = c144371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c144371.label = i - Integer.MIN_VALUE;
            } else {
                c144371 = new C144371(continuation);
            }
        }
        C144371 c1443713 = c144371;
        Object objLoadEntry$default = c1443713.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c1443713.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadEntry$default);
            StaticContentStore staticContentStore = this.staticContentStore;
            c1443713.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CONTENTFUL_ID_VALUE_PROPS, null, c1443713, 2, null);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objLoadEntry$default);
        } else {
            if (i2 == 2) {
                collection = (Collection) c1443713.L$3;
                it = (Iterator) c1443713.L$2;
                Collection collection2 = (Collection) c1443713.L$1;
                productMarketing = (ProductMarketing) c1443713.L$0;
                ResultKt.throwOnFailure(objLoadEntry$default);
                ProductMarketing.Feature feature = (ProductMarketing.Feature) ((EntryResource) objLoadEntry$default).getValue();
                collection.add(new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp(feature.getTitle(), Markwons.toSpanned$default(this.markwon, feature.getContent(), null, 2, null)));
                collection = collection2;
                if (it.hasNext()) {
                    ResourceLink resourceLink = (ResourceLink) it.next();
                    StaticContentStore staticContentStore2 = this.staticContentStore;
                    c1443713.L$0 = productMarketing;
                    c1443713.L$1 = collection;
                    c1443713.L$2 = it;
                    c1443713.L$3 = collection;
                    c1443713.label = 2;
                    objLoadEntry$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink, null, c1443713, 2, null);
                    if (objLoadEntry$default != coroutine_suspended) {
                        collection2 = collection;
                        ProductMarketing.Feature feature2 = (ProductMarketing.Feature) ((EntryResource) objLoadEntry$default).getValue();
                        collection.add(new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.ValueProp(feature2.getTitle(), Markwons.toSpanned$default(this.markwon, feature2.getContent(), null, 2, null)));
                        collection = collection2;
                        if (it.hasNext()) {
                            list = (List) collection;
                            ResourceLink<EntryResource<Disclosure>> disclosure3 = productMarketing.getDisclosure();
                            if (disclosure3 != null) {
                                StaticContentStore staticContentStore3 = this.staticContentStore;
                                c1443713.L$0 = list;
                                c1443713.L$1 = null;
                                c1443713.L$2 = null;
                                c1443713.L$3 = null;
                                c1443713.label = 3;
                                objLoadEntry$default = ContentRepository.DefaultImpls.load$default(staticContentStore3, disclosure3, null, c1443713, 2, null);
                                if (objLoadEntry$default != coroutine_suspended) {
                                    c1443713 = c1443713;
                                    Disclosure disclosure4 = (Disclosure) ((EntryResource) objLoadEntry$default).getValue();
                                    list2 = list;
                                    disclosure = new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure(disclosure4.getTitle(), Markwons.toSpanned$default(this.markwon, disclosure4.getContent(), null, 2, null));
                                    StaticContentStore staticContentStore4 = this.staticContentStore;
                                    c1443713.L$0 = list2;
                                    c1443713.L$1 = disclosure;
                                    c1443713.L$2 = null;
                                    c1443713.L$3 = null;
                                    c1443713.label = 4;
                                    C144371 c1443714 = c1443713;
                                    objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore4, CONTENTFUL_ID_FAQS, null, c1443714, 2, null);
                                    if (objLoadEntry$default != coroutine_suspended) {
                                    }
                                }
                            } else {
                                list2 = list;
                                disclosure = null;
                                StaticContentStore staticContentStore42 = this.staticContentStore;
                                c1443713.L$0 = list2;
                                c1443713.L$1 = disclosure;
                                c1443713.L$2 = null;
                                c1443713.L$3 = null;
                                c1443713.label = 4;
                                C144371 c14437142 = c1443713;
                                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore42, CONTENTFUL_ID_FAQS, null, c14437142, 2, null);
                                if (objLoadEntry$default != coroutine_suspended) {
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                list = (List) c1443713.L$0;
                ResultKt.throwOnFailure(objLoadEntry$default);
                Disclosure disclosure42 = (Disclosure) ((EntryResource) objLoadEntry$default).getValue();
                list2 = list;
                disclosure = new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure(disclosure42.getTitle(), Markwons.toSpanned$default(this.markwon, disclosure42.getContent(), null, 2, null));
                StaticContentStore staticContentStore422 = this.staticContentStore;
                c1443713.L$0 = list2;
                c1443713.L$1 = disclosure;
                c1443713.L$2 = null;
                c1443713.L$3 = null;
                c1443713.label = 4;
                C144371 c144371422 = c1443713;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore422, CONTENTFUL_ID_FAQS, null, c144371422, 2, null);
                if (objLoadEntry$default != coroutine_suspended) {
                    c1443713 = c144371422;
                    List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features = ((ProductMarketing) ((EntryResource) objLoadEntry$default).getValue()).getFeatures();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
                    list3 = list2;
                    c1443712 = c1443713;
                    it2 = features.iterator();
                    disclosure2 = disclosure;
                    collection = arrayList;
                    if (!it2.hasNext()) {
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 4) {
                disclosure = (EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure) c1443713.L$1;
                list2 = (List) c1443713.L$0;
                ResultKt.throwOnFailure(objLoadEntry$default);
                List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features2 = ((ProductMarketing) ((EntryResource) objLoadEntry$default).getValue()).getFeatures();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features2, 10));
                list3 = list2;
                c1443712 = c1443713;
                it2 = features2.iterator();
                disclosure2 = disclosure;
                collection = arrayList;
                if (!it2.hasNext()) {
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection collection3 = (Collection) c1443713.L$4;
                it2 = (Iterator) c1443713.L$3;
                arrayList = (Collection) c1443713.L$2;
                EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure disclosure5 = (EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Disclosure) c1443713.L$1;
                List list4 = (List) c1443713.L$0;
                ResultKt.throwOnFailure(objLoadEntry$default);
                list3 = list4;
                c1443712 = c1443713;
                ProductMarketing.Feature feature3 = (ProductMarketing.Feature) ((EntryResource) objLoadEntry$default).getValue();
                collection3.add(new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq(feature3.getTitle(), Markwons.toSpanned$default(this.markwon, feature3.getContent(), null, 2, null), false, 4, null));
                disclosure2 = disclosure5;
                collection3 = arrayList;
                if (!it2.hasNext()) {
                    ResourceLink resourceLink2 = (ResourceLink) it2.next();
                    StaticContentStore staticContentStore5 = this.staticContentStore;
                    c1443712.L$0 = list3;
                    c1443712.L$1 = disclosure2;
                    c1443712.L$2 = collection3;
                    c1443712.L$3 = it2;
                    c1443712.L$4 = collection3;
                    c1443712.label = 5;
                    Object objLoad$default = ContentRepository.DefaultImpls.load$default(staticContentStore5, resourceLink2, null, c1443712, 2, null);
                    if (objLoad$default != coroutine_suspended) {
                        disclosure5 = disclosure2;
                        objLoadEntry$default = objLoad$default;
                        arrayList = collection3;
                        ProductMarketing.Feature feature32 = (ProductMarketing.Feature) ((EntryResource) objLoadEntry$default).getValue();
                        collection3.add(new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent.Faq(feature32.getTitle(), Markwons.toSpanned$default(this.markwon, feature32.getContent(), null, 2, null), false, 4, null));
                        disclosure2 = disclosure5;
                        collection3 = arrayList;
                        if (!it2.hasNext()) {
                            return new EarlyPayEnrollmentViewState.EarlyPayEnrollmentContent(list3, (List) collection3, disclosure2);
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
        ProductMarketing productMarketing2 = (ProductMarketing) ((EntryResource) objLoadEntry$default).getValue();
        List<ResourceLink<EntryResource<ProductMarketing.Feature>>> features3 = productMarketing2.getFeatures();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(features3, 10));
        it = features3.iterator();
        collection = arrayList2;
        productMarketing = productMarketing2;
        if (it.hasNext()) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAndRefreshCards() {
        Completable completableSubscribeOn = Completable.fromAction(new Action() { // from class: com.robinhood.android.earlypay.enrollment.ui.EarlyPayEnrollmentDuxo.clearAndRefreshCards.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                EarlyPayEnrollmentDuxo.this.cardStore.deleteCards();
                CardStore.refresh$default(EarlyPayEnrollmentDuxo.this.cardStore, false, 1, null);
            }
        }).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        ScopedSubscriptionKt.subscribeIn(completableSubscribeOn, this.logoutKillswitch.getLoggedInScope());
    }

    /* compiled from: EarlyPayEnrollmentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentDuxo;", "Lcom/robinhood/android/earlypay/enrollment/ui/EarlyPayEnrollmentFragment$Args;", "<init>", "()V", "CONTENTFUL_ID_VALUE_PROPS", "", "CONTENTFUL_ID_FAQS", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EarlyPayEnrollmentDuxo, EarlyPayEnrollmentFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EarlyPayEnrollmentFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EarlyPayEnrollmentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EarlyPayEnrollmentFragment.Args getArgs(EarlyPayEnrollmentDuxo earlyPayEnrollmentDuxo) {
            return (EarlyPayEnrollmentFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, earlyPayEnrollmentDuxo);
        }
    }
}
