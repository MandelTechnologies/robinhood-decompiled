package com.robinhood.android.pathfinder.corepages.supportlanding;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingEvent;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.PathfinderAction;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import com.robinhood.shared.support.contracts.pathfinder.SupportLandingFragmentKey;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SupportLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001b\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0002J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001aH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingAccountSelectionBottomSheet$Callbacks;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "callbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "savedTitleTextAppearance", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "savedBackgroundColor", "", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onStop", "resetToolbarState", "onAccountSelected", "accountType", "", "subAccountNumber", "updateBackground", ResourceTypes.COLOR, "Companion", "feature-pathfinder-core-pages_externalDebug", "viewState", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SupportLandingFragment extends GenericComposeFragment implements SupportLandingAccountSelectionBottomSheet.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SupportLandingDuxo.class);
    public Markwon markwon;
    private int savedBackgroundColor;
    private ResourceReferences4<?> savedTitleTextAppearance;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SupportLandingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SupportLandingFragment supportLandingFragment, int i, Composer composer, int i2) {
        supportLandingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragmentCallbacks getCallbacks() {
        return (PathfinderFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportLandingDuxo getDuxo() {
        return (SupportLandingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1253293269);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1253293269, i2, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment.ComposeContent (SupportLandingFragment.kt:52)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(998089664, true, new C254011(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SupportLandingFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SupportLandingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1 */
    static final class C254011 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<SupportLandingViewState> $viewState$delegate;

        C254011(SnapshotState4<SupportLandingViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(998089664, i, -1, "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment.ComposeContent.<anonymous> (SupportLandingFragment.kt:56)");
            }
            SupportLandingViewState supportLandingViewStateComposeContent$lambda$0 = SupportLandingFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            FragmentManager childFragmentManager = SupportLandingFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            Markwon markwon = SupportLandingFragment.this.getMarkwon();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(SupportLandingFragment.this) | composer.changed(this.$viewState$delegate);
            final SupportLandingFragment supportLandingFragment = SupportLandingFragment.this;
            final SnapshotState4<SupportLandingViewState> snapshotState4 = this.$viewState$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$1$lambda$0(supportLandingFragment, snapshotState4, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment2 = SupportLandingFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<Color, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Color color) {
                        m17568invoke8_81llA(color.getValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-8_81llA, reason: not valid java name */
                    public final void m17568invoke8_81llA(long j) {
                        supportLandingFragment2.updateBackground(Color2.m6735toArgb8_81llA(j));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment3 = SupportLandingFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$4$lambda$3(supportLandingFragment3, (PathfinderAction.Deeplink) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function13 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment4 = SupportLandingFragment.this;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$6$lambda$5(supportLandingFragment4, (PathfinderAction.UpdateBackend) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function14 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment5 = SupportLandingFragment.this;
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SupportLandingFragment.C254011.invoke$lambda$8$lambda$7(supportLandingFragment5, (PathfinderAction.SubmitForm) obj, (Map) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            Function2 function2 = (Function2) objRememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance6 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment6 = SupportLandingFragment.this;
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$10$lambda$9(supportLandingFragment6, (PathfinderAction.Dismiss) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            Function1 function15 = (Function1) objRememberedValue6;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance7 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment7 = SupportLandingFragment.this;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$12$lambda$11(supportLandingFragment7, (RhBottomSheetDialogFragmentHost.SheetListener) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            Function1 function16 = (Function1) objRememberedValue7;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment8 = SupportLandingFragment.this;
            final SnapshotState4<SupportLandingViewState> snapshotState42 = this.$viewState$delegate;
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChanged || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$14$lambda$13(supportLandingFragment8, snapshotState42, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            Function1 function17 = (Function1) objRememberedValue8;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance8 = composer.changedInstance(SupportLandingFragment.this);
            final SupportLandingFragment supportLandingFragment9 = SupportLandingFragment.this;
            Object objRememberedValue9 = composer.rememberedValue();
            if (zChangedInstance8 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$ComposeContent$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SupportLandingFragment.C254011.invoke$lambda$16$lambda$15(supportLandingFragment9, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue9);
            }
            composer.endReplaceGroup();
            SupportLandingComposable5.SupportLandingComposable(supportLandingViewStateComposeContent$lambda$0, childFragmentManager, markwon, function1, function12, function13, function14, function2, function15, function16, function17, (Function1) objRememberedValue9, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SupportLandingFragment supportLandingFragment, SnapshotState4 snapshotState4, String accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            supportLandingFragment.getDuxo().setTabSelected$feature_pathfinder_core_pages_externalDebug(accountType, SupportLandingFragment.ComposeContent$lambda$0(snapshotState4).getAccountTypeToTabStatus());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(SupportLandingFragment supportLandingFragment, PathfinderAction.Deeplink action) {
            Intrinsics.checkNotNullParameter(action, "action");
            Navigator navigator = supportLandingFragment.getNavigator();
            Context contextRequireContext = supportLandingFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(action.getValue2().getUri()), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(SupportLandingFragment supportLandingFragment, PathfinderAction.UpdateBackend action) {
            Intrinsics.checkNotNullParameter(action, "action");
            supportLandingFragment.getDuxo().sendInput(action.getValue2().getValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(SupportLandingFragment supportLandingFragment, PathfinderAction.SubmitForm action, Map formData) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(formData, "formData");
            supportLandingFragment.getDuxo().submitFormInput(action.getValue2().getValue(), formData);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(SupportLandingFragment supportLandingFragment, PathfinderAction.Dismiss it) {
            Intrinsics.checkNotNullParameter(it, "it");
            supportLandingFragment.getCallbacks().dismissFlow();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(SupportLandingFragment supportLandingFragment, RhBottomSheetDialogFragmentHost.SheetListener sheetListener) {
            Intrinsics.checkNotNullParameter(sheetListener, "sheetListener");
            supportLandingFragment.setSheetListener(sheetListener);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(SupportLandingFragment supportLandingFragment, SnapshotState4 snapshotState4, List selectableAccountNameToNumber) {
            Intrinsics.checkNotNullParameter(selectableAccountNameToNumber, "selectableAccountNameToNumber");
            SupportLandingAccountSelectionBottomSheet supportLandingAccountSelectionBottomSheet = (SupportLandingAccountSelectionBottomSheet) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(SupportLandingAccountSelectionBottomSheet.INSTANCE, new SupportLandingAccountSelectionBottomSheet.Args(SupportLandingFragment.ComposeContent$lambda$0(snapshotState4).getSelectedAccountType(), selectableAccountNameToNumber), supportLandingFragment, 0, 4, null);
            FragmentManager parentFragmentManager = supportLandingFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            supportLandingAccountSelectionBottomSheet.show(parentFragmentManager, "AccountSelectorBottomSheet");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(SupportLandingFragment supportLandingFragment, String accountType) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            supportLandingFragment.getDuxo().fetchAccounts$feature_pathfinder_core_pages_externalDebug(accountType);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportLandingViewState ComposeContent$lambda$0(SnapshotState4<SupportLandingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C254021(null), 1, null);
        collectDuxoState(Lifecycle.State.RESUMED, new C254032(null));
    }

    /* compiled from: SupportLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$1", m3645f = "SupportLandingFragment.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$1 */
    static final class C254021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C254021(Continuation<? super C254021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportLandingFragment.this.new C254021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(SupportLandingFragment.this.getDuxo().getEventFlow());
                final SupportLandingFragment supportLandingFragment = SupportLandingFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SupportLandingEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<SupportLandingEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<SupportLandingEvent> eventConsumerInvoke;
                        final SupportLandingFragment supportLandingFragment2 = supportLandingFragment;
                        if ((event.getData() instanceof SupportLandingEvent.SendInputError) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17562invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17562invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
                                    View viewRequireView = supportLandingFragment2.requireView();
                                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                                    companion.make(viewRequireView, C39352R.string.multi_account_triage_root_action_error, 0).setLeadingIcon(C20690R.drawable.ic_rds_triangle_alert_16dp).show();
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

    /* compiled from: SupportLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2", m3645f = "SupportLandingFragment.kt", m3646l = {125}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2 */
    static final class C254032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C254032(Continuation<? super C254032> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportLandingFragment.this.new C254032(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C254032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RhToolbar rhToolbar = SupportLandingFragment.this.getRhToolbar();
                if (rhToolbar != null) {
                    rhToolbar.setColorControlNormalOverride(ThemeAttributes.INSTANCE.getCOLOR_WHITE());
                }
                final StateFlow<SupportLandingViewState> stateFlow = SupportLandingFragment.this.getDuxo().getStateFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2", m3645f = "SupportLandingFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment$onViewCreated$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                String heading = ((SupportLandingViewState) obj).getHeading();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(heading, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
                final SupportLandingFragment supportLandingFragment = SupportLandingFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingFragment.onViewCreated.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        RhToolbar rhToolbar2 = supportLandingFragment.getRhToolbar();
                        if (rhToolbar2 != null) {
                            rhToolbar2.setTitle(str);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (this.savedTitleTextAppearance == null) {
            this.savedTitleTextAppearance = ScarletManager2.getAttribute(toolbar.getToolbar(), R$attr.titleTextAppearance);
        }
        ScarletManager2.overrideAttribute(toolbar, R.attr.backgroundTint, ResourceValue.INSTANCE.getEMPTY());
        Toolbar toolbar2 = toolbar.getToolbar();
        int i = R$attr.titleTextAppearance;
        ResourceReferences4.Companion companion = ResourceReferences4.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ScarletManager2.overrideAttribute(toolbar2, i, companion.from(resources, ResourceType.STYLE.INSTANCE, C39352R.style.SupportLanding_Toolbar));
        updateBackground(this.savedBackgroundColor);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireBaseActivity().overrideStatusBarStyle(false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
        resetToolbarState();
    }

    private final void resetToolbarState() {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setColorControlNormalOverride(new ThemedResourceReference(ResourceType.COLOR_STATE_LIST.INSTANCE, C20690R.attr.colorForeground1));
            ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, ThemeAttributes.INSTANCE.getCOLOR_BACKGROUND_1());
            ResourceReferences4<?> resourceReferences4 = this.savedTitleTextAppearance;
            if (resourceReferences4 != null) {
                ScarletManager2.overrideAttribute(rhToolbar.getToolbar(), R$attr.titleTextAppearance, resourceReferences4);
            }
            rhToolbar.setTitle((CharSequence) null);
        }
        this.savedTitleTextAppearance = null;
    }

    @Override // com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet.Callbacks
    public void onAccountSelected(String accountType, String subAccountNumber) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(subAccountNumber, "subAccountNumber");
        getDuxo().onSubAccountSelected$feature_pathfinder_core_pages_externalDebug(accountType, subAccountNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBackground(int color) {
        requireActivity().getWindow().setStatusBarColor(color);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setBackgroundTintList(ColorStateList.valueOf(color));
        }
        this.savedBackgroundColor = color;
    }

    /* compiled from: SupportLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/SupportLandingFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SupportLandingFragment, SupportLandingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SupportLandingFragmentKey supportLandingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, supportLandingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SupportLandingFragmentKey getArgs(SupportLandingFragment supportLandingFragment) {
            return (SupportLandingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, supportLandingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SupportLandingFragment newInstance(SupportLandingFragmentKey supportLandingFragmentKey) {
            return (SupportLandingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, supportLandingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SupportLandingFragment supportLandingFragment, SupportLandingFragmentKey supportLandingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, supportLandingFragment, supportLandingFragmentKey);
        }
    }
}
