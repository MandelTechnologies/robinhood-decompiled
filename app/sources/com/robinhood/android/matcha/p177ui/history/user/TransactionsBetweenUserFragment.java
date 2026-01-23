package com.robinhood.android.matcha.p177ui.history.user;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.ImageLoader;
import coil.compose.LocalImageLoader;
import coil.compose.LocalImageLoader2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.matcha.p177ui.history.user.TransactionsBetweenUserFragment;
import com.robinhood.android.matcha.p177ui.history.user.TransactionsBetweenUserViewState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.TransactionsBetweenUserFragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.udf.UiEvent;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: TransactionsBetweenUserFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\r\u0010\u0019\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "imageLoader", "Lcoil/ImageLoader;", "getImageLoader", "()Lcoil/ImageLoader;", "setImageLoader", "(Lcoil/ImageLoader;)V", "duxo", "Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDialogDismissed", "id", "", "Companion", "feature-p2p_externalDebug", "viewState", "Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TransactionsBetweenUserFragment extends GenericComposeFragment {
    public ImageLoader imageLoader;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, TransactionsBetweenUserDuxo.class);
    private final SduiActionHandler<GenericAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$actionHandler$1
        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(GenericAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (!(action instanceof GenericAction.Deeplink)) {
                return false;
            }
            Navigator navigator = this.this$0.getNavigator();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), Boolean.FALSE, null, false, null, 56, null);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(TransactionsBetweenUserFragment transactionsBetweenUserFragment, int i, Composer composer, int i2) {
        transactionsBetweenUserFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionsBetweenUserDuxo getDuxo() {
        return (TransactionsBetweenUserDuxo) this.duxo.getValue();
    }

    /* compiled from: TransactionsBetweenUserFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$onViewCreated$1", m3645f = "TransactionsBetweenUserFragment.kt", m3646l = {54}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$onViewCreated$1 */
    static final class C213751 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C213751(Continuation<? super C213751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TransactionsBetweenUserFragment.this.new C213751(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C213751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: TransactionsBetweenUserFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ TransactionsBetweenUserFragment this$0;

            AnonymousClass1(TransactionsBetweenUserFragment transactionsBetweenUserFragment) {
                this.this$0 = transactionsBetweenUserFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((TransactionsBetweenUserViewState) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(TransactionsBetweenUserViewState transactionsBetweenUserViewState, Continuation<? super Unit> continuation) {
                UiEvent<Throwable> event;
                TransactionsBetweenUserViewState.Error error = transactionsBetweenUserViewState instanceof TransactionsBetweenUserViewState.Error ? (TransactionsBetweenUserViewState.Error) transactionsBetweenUserViewState : null;
                if (error != null && (event = error.getEvent()) != null) {
                    final TransactionsBetweenUserFragment transactionsBetweenUserFragment = this.this$0;
                    event.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$onViewCreated$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TransactionsBetweenUserFragment.C213751.AnonymousClass1.emit$lambda$0(transactionsBetweenUserFragment, (Throwable) obj);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$0(TransactionsBetweenUserFragment transactionsBetweenUserFragment, Throwable it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = transactionsBetweenUserFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, it, true, false, 0, null, 56, null);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<TransactionsBetweenUserViewState> stateFlow = TransactionsBetweenUserFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TransactionsBetweenUserFragment.this);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C213751(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(485786392);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485786392, i2, -1, "com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment.ComposeContent (TransactionsBetweenUserFragment.kt:67)");
            }
            final TransactionsBetweenUserViewState transactionsBetweenUserViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (transactionsBetweenUserViewStateComposeContent$lambda$0 instanceof TransactionsBetweenUserViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(-1977153271);
                CompositionLocal3.CompositionLocalProvider(LocalImageLoader.m9117providesimpl(LocalImageLoader2.getLocalImageLoader(), getImageLoader()), ComposableLambda3.rememberComposableLambda(1904732496, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment.ComposeContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1904732496, i3, -1, "com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment.ComposeContent.<anonymous> (TransactionsBetweenUserFragment.kt:73)");
                        }
                        ImmutableList3 persistentList = extensions2.toPersistentList(((TransactionsBetweenUserViewState.Loaded) transactionsBetweenUserViewStateComposeContent$lambda$0).getComponents());
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        SduiActionHandler sduiActionHandler = this.actionHandler;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierVerticalScroll$default, null, sduiActionHandler, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(transactionsBetweenUserViewStateComposeContent$lambda$0 instanceof TransactionsBetweenUserViewState.Loading) && !(transactionsBetweenUserViewStateComposeContent$lambda$0 instanceof TransactionsBetweenUserViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-1310707270);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1976487732);
                LocalShowPlaceholder.Loadable(true, null, null, TransactionsBetweenUserFragment2.INSTANCE.getLambda$682468041$feature_p2p_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.history.user.TransactionsBetweenUserFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransactionsBetweenUserFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final TransactionsBetweenUserViewState ComposeContent$lambda$0(SnapshotState4<? extends TransactionsBetweenUserViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: TransactionsBetweenUserFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/history/user/TransactionsBetweenUserFragment;", "Lcom/robinhood/android/social/contracts/TransactionsBetweenUserFragmentKey;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TransactionsBetweenUserFragment, TransactionsBetweenUserFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(TransactionsBetweenUserFragmentKey transactionsBetweenUserFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, transactionsBetweenUserFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public TransactionsBetweenUserFragmentKey getArgs(TransactionsBetweenUserFragment transactionsBetweenUserFragment) {
            return (TransactionsBetweenUserFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transactionsBetweenUserFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransactionsBetweenUserFragment newInstance(TransactionsBetweenUserFragmentKey transactionsBetweenUserFragmentKey) {
            return (TransactionsBetweenUserFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transactionsBetweenUserFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransactionsBetweenUserFragment transactionsBetweenUserFragment, TransactionsBetweenUserFragmentKey transactionsBetweenUserFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transactionsBetweenUserFragment, transactionsBetweenUserFragmentKey);
        }
    }
}
