package com.robinhood.android.history.p153ui;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.common.strings.C32428R;
import com.robinhood.librobinhood.data.store.LegacyStockLoanPaymentStore;
import com.robinhood.models.p320db.LegacyStockLoanPayment;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LegacyStockLoanPaymentDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0007R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyStockLoanPaymentDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "dateSection", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getDateSection", "()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "dateSection$delegate", "Lkotlin/properties/ReadOnlyProperty;", "amountSection", "getAmountSection", "amountSection$delegate", "legacyStockLoanPaymentStore", "Lcom/robinhood/librobinhood/data/store/LegacyStockLoanPaymentStore;", "getLegacyStockLoanPaymentStore", "()Lcom/robinhood/librobinhood/data/store/LegacyStockLoanPaymentStore;", "setLegacyStockLoanPaymentStore", "(Lcom/robinhood/librobinhood/data/store/LegacyStockLoanPaymentStore;)V", LegacyStockLoanPaymentDetailFragment.EXTRA_PAYMENT_ID, "Ljava/util/UUID;", "getPaymentId", "()Ljava/util/UUID;", "paymentId$delegate", "Lkotlin/Lazy;", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshUi", "paymentLegacy", "Lcom/robinhood/models/db/LegacyStockLoanPayment;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class LegacyStockLoanPaymentDetailFragment extends BaseDetailFragment {
    private static final String EXTRA_PAYMENT_ID = "paymentId";

    /* renamed from: amountSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 amountSection;

    /* renamed from: dateSection$delegate, reason: from kotlin metadata */
    private final Interfaces2 dateSection;
    public LegacyStockLoanPaymentStore legacyStockLoanPaymentStore;

    /* renamed from: paymentId$delegate, reason: from kotlin metadata */
    private final Lazy paymentId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LegacyStockLoanPaymentDetailFragment.class, "dateSection", "getDateSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0)), Reflection.property1(new PropertyReference1Impl(LegacyStockLoanPaymentDetailFragment.class, "amountSection", "getAmountSection()Lcom/robinhood/android/designsystem/row/RdsDataRowView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LegacyStockLoanPaymentDetailFragment() {
        super(C18359R.layout.fragment_legacy_stock_loan_payment_detail);
        this.dateSection = bindView(C18359R.id.stock_loan_payment_detail_date);
        this.amountSection = bindView(C18359R.id.stock_loan_payment_detail_amount);
        this.paymentId = Fragments2.argument(this, EXTRA_PAYMENT_ID);
    }

    private final RdsDataRowView getDateSection() {
        return (RdsDataRowView) this.dateSection.getValue(this, $$delegatedProperties[0]);
    }

    private final RdsDataRowView getAmountSection() {
        return (RdsDataRowView) this.amountSection.getValue(this, $$delegatedProperties[1]);
    }

    public final LegacyStockLoanPaymentStore getLegacyStockLoanPaymentStore() {
        LegacyStockLoanPaymentStore legacyStockLoanPaymentStore = this.legacyStockLoanPaymentStore;
        if (legacyStockLoanPaymentStore != null) {
            return legacyStockLoanPaymentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("legacyStockLoanPaymentStore");
        return null;
    }

    public final void setLegacyStockLoanPaymentStore(LegacyStockLoanPaymentStore legacyStockLoanPaymentStore) {
        Intrinsics.checkNotNullParameter(legacyStockLoanPaymentStore, "<set-?>");
        this.legacyStockLoanPaymentStore = legacyStockLoanPaymentStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getPaymentId() {
        return (UUID) this.paymentId.getValue();
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = getPaymentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getExpandedToolbarTitleTxt().setText(C32428R.string.stock_lending_payment_detail_title);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C183921(null), 3, null);
    }

    /* compiled from: LegacyStockLoanPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.history.ui.LegacyStockLoanPaymentDetailFragment$onViewCreated$1", m3645f = "LegacyStockLoanPaymentDetailFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.history.ui.LegacyStockLoanPaymentDetailFragment$onViewCreated$1 */
    static final class C183921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C183921(Continuation<? super C183921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyStockLoanPaymentDetailFragment.this.new C183921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C183921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LegacyStockLoanPaymentDetailFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.history.ui.LegacyStockLoanPaymentDetailFragment$onViewCreated$1$1", m3645f = "LegacyStockLoanPaymentDetailFragment.kt", m3646l = {43}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.history.ui.LegacyStockLoanPaymentDetailFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LegacyStockLoanPaymentDetailFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LegacyStockLoanPaymentDetailFragment legacyStockLoanPaymentDetailFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = legacyStockLoanPaymentDetailFragment;
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
                    Flow<LegacyStockLoanPayment> stockLoanPayment = this.this$0.getLegacyStockLoanPaymentStore().getStockLoanPayment(this.this$0.getPaymentId());
                    C501771 c501771 = new C501771(this.this$0);
                    this.label = 1;
                    if (FlowKt.collectLatest(stockLoanPayment, c501771, this) == coroutine_suspended) {
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

            /* compiled from: LegacyStockLoanPaymentDetailFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.history.ui.LegacyStockLoanPaymentDetailFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C501771 extends AdaptedFunctionReference implements Function2<LegacyStockLoanPayment, Continuation<? super Unit>, Object>, ContinuationImpl6 {
                C501771(Object obj) {
                    super(2, obj, LegacyStockLoanPaymentDetailFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/models/db/LegacyStockLoanPayment;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(LegacyStockLoanPayment legacyStockLoanPayment, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$refreshUi((LegacyStockLoanPaymentDetailFragment) this.receiver, legacyStockLoanPayment, continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$refreshUi(LegacyStockLoanPaymentDetailFragment legacyStockLoanPaymentDetailFragment, LegacyStockLoanPayment legacyStockLoanPayment, Continuation continuation) {
                legacyStockLoanPaymentDetailFragment.refreshUi(legacyStockLoanPayment);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = LegacyStockLoanPaymentDetailFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LegacyStockLoanPaymentDetailFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(LegacyStockLoanPayment paymentLegacy) {
        getDateSection().setValueText(LocalDateFormatter.MEDIUM.format(paymentLegacy.getDate()));
        getAmountSection().setValueText(Formats.getCurrencyFormat().format(paymentLegacy.getAmount()));
    }

    /* compiled from: LegacyStockLoanPaymentDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/history/ui/LegacyStockLoanPaymentDetailFragment$Companion;", "", "<init>", "()V", "EXTRA_PAYMENT_ID", "", "newInstance", "Lcom/robinhood/android/history/ui/LegacyStockLoanPaymentDetailFragment;", LegacyStockLoanPaymentDetailFragment.EXTRA_PAYMENT_ID, "Ljava/util/UUID;", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LegacyStockLoanPaymentDetailFragment newInstance(UUID paymentId) {
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            LegacyStockLoanPaymentDetailFragment legacyStockLoanPaymentDetailFragment = new LegacyStockLoanPaymentDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable(LegacyStockLoanPaymentDetailFragment.EXTRA_PAYMENT_ID, paymentId);
            legacyStockLoanPaymentDetailFragment.setArguments(bundle);
            return legacyStockLoanPaymentDetailFragment;
        }
    }
}
