package com.robinhood.android.acatsin.accountcontents;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsContract;
import com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsViewState;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.Eithers;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: AcatsInAccountContentsFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "LoadingComposable", "Preview", "Companion", "feature-acats-in_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInAccountContentsFragment extends AcatsFlowStepFragment2 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInAccountContentsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9(AcatsInAccountContentsFragment acatsInAccountContentsFragment, int i, Composer composer, int i2) {
        acatsInAccountContentsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingComposable$lambda$10(AcatsInAccountContentsFragment acatsInAccountContentsFragment, int i, Composer composer, int i2) {
        acatsInAccountContentsFragment.LoadingComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$11(AcatsInAccountContentsFragment acatsInAccountContentsFragment, int i, Composer composer, int i2) {
        acatsInAccountContentsFragment.Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInAccountContentsFragment() {
        super(null, AcatsFlowStep.ACCOUNT_CONTENTS, 1, null);
        this.duxo = DuxosKt.duxo(this, AcatsInAccountContentsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInAccountContentsContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInAccountContentsContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    /* compiled from: AcatsInAccountContentsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsFragment;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInAccountContentsFragment, AcatsInAccountContentsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInAccountContentsContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInAccountContentsContract.Key getArgs(AcatsInAccountContentsFragment acatsInAccountContentsFragment) {
            return (AcatsInAccountContentsContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInAccountContentsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInAccountContentsFragment newInstance(AcatsInAccountContentsContract.Key key) {
            return (AcatsInAccountContentsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInAccountContentsFragment acatsInAccountContentsFragment, AcatsInAccountContentsContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInAccountContentsFragment, key);
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.ACATS_IN_TRANSFER_CONTENTS;
        Companion companion = INSTANCE;
        return new Screen(name, ((AcatsInAccountContentsContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getSource(), Eithers.getLoggingIdentifier(((AcatsInAccountContentsContract.Key) companion.getArgs((Fragment) this)).getBrokerageOrDtcNumber()), null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInAccountContentsContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    private final AcatsInAccountContentsDuxo getDuxo() {
        return (AcatsInAccountContentsDuxo) this.duxo.getValue();
    }

    private final AcatsInAccountContentsContract.Callbacks getCallbacks() {
        return (AcatsInAccountContentsContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-512587349);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-512587349, i2, -1, "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment.ComposeContent (AcatsInAccountContentsFragment.kt:42)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            AcatsInAccountContentsViewState acatsInAccountContentsViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            if (acatsInAccountContentsViewStateComposeContent$lambda$0 instanceof AcatsInAccountContentsViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(-1880772828);
                LoadingComposable(composerStartRestartGroup, i2 & 14);
                composerStartRestartGroup.endReplaceGroup();
            } else if (acatsInAccountContentsViewStateComposeContent$lambda$0 instanceof AcatsInAccountContentsViewState.Error) {
                composerStartRestartGroup.startReplaceGroup(-1880663305);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAccountContentsFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(acatsInAccountContentsViewStateComposeContent$lambda$0 instanceof AcatsInAccountContentsViewState.Ready)) {
                    composerStartRestartGroup.startReplaceGroup(1324801864);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1880488744);
                AcatsInAccountContentsViewState acatsInAccountContentsViewStateComposeContent$lambda$02 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                Intrinsics.checkNotNull(acatsInAccountContentsViewStateComposeContent$lambda$02, "null cannot be cast to non-null type com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsViewState.Ready");
                final AcatsInAccountContentsViewState.Ready ready = (AcatsInAccountContentsViewState.Ready) acatsInAccountContentsViewStateComposeContent$lambda$02;
                AcatsInAccountContentsDuxo duxo = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new AcatsInAccountContentsFragment2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                AcatsInAccountContentsDuxo duxo2 = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo2);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new AcatsInAccountContentsFragment3(duxo2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function1 function12 = (Function1) ((KFunction) objRememberedValue3);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(ready);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAccountContentsFragment.ComposeContent$lambda$6$lambda$5(this.f$0, ready);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function0 = (Function0) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(ready);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsInAccountContentsFragment.ComposeContent$lambda$8$lambda$7(this.f$0, ready);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                AcatsInAccountContentsComposable.AcatsInAccountContentsComposable(ready, function1, function12, function0, (Function0) objRememberedValue5, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAccountContentsFragment.ComposeContent$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(AcatsInAccountContentsFragment acatsInAccountContentsFragment) {
        acatsInAccountContentsFragment.getDuxo().loadContents();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(AcatsInAccountContentsFragment acatsInAccountContentsFragment, AcatsInAccountContentsViewState.Ready ready) {
        acatsInAccountContentsFragment.getCallbacks().onAccountContentsDeclared(ready.getSelectedItems(), ready.getSupportedContentTypes(), ready.getBuildPartialBannerContentfulId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8$lambda$7(AcatsInAccountContentsFragment acatsInAccountContentsFragment, AcatsInAccountContentsViewState.Ready ready) {
        acatsInAccountContentsFragment.getCallbacks().onAccountContentsUnsure(ready.getUnsupportedContentItems());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void LoadingComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-533672847);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-533672847, i, -1, "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment.LoadingComposable (AcatsInAccountContentsFragment.kt:74)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, AcatsInAccountContentsFragment4.INSTANCE.m10692getLambda$116282879$feature_acats_in_externalDebug(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAccountContentsFragment.LoadingComposable$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final AcatsInAccountContentsViewState ComposeContent$lambda$0(SnapshotState4<? extends AcatsInAccountContentsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private final void Preview(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-172151856);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-172151856, i2, -1, "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment.Preview (AcatsInAccountContentsFragment.kt:88)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1711463816, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment.Preview.1
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
                        ComposerKt.traceEventStart(1711463816, i3, -1, "com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment.Preview.<anonymous> (AcatsInAccountContentsFragment.kt:90)");
                    }
                    AcatsInAccountContentsFragment.this.LoadingComposable(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.accountcontents.AcatsInAccountContentsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAccountContentsFragment.Preview$lambda$11(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
