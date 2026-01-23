package com.robinhood.android.account.p060ui.margin;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.account.overview.databinding.MarginInvestingLearnMoreDialogBinding;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.scarlet.ScarletContextWrapper;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: MarginInvestingLearnMoreDialog.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialog;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/account/overview/databinding/MarginInvestingLearnMoreDialogBinding;", "getBinding", "()Lcom/robinhood/android/account/overview/databinding/MarginInvestingLearnMoreDialogBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogDuxo;", "getDuxo", "()Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;", "Companion", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class MarginInvestingLearnMoreDialog extends BaseDialogFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginInvestingLearnMoreDialog.class, "binding", "getBinding()Lcom/robinhood/android/account/overview/databinding/MarginInvestingLearnMoreDialogBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MarginInvestingLearnMoreDialog() {
        super(C8159R.layout.margin_investing_learn_more_dialog);
        this.binding = ViewBinding5.viewBinding(this, MarginInvestingLearnMoreDialog2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, MarginInvestingLearnMoreDialogDuxo.class);
    }

    private final MarginInvestingLearnMoreDialogBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MarginInvestingLearnMoreDialogBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginInvestingLearnMoreDialogDuxo getDuxo() {
        return (MarginInvestingLearnMoreDialogDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C82431(null), 1, null);
        getBinding().positiveBtn.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialog.onViewCreated.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MarginInvestingLearnMoreDialog.this.dismiss();
            }
        });
    }

    /* compiled from: MarginInvestingLearnMoreDialog.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialog$onViewCreated$1", m3645f = "MarginInvestingLearnMoreDialog.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialog$onViewCreated$1 */
    static final class C82431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C82431(Continuation<? super C82431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginInvestingLearnMoreDialog.this.new C82431(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C82431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MarginInvestingLearnMoreDialogViewState> stateFlow = MarginInvestingLearnMoreDialog.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginInvestingLearnMoreDialog.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* compiled from: MarginInvestingLearnMoreDialog.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.account.ui.margin.MarginInvestingLearnMoreDialog$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MarginInvestingLearnMoreDialog $tmp0;

            AnonymousClass1(MarginInvestingLearnMoreDialog marginInvestingLearnMoreDialog) {
                this.$tmp0 = marginInvestingLearnMoreDialog;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MarginInvestingLearnMoreDialog.class, "setViewState", "setViewState(Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialogViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C82431.invokeSuspend$setViewState(this.$tmp0, marginInvestingLearnMoreDialogViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MarginInvestingLearnMoreDialogViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(MarginInvestingLearnMoreDialog marginInvestingLearnMoreDialog, MarginInvestingLearnMoreDialogViewState marginInvestingLearnMoreDialogViewState, Continuation continuation) {
            marginInvestingLearnMoreDialog.setViewState(marginInvestingLearnMoreDialogViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(MarginInvestingLearnMoreDialogViewState state) {
        MarginInvestingLearnMoreDialogBinding binding = getBinding();
        ShimmerLoadingView loadingView = binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getIsLoading() ? 0 : 8);
        RhTextView contentText = binding.contentText;
        Intrinsics.checkNotNullExpressionValue(contentText, "contentText");
        contentText.setVisibility(state.getIsLoading() ? 8 : 0);
        RhTextView rhTextView = binding.contentText;
        CharSequence content = state.getContent();
        if (content == null) {
            Integer errorMessageId = state.getErrorMessageId();
            content = errorMessageId != null ? getString(errorMessageId.intValue()) : null;
            if (content == null) {
                content = "";
            }
        }
        rhTextView.setText(content);
    }

    /* compiled from: MarginInvestingLearnMoreDialog.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/account/ui/margin/MarginInvestingLearnMoreDialog;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginInvestingLearnMoreDialog newInstance() {
            return new MarginInvestingLearnMoreDialog();
        }
    }
}
