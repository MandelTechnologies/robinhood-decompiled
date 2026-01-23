package com.robinhood.android.rhsconversion;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.rhs.conversion.C27319R;
import com.robinhood.android.rhsconversion.RhsConversionDisclosuresDuxo2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.shared.common.agreementview.RdsAgreementView;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: RhsConversionDisclosuresFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView$OnAgreementAcceptedListener;", "<init>", "()V", "agreementView", "Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "getAgreementView", "()Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", "agreementView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresDuxo;", "getDuxo", "()Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAgreementAccepted", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleEvent", "event", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresEvent;", "Companion", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhsConversionDisclosuresFragment extends BaseFragment implements RdsAgreementView.OnAgreementAcceptedListener {

    /* renamed from: agreementView$delegate, reason: from kotlin metadata */
    private final Interfaces2 agreementView;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhsConversionDisclosuresFragment.class, "agreementView", "getAgreementView()Lcom/robinhood/shared/common/agreementview/RdsAgreementView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RhsConversionDisclosuresFragment() {
        super(C27319R.layout.fragment_rhs_conversion_disclosure);
        this.agreementView = bindView(C27319R.id.rhs_conversion_agreement_view);
        this.duxo = DuxosKt.duxo(this, RhsConversionDisclosuresDuxo.class);
    }

    private final RdsAgreementView getAgreementView() {
        return (RdsAgreementView) this.agreementView.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhsConversionDisclosuresDuxo getDuxo() {
        return (RhsConversionDisclosuresDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getAgreementView().setOnAgreementAcceptedListener(this);
        BaseFragment.collectDuxoState$default(this, null, new C273261(null), 1, null);
    }

    /* compiled from: RhsConversionDisclosuresFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhsconversion.RhsConversionDisclosuresFragment$onViewCreated$1", m3645f = "RhsConversionDisclosuresFragment.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhsconversion.RhsConversionDisclosuresFragment$onViewCreated$1 */
    static final class C273261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C273261(Continuation<? super C273261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhsConversionDisclosuresFragment.this.new C273261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(RhsConversionDisclosuresFragment.this.getDuxo().getEventFlow());
                final RhsConversionDisclosuresFragment rhsConversionDisclosuresFragment = RhsConversionDisclosuresFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.rhsconversion.RhsConversionDisclosuresFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<RhsConversionDisclosuresDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<RhsConversionDisclosuresDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<RhsConversionDisclosuresDuxo2> eventConsumerInvoke;
                        final RhsConversionDisclosuresFragment rhsConversionDisclosuresFragment2 = rhsConversionDisclosuresFragment;
                        if ((event.getData() instanceof RhsConversionDisclosuresDuxo2) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.rhsconversion.RhsConversionDisclosuresFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m18242invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18242invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    rhsConversionDisclosuresFragment2.handleEvent((RhsConversionDisclosuresDuxo2) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.shared.common.agreementview.RdsAgreementView.OnAgreementAcceptedListener
    public void onAgreementAccepted(RdsAgreementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getDuxo().onAgreementAccepted();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        ActionBar supportActionBar = baseActivity.getSupportActionBar();
        Intrinsics.checkNotNull(supportActionBar);
        supportActionBar.setDisplayHomeAsUpEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(RhsConversionDisclosuresDuxo2 event) {
        if (Intrinsics.areEqual(event, RhsConversionDisclosuresDuxo2.Success.INSTANCE)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Toast.makeText(fragmentActivityRequireActivity, C27319R.string.rhs_conversion_agreement_success, 1).show();
            fragmentActivityRequireActivity.setResult(-1);
            fragmentActivityRequireActivity.finish();
            return;
        }
        if (!(event instanceof RhsConversionDisclosuresDuxo2.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((RhsConversionDisclosuresDuxo2.Error) event).getThrowable(), false, 2, null);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        baseActivity.getSupportFragmentManager().popBackStack();
    }

    /* compiled from: RhsConversionDisclosuresFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/rhsconversion/RhsConversionDisclosuresFragment;", "feature-rhs-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RhsConversionDisclosuresFragment newInstance() {
            return new RhsConversionDisclosuresFragment();
        }
    }
}
