package com.robinhood.android.acatsin.landed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.acats.contracts.AcatsIntentKeys2;
import com.robinhood.android.acatsin.landed.AcatsLandedFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.home.contracts.MainActivityIntentKey;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.ShimmerLoadingFragment;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.udf.UiEvent;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsLandedActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/acatsin/landed/AcatsLandedFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/landed/AcatsLandedDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/landed/AcatsLandedDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "setViewState", "state", "Lcom/robinhood/android/acatsin/landed/AcatsLandedViewState;", "onManageClicked", "onViewDetailsClicked", "acatsTransfer", "Lcom/robinhood/models/acats/db/bonfire/AcatsTransfer;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsLandedActivity extends BaseActivity implements AcatsLandedFragment.Callbacks {
    public static final String EXTRA_TRANSFER_ID = "transferId";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AcatsLandedActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.duxo = DuxosKt.duxo(this, AcatsLandedDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsLandedDuxo getDuxo() {
        return (AcatsLandedDuxo) this.duxo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShimmerLoadingFragment.Args.NavButtonType navButtonType = null;
        Object[] objArr = 0;
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, ShimmerLoadingFragment.INSTANCE.newInstance((Parcelable) new ShimmerLoadingFragment.Args(new ShimmerLoaderType.Promo(0, 1, null), navButtonType, 2, objArr == true ? 1 : 0)));
        }
        BaseActivity.collectDuxoState$default(this, null, new C79481(null), 1, null);
    }

    /* compiled from: AcatsLandedActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.landed.AcatsLandedActivity$onCreate$1", m3645f = "AcatsLandedActivity.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.landed.AcatsLandedActivity$onCreate$1 */
    static final class C79481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C79481(Continuation<? super C79481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsLandedActivity.this.new C79481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C79481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsLandedActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.landed.AcatsLandedActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsLandedActivity $tmp0;

            AnonymousClass1(AcatsLandedActivity acatsLandedActivity) {
                this.$tmp0 = acatsLandedActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsLandedActivity.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/landed/AcatsLandedViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsLandedViewState acatsLandedViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setViewState = C79481.invokeSuspend$setViewState(this.$tmp0, acatsLandedViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsLandedViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsLandedActivity acatsLandedActivity, AcatsLandedViewState acatsLandedViewState, Continuation continuation) {
            acatsLandedActivity.setViewState(acatsLandedViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsLandedViewState> stateFlow = AcatsLandedActivity.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsLandedActivity.this);
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(AcatsLandedViewState state) {
        Throwable thConsume;
        AcatsTransfer acatsTransferConsume;
        UiEvent<AcatsTransfer> transitionToLoadedScreen = state.getTransitionToLoadedScreen();
        if (transitionToLoadedScreen != null && (acatsTransferConsume = transitionToLoadedScreen.consume()) != null && !(getCurrentFragment() instanceof AcatsLandedFragment)) {
            replaceFragmentWithoutBackStack(AcatsLandedFragment.INSTANCE.newInstance((Parcelable) new AcatsLandedFragment.Args(acatsTransferConsume)));
        }
        UiEvent<Throwable> networkError = state.getNetworkError();
        if (networkError == null || (thConsume = networkError.consume()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null);
    }

    @Override // com.robinhood.android.acatsin.landed.AcatsLandedFragment.Callbacks
    public void onManageClicked() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, MainActivityIntentKey.INSTANCE, null, false, null, null, 60, null);
        finish();
    }

    @Override // com.robinhood.android.acatsin.landed.AcatsLandedFragment.Callbacks
    public void onViewDetailsClicked(AcatsTransfer acatsTransfer) {
        Intrinsics.checkNotNullParameter(acatsTransfer, "acatsTransfer");
        startActivity(Navigator.DefaultImpls.createIntentForFragment$default(getNavigator(), this, LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, DetailType.ACATS_TRANSFER, acatsTransfer.getId(), null, false, 12, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null));
        finish();
    }

    /* compiled from: AcatsLandedActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/landed/AcatsLandedActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/acats/contracts/AcatsLanded;", "<init>", "()V", "EXTRA_TRANSFER_ID", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<AcatsIntentKeys2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, AcatsIntentKeys2 key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intentPutExtra = new Intent(context, (Class<?>) AcatsLandedActivity.class).putExtra("transferId", key.getAcatsTransferId());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }
}
