package com.robinhood.android.taxcenter.viewdocument;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.taxcenter.p195db.TaxDocument;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.TaxCenterStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ViewTaxDocumentDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDataState;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "taxCenterStore", "Lcom/robinhood/librobinhood/data/store/TaxCenterStore;", "stateProvider", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/TaxCenterStore;Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ViewTaxDocumentDuxo extends BaseDuxo<ViewTaxDocumentDataState, ViewTaxDocumentViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final TaxCenterStore taxCenterStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTaxDocumentDuxo(TaxCenterStore taxCenterStore, ViewTaxDocumentViewState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new ViewTaxDocumentDataState(((LegacyFragmentKey.ViewTaxDocument) INSTANCE.getArgs(savedStateHandle)).getId(), null, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(taxCenterStore, "taxCenterStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.taxCenterStore = taxCenterStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C292741(null));
    }

    /* compiled from: ViewTaxDocumentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1", m3645f = "ViewTaxDocumentDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1 */
    static final class C292741 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C292741(Continuation<? super C292741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ViewTaxDocumentDuxo.this.new C292741(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C292741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ViewTaxDocumentDuxo.this.taxCenterStore.taxDocumentFlow(((LegacyFragmentKey.ViewTaxDocument) ViewTaxDocumentDuxo.INSTANCE.getArgs((HasSavedState) ViewTaxDocumentDuxo.this)).getId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ViewTaxDocumentDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: ViewTaxDocumentDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "metadata", "Lcom/robinhood/android/models/taxcenter/db/TaxDocument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1$1", m3645f = "ViewTaxDocumentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<TaxDocument, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ViewTaxDocumentDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ViewTaxDocumentDuxo viewTaxDocumentDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = viewTaxDocumentDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaxDocument taxDocument, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(taxDocument, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: ViewTaxDocumentDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1$1$1", m3645f = "ViewTaxDocumentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.taxcenter.viewdocument.ViewTaxDocumentDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505681 extends ContinuationImpl7 implements Function2<ViewTaxDocumentDataState, Continuation<? super ViewTaxDocumentDataState>, Object> {
                final /* synthetic */ TaxDocument $metadata;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C505681(TaxDocument taxDocument, Continuation<? super C505681> continuation) {
                    super(2, continuation);
                    this.$metadata = taxDocument;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C505681 c505681 = new C505681(this.$metadata, continuation);
                    c505681.L$0 = obj;
                    return c505681;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(ViewTaxDocumentDataState viewTaxDocumentDataState, Continuation<? super ViewTaxDocumentDataState> continuation) {
                    return ((C505681) create(viewTaxDocumentDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ViewTaxDocumentDataState.copy$default((ViewTaxDocumentDataState) this.L$0, null, this.$metadata, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C505681((TaxDocument) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: ViewTaxDocumentDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/taxcenter/viewdocument/ViewTaxDocumentDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ViewTaxDocument;", "<init>", "()V", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ViewTaxDocumentDuxo, LegacyFragmentKey.ViewTaxDocument> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ViewTaxDocument getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.ViewTaxDocument) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.ViewTaxDocument getArgs(ViewTaxDocumentDuxo viewTaxDocumentDuxo) {
            return (LegacyFragmentKey.ViewTaxDocument) DuxoCompanion.DefaultImpls.getArgs(this, viewTaxDocumentDuxo);
        }
    }
}
