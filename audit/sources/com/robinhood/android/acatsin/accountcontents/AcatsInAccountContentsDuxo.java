package com.robinhood.android.acatsin.accountcontents;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsContract;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsAccountContents;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: AcatsInAccountContentsDuxo.kt */
@Metadata(m3635d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\b\u0004*\u0001\u001e\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsBrokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/android/rhimage/ImageLoader;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "brokerageLogoUrl", "Lokhttp3/HttpUrl;", "onStart", "", "onItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "onItemDeselected", "loadContents", "handleError", "error", "", "brokerageLogoTarget", "com/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo$brokerageLogoTarget$1", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo$brokerageLogoTarget$1;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAccountContentsDuxo extends BaseDuxo<AcatsInAccountContentsDataState, AcatsInAccountContentsViewState> implements HasSavedState {
    private final AcatsBrokerageStore acatsBrokerageStore;
    private final AcatsInAccountContentsDuxo2 brokerageLogoTarget;
    private final HttpUrl brokerageLogoUrl;
    private final ImageLoader imageLoader;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$brokerageLogoTarget$1] */
    public AcatsInAccountContentsDuxo(AcatsBrokerageStore acatsBrokerageStore, ImageLoader imageLoader, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AcatsInAccountContentsDataState(Eithers.getName(((AcatsInAccountContentsContract.Key) companion.getArgs(savedStateHandle)).getBrokerageOrDtcNumber()), null, false, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new AcatsInAccountContentsStateProvider(), duxoBundle);
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.imageLoader = imageLoader;
        this.savedStateHandle = savedStateHandle;
        this.brokerageLogoUrl = Eithers.getLogoUrl(((AcatsInAccountContentsContract.Key) companion.getArgs(getSavedStateHandle())).getBrokerageOrDtcNumber());
        this.brokerageLogoTarget = new ImageLoader.Target() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$brokerageLogoTarget$1
            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onError(Drawable error) {
            }

            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onStart(Drawable placeholder) {
            }

            @Override // com.robinhood.android.rhimage.ImageLoader.Target
            public void onSuccess(Drawable result) {
                if (result != null) {
                    this.this$0.applyMutation(new AcatsInAccountContentsDuxo3(result, null));
                }
            }
        };
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        HttpUrl httpUrl = this.brokerageLogoUrl;
        if (httpUrl != null) {
            this.imageLoader.load(httpUrl).into(this.brokerageLogoTarget);
        }
        loadContents();
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$onItemSelected$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$onItemSelected$1 */
    static final class C77381 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
        final /* synthetic */ AccountContentItem $item;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77381(AccountContentItem accountContentItem, Continuation<? super C77381> continuation) {
            super(2, continuation);
            this.$item = accountContentItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77381 c77381 = new C77381(this.$item, continuation);
            c77381.L$0 = obj;
            return c77381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
            return ((C77381) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInAccountContentsDataState acatsInAccountContentsDataState = (AcatsInAccountContentsDataState) this.L$0;
            return AcatsInAccountContentsDataState.copy$default(acatsInAccountContentsDataState, null, null, false, null, CollectionsKt.plus((Collection<? extends AccountContentItem>) acatsInAccountContentsDataState.getSelectedItems(), this.$item), null, null, 111, null);
        }
    }

    public final void onItemSelected(AccountContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        applyMutation(new C77381(item, null));
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$onItemDeselected$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$onItemDeselected$1 */
    static final class C77371 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
        final /* synthetic */ AccountContentItem $item;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77371(AccountContentItem accountContentItem, Continuation<? super C77371> continuation) {
            super(2, continuation);
            this.$item = accountContentItem;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77371 c77371 = new C77371(this.$item, continuation);
            c77371.L$0 = obj;
            return c77371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
            return ((C77371) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInAccountContentsDataState acatsInAccountContentsDataState = (AcatsInAccountContentsDataState) this.L$0;
            return AcatsInAccountContentsDataState.copy$default(acatsInAccountContentsDataState, null, null, false, null, CollectionsKt.minus(acatsInAccountContentsDataState.getSelectedItems(), this.$item), null, null, 111, null);
        }
    }

    public final void onItemDeselected(AccountContentItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        applyMutation(new C77371(item, null));
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$1 */
    static final class C77351 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77351(Continuation<? super C77351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77351 c77351 = new C77351(continuation);
            c77351.L$0 = obj;
            return c77351;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
            return ((C77351) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAccountContentsDataState.copy$default((AcatsInAccountContentsDataState) this.L$0, null, null, false, null, null, null, null, 123, null);
        }
    }

    public final void loadContents() {
        applyMutation(new C77351(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C77362(null), 3, null);
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$2", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$2 */
    static final class C77362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C77362(Continuation<? super C77362> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInAccountContentsDuxo.this.new C77362(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsBrokerageStore acatsBrokerageStore = AcatsInAccountContentsDuxo.this.acatsBrokerageStore;
                    String accountNumber = ((AcatsInAccountContentsContract.Key) AcatsInAccountContentsDuxo.INSTANCE.getArgs((HasSavedState) AcatsInAccountContentsDuxo.this)).getAccountNumber();
                    this.label = 1;
                    obj = acatsBrokerageStore.getAccountContents(accountNumber, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AcatsInAccountContentsDuxo.this.applyMutation(new AnonymousClass1((AcatsAccountContents) obj, null));
            } catch (Exception e) {
                AcatsInAccountContentsDuxo.this.handleError(e);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInAccountContentsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$2$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$loadContents$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
            final /* synthetic */ AcatsAccountContents $accountContents;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsAccountContents acatsAccountContents, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountContents = acatsAccountContents;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountContents, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
                return ((AnonymousClass1) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AcatsInAccountContentsDataState.copy$default((AcatsInAccountContentsDataState) this.L$0, null, null, true, this.$accountContents.getItems(), null, this.$accountContents.getBuildPartialBannerContentfulId(), this.$accountContents.getSupportedContentTypes(), 19, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable error) throws Throwable {
        if (Throwables.isNetworkRelated(error)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, error, false, null, 4, null);
            applyMutation(new C77341(null));
            return;
        }
        throw error;
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$handleError$1", m3645f = "AcatsInAccountContentsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsDuxo$handleError$1 */
    static final class C77341 extends ContinuationImpl7 implements Function2<AcatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77341(Continuation<? super C77341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77341 c77341 = new C77341(continuation);
            c77341.L$0 = obj;
            return c77341;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAccountContentsDataState acatsInAccountContentsDataState, Continuation<? super AcatsInAccountContentsDataState> continuation) {
            return ((C77341) create(acatsInAccountContentsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAccountContentsDataState.copy$default((AcatsInAccountContentsDataState) this.L$0, null, null, true, CollectionsKt.emptyList(), null, null, null, 115, null);
        }
    }

    /* compiled from: AcatsInAccountContentsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInAccountContentsDuxo, AcatsInAccountContentsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAccountContentsContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInAccountContentsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInAccountContentsContract.Key getArgs(AcatsInAccountContentsDuxo acatsInAccountContentsDuxo) {
            return (AcatsInAccountContentsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInAccountContentsDuxo);
        }
    }
}
