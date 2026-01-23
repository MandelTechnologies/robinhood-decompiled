package com.robinhood.android.common.recurring.bottomsheet;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.databinding.DialogRecurringInfoBinding;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.recurring.contracts.RecurringDialogFragmentKeys;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.noties.markwon.Markwon;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u001a\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u000e\u00102\u001a\u00020*H\u0082@¢\u0006\u0002\u00103J\u000e\u00104\u001a\u00020*H\u0082@¢\u0006\u0002\u00103J\u001a\u00105\u001a\u00020*2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u00106\u001a\u000207H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "<init>", "()V", RecurringCryptoDisclosureBottomSheetFragment.KEY_REVIEW_TEXT, "", "getReviewText", "()Ljava/lang/String;", "reviewText$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", "getBinding", "()Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "getStaticContentStore", "()Lcom/robinhood/contentful/StaticContentStore;", "setStaticContentStore", "(Lcom/robinhood/contentful/StaticContentStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "collectDisclosureBody", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectDisclosureTitleAndButton", "updateText", "orderTimingDisclosure", "Landroid/text/Spanned;", "Companion", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RecurringCryptoDisclosureBottomSheetFragment extends BaseBottomSheetDialogFragment implements RxFactory3 {
    private static final String DISCLOSURE_URL = "https://cdn.robinhood.com/assets/robinhood/legal/Robinhood%20Crypto%20Risk%20Disclosures.pdf";
    private static final String KEY_REVIEW_TEXT = "reviewText";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public CryptoExperimentsStore cryptoExperimentsStore;
    public Markwon markwon;

    /* renamed from: reviewText$delegate, reason: from kotlin metadata */
    private final Lazy reviewText;
    public RxFactory rxFactory;
    public StaticContentStore staticContentStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RecurringCryptoDisclosureBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    public RecurringCryptoDisclosureBottomSheetFragment() {
        super(C11595R.layout.dialog_recurring_crypto_disclosure);
        this.reviewText = Fragments2.argument(this, KEY_REVIEW_TEXT);
        this.binding = ViewBinding5.viewBinding(this, RecurringCryptoDisclosureBottomSheetFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getReviewText() {
        return (String) this.reviewText.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogRecurringInfoBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DialogRecurringInfoBinding) value;
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    public final StaticContentStore getStaticContentStore() {
        StaticContentStore staticContentStore = this.staticContentStore;
        if (staticContentStore != null) {
            return staticContentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("staticContentStore");
        return null;
    }

    public final void setStaticContentStore(StaticContentStore staticContentStore) {
        Intrinsics.checkNotNullParameter(staticContentStore, "<set-?>");
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C116821(null));
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1 */
    static final class C116821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C116821(Continuation<? super C116821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116821 c116821 = RecurringCryptoDisclosureBottomSheetFragment.this.new C116821(continuation);
            c116821.L$0 = obj;
            return c116821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C116821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1$1", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringCryptoDisclosureBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = recurringCryptoDisclosureBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment = this.this$0;
                    this.label = 1;
                    if (recurringCryptoDisclosureBottomSheetFragment.collectDisclosureBody(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(RecurringCryptoDisclosureBottomSheetFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(RecurringCryptoDisclosureBottomSheetFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1$2", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ RecurringCryptoDisclosureBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recurringCryptoDisclosureBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment = this.this$0;
                    this.label = 1;
                    if (recurringCryptoDisclosureBottomSheetFragment.collectDisclosureTitleAndButton(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectDisclosureBody(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(FlowKt.combine(FlowKt.flow(new RecurringCryptoDisclosureBottomSheetFragment3(this, null)), getCryptoExperimentsStore().streamCryptoRecurringOrdersVTExperiment(), new C116782(null))), new C116793(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/text/Spanned;", "", "orderTimingDisclosure", "isVTExperimentEnabled"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$2", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$2 */
    static final class C116782 extends ContinuationImpl7 implements Function3<Spanned, Boolean, Continuation<? super Tuples2<? extends Spanned, ? extends Boolean>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        C116782(Continuation<? super C116782> continuation) {
            super(3, continuation);
        }

        public final Object invoke(Spanned spanned, boolean z, Continuation<? super Tuples2<? extends Spanned, Boolean>> continuation) {
            C116782 c116782 = new C116782(continuation);
            c116782.L$0 = spanned;
            c116782.Z$0 = z;
            return c116782.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Spanned spanned, Boolean bool, Continuation<? super Tuples2<? extends Spanned, ? extends Boolean>> continuation) {
            return invoke(spanned, bool.booleanValue(), (Continuation<? super Tuples2<? extends Spanned, Boolean>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Tuples4.m3642to((Spanned) this.L$0, boxing.boxBoolean(this.Z$0));
        }
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Landroid/text/Spanned;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$3", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureBody$3 */
    static final class C116793 extends ContinuationImpl7 implements Function2<Tuples2<? extends Spanned, ? extends Boolean>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C116793(Continuation<? super C116793> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116793 c116793 = RecurringCryptoDisclosureBottomSheetFragment.this.new C116793(continuation);
            c116793.L$0 = obj;
            return c116793;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Spanned, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<? extends Spanned, Boolean>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends Spanned, Boolean> tuples2, Continuation<? super Unit> continuation) {
            return ((C116793) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Spanned spanned = (Spanned) tuples2.component1();
            if (((Boolean) tuples2.component2()).booleanValue()) {
                RecurringCryptoDisclosureBottomSheetFragment.this.updateText(null, spanned);
            } else {
                RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment = RecurringCryptoDisclosureBottomSheetFragment.this;
                recurringCryptoDisclosureBottomSheetFragment.updateText(recurringCryptoDisclosureBottomSheetFragment.getReviewText(), spanned);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectDisclosureTitleAndButton(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(getCryptoExperimentsStore().streamCryptoRecurringOrdersVTExperiment(), new C116812(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isVTExperimentEnabled", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureTitleAndButton$2", m3645f = "RecurringCryptoDisclosureBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$collectDisclosureTitleAndButton$2 */
    static final class C116812 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        C116812(Continuation<? super C116812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116812 c116812 = RecurringCryptoDisclosureBottomSheetFragment.this.new C116812(continuation);
            c116812.Z$0 = ((Boolean) obj).booleanValue();
            return c116812;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C116812) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                RecurringCryptoDisclosureBottomSheetFragment.this.getBinding().dialogFragmentTitle.setText(RecurringCryptoDisclosureBottomSheetFragment.this.getResources().getString(C11048R.string.general_label_disclosures));
                RecurringCryptoDisclosureBottomSheetFragment.this.getBinding().dialogFragmentPositiveBtn.setText(RecurringCryptoDisclosureBottomSheetFragment.this.getResources().getString(C11048R.string.general_label_got_it));
            } else {
                RecurringCryptoDisclosureBottomSheetFragment.this.getBinding().dialogFragmentTitle.setText(RecurringCryptoDisclosureBottomSheetFragment.this.getResources().getString(C11048R.string.general_label_disclosure));
                RecurringCryptoDisclosureBottomSheetFragment.this.getBinding().dialogFragmentPositiveBtn.setText(RecurringCryptoDisclosureBottomSheetFragment.this.getResources().getString(C11048R.string.general_label_dismiss));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateText(String reviewText, Spanned orderTimingDisclosure) throws Resources.NotFoundException {
        String string2;
        if (reviewText != null) {
            string2 = getResources().getString(C11595R.string.recurring_investment_crypto_full_disclosure, reviewText, orderTimingDisclosure);
        } else {
            string2 = getResources().getString(C11595R.string.recurring_investment_crypto_partial_disclosure, orderTimingDisclosure);
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        DialogRecurringInfoBinding binding = getBinding();
        RhTextView dialogFragmentMessage = binding.dialogFragmentMessage;
        Intrinsics.checkNotNullExpressionValue(dialogFragmentMessage, "dialogFragmentMessage");
        TextViewsKt.setTextWithLearnMore((TextView) dialogFragmentMessage, (CharSequence) str, true, true, getResources().getString(C11595R.string.additional_disclosures), (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$updateText$lambda$3$$inlined$setTextWithLearnMore$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.getContext(), "https://cdn.robinhood.com/assets/robinhood/legal/Robinhood%20Crypto%20Risk%20Disclosures.pdf", 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
        RdsButton dialogFragmentPositiveBtn = binding.dialogFragmentPositiveBtn;
        Intrinsics.checkNotNullExpressionValue(dialogFragmentPositiveBtn, "dialogFragmentPositiveBtn");
        OnClickListeners.onClick(dialogFragmentPositiveBtn, new Function0() { // from class: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringCryptoDisclosureBottomSheetFragment.updateText$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateText$lambda$3$lambda$2(RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment) {
        recurringCryptoDisclosureBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/recurring/contracts/RecurringCryptoDisclosureBottomSheet;", "<init>", "()V", "KEY_REVIEW_TEXT", "", "createDialogFragment", "Lcom/robinhood/android/common/recurring/bottomsheet/RecurringCryptoDisclosureBottomSheetFragment;", "key", "DISCLOSURE_URL", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements DialogFragmentResolver<RecurringDialogFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public RecurringCryptoDisclosureBottomSheetFragment createDialogFragment(RecurringDialogFragmentKeys key) {
            Intrinsics.checkNotNullParameter(key, "key");
            RecurringCryptoDisclosureBottomSheetFragment recurringCryptoDisclosureBottomSheetFragment = new RecurringCryptoDisclosureBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString(RecurringCryptoDisclosureBottomSheetFragment.KEY_REVIEW_TEXT, key.getReviewText());
            recurringCryptoDisclosureBottomSheetFragment.setArguments(bundle);
            return recurringCryptoDisclosureBottomSheetFragment;
        }
    }
}
