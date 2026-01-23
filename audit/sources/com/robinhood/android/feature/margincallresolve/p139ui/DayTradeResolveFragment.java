package com.robinhood.android.feature.margincallresolve.p139ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.feature.margincallresolve.DayTradeResolveDuxo;
import com.robinhood.android.feature.margincallresolve.DayTradeResolveState3;
import com.robinhood.android.feature.margincallresolve.p139ui.DayTradeResolveFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.margin.contracts.DayTradeCallResolveFragmentKey;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DayTradeResolveFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/ui/DayTradeResolveFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDialogDismissed", "id", "", "Companion", "feature-margin-call-resolve_externalDebug", "viewState", "Lcom/robinhood/android/feature/margincallresolve/DayTradeResolveViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DayTradeResolveFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DayTradeResolveDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(DayTradeResolveFragment dayTradeResolveFragment, int i, Composer composer, int i2) {
        dayTradeResolveFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final DayTradeResolveDuxo getDuxo() {
        return (DayTradeResolveDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1412927591);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1412927591, i2, -1, "com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment.ComposeContent (DayTradeResolveFragment.kt:28)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment$ComposeContent$actionHandler$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (!(action instanceof GenericAction.Deeplink)) {
                            return false;
                        }
                        Navigator navigator = this.this$0.getNavigator();
                        Context context2 = context;
                        Uri uri = Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri());
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        context.startActivity((Intent) ArraysKt.last(Navigator.DefaultImpls.resolveDeepLink$default(navigator, context2, uri, null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null)));
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(494519464, true, new C169091((SduiActionHandler) objRememberedValue, this, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DayTradeResolveFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: DayTradeResolveFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment$ComposeContent$1 */
    static final class C169091 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
        final /* synthetic */ SnapshotState4<DayTradeResolveState3> $viewState$delegate;
        final /* synthetic */ DayTradeResolveFragment this$0;

        /* JADX WARN: Multi-variable type inference failed */
        C169091(SduiActionHandler<? super GenericAction> sduiActionHandler, DayTradeResolveFragment dayTradeResolveFragment, SnapshotState4<? extends DayTradeResolveState3> snapshotState4) {
            this.$actionHandler = sduiActionHandler;
            this.this$0 = dayTradeResolveFragment;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= composer.changed(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(494519464, i, -1, "com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment.ComposeContent.<anonymous> (DayTradeResolveFragment.kt:46)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            DayTradeResolveState3 dayTradeResolveState3ComposeContent$lambda$0 = DayTradeResolveFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final DayTradeResolveFragment dayTradeResolveFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DayTradeResolveFragment.C169091.invoke$lambda$1$lambda$0(dayTradeResolveFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(this.this$0);
            final DayTradeResolveFragment dayTradeResolveFragment2 = this.this$0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DayTradeResolveFragment.C169091.invoke$lambda$3$lambda$2(dayTradeResolveFragment2, (Throwable) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            DayTradeResolveComposable.DayTradeResolveComposable(dayTradeResolveState3ComposeContent$lambda$0, sduiActionHandler, function0, (Function1) objRememberedValue2, modifierPadding, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DayTradeResolveFragment dayTradeResolveFragment) {
            dayTradeResolveFragment.requireActivity().finish();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(DayTradeResolveFragment dayTradeResolveFragment, Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            AbsErrorHandler.handleError$default(dayTradeResolveFragment.getActivityErrorHandler(), throwable, false, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        super.onDialogDismissed(id);
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        }
    }

    /* compiled from: DayTradeResolveFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/feature/margincallresolve/ui/DayTradeResolveFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/margin/contracts/DayTradeCallResolveFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/feature/margincallresolve/ui/DayTradeResolveFragment;", "<init>", "()V", "createFragment", "key", "feature-margin-call-resolve_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<DayTradeCallResolveFragmentKey>, FragmentWithArgsCompanion<DayTradeResolveFragment, DayTradeCallResolveFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DayTradeCallResolveFragmentKey getArgs(DayTradeResolveFragment dayTradeResolveFragment) {
            return (DayTradeCallResolveFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, dayTradeResolveFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DayTradeResolveFragment newInstance(DayTradeCallResolveFragmentKey dayTradeCallResolveFragmentKey) {
            return (DayTradeResolveFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, dayTradeCallResolveFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DayTradeResolveFragment dayTradeResolveFragment, DayTradeCallResolveFragmentKey dayTradeCallResolveFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, dayTradeResolveFragment, dayTradeCallResolveFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public DayTradeResolveFragment createFragment(DayTradeCallResolveFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DayTradeResolveFragment) newInstance((Parcelable) key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DayTradeResolveState3 ComposeContent$lambda$0(SnapshotState4<? extends DayTradeResolveState3> snapshotState4) {
        return snapshotState4.getValue();
    }
}
