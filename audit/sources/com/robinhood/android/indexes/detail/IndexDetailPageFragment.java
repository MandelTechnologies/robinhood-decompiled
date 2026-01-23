package com.robinhood.android.indexes.detail;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.indexes.detail.IndexDetailPageFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Security;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: IndexDetailPageFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u0003456B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010)\u001a\u00020 H\u0016J\r\u0010*\u001a\u00020 H\u0017¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.J\u0018\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020 H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010#\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0016\u0010%\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "hasBottomBar", "getHasBottomBar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "duxo", "Lcom/robinhood/android/indexes/detail/IndexDetailPageDuxo;", "getDuxo", "()Lcom/robinhood/android/indexes/detail/IndexDetailPageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onTradeBarHeightUpdated", "newHeight", "", "addToWatchlist", "isContractInUserLists", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Lcom/robinhood/models/db/Security;", "ensureCuratedListQuickAddFragment", "Args", "Callbacks", "Companion", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndexDetailPageFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IndexDetailPageFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;
    private final boolean hasBottomBar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, IndexDetailPageDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final boolean childFragmentsShouldNotConfigureToolbar = true;

    /* compiled from: IndexDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Callbacks;", "", "onPageDirectionUpdated", "", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPageDirectionUpdated(Direction pageDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(IndexDetailPageFragment indexDetailPageFragment, int i, Composer composer, int i2) {
        indexDetailPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return IndexDetailPageLoggings.getIndexDetailPageEventScreen(((Args) INSTANCE.getArgs((Fragment) this)).getIndexId());
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        Companion companion = INSTANCE;
        return IndexDetailPageLoggings.getIndexDetailPageEventContext(((Args) companion.getArgs((Fragment) this)).getIndexId(), ((Args) companion.getArgs((Fragment) this)).getSource().getEntryPointIdentifier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndexDetailPageDuxo getDuxo() {
        return (IndexDetailPageDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    private final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("quickAddFragment");
        if (fragmentFindFragmentByTag instanceof CuratedListQuickAddFragment) {
            return (CuratedListQuickAddFragment) fragmentFindFragmentByTag;
        }
        return null;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ensureCuratedListQuickAddFragment();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2005496994);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005496994, i2, -1, "com.robinhood.android.indexes.detail.IndexDetailPageFragment.ComposeContent (IndexDetailPageFragment.kt:53)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1845384435, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageFragment.ComposeContent.1

                /* compiled from: IndexDetailPageFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.indexes.detail.IndexDetailPageFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ IndexDetailPageFragment this$0;

                    AnonymousClass1(IndexDetailPageFragment indexDetailPageFragment) {
                        this.this$0 = indexDetailPageFragment;
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
                            ComposerKt.traceEventStart(1088113435, i, -1, "com.robinhood.android.indexes.detail.IndexDetailPageFragment.ComposeContent.<anonymous>.<anonymous> (IndexDetailPageFragment.kt:61)");
                        }
                        IndexDetailPageDuxo duxo = this.this$0.getDuxo();
                        UUID indexId = ((Args) IndexDetailPageFragment.INSTANCE.getArgs((Fragment) this.this$0)).getIndexId();
                        IndexDetailPageFragment indexDetailPageFragment = this.this$0;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(indexDetailPageFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new IndexDetailPageFragment2(indexDetailPageFragment);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Function2 function2 = (Function2) ((KFunction) objRememberedValue);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final IndexDetailPageFragment indexDetailPageFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IndexDetailPageFragment.C188111.AnonymousClass1.invoke$lambda$2$lambda$1(indexDetailPageFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final IndexDetailPageFragment indexDetailPageFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return IndexDetailPageFragment.C188111.AnonymousClass1.invoke$lambda$4$lambda$3(indexDetailPageFragment3, (Direction) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        IndexDetailPageComposable.IndexDetailPageComposable(duxo, indexId, function2, function0, (Function1) objRememberedValue3, null, composer, 0, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(IndexDetailPageFragment indexDetailPageFragment) {
                        indexDetailPageFragment.requireBaseActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$4$lambda$3(IndexDetailPageFragment indexDetailPageFragment, Direction direction) {
                        Intrinsics.checkNotNullParameter(direction, "direction");
                        indexDetailPageFragment.getDuxo().onPageDirectionUpdated(direction);
                        indexDetailPageFragment.getCallbacks().onPageDirectionUpdated(direction);
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-1845384435, i3, -1, "com.robinhood.android.indexes.detail.IndexDetailPageFragment.ComposeContent.<anonymous> (IndexDetailPageFragment.kt:60)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(IndexDetailPageFragment.this.getScarletManager()), null, ComposableLambda3.rememberComposableLambda(1088113435, true, new AnonymousClass1(IndexDetailPageFragment.this), composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.indexes.detail.IndexDetailPageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndexDetailPageFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void onTradeBarHeightUpdated(int newHeight) {
        getDuxo().onTradeBarHeightUpdated(newHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addToWatchlist(boolean isContractInUserLists, Security index) {
        CuratedListQuickAddFragment curatedListQuickAddFragment = getCuratedListQuickAddFragment();
        if (curatedListQuickAddFragment != null) {
            curatedListQuickAddFragment.addSelectedItemToCuratedList(isContractInUserLists, index);
        }
    }

    private final void ensureCuratedListQuickAddFragment() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (getCuratedListQuickAddFragment() != null || childFragmentManager.isStateSaved()) {
            return;
        }
        childFragmentManager.beginTransaction().add(CuratedListQuickAddFragment.Companion.newInstance$default(CuratedListQuickAddFragment.INSTANCE, false, IndexDetailPageLoggings.getIndexDetailPageEventScreen(((Args) INSTANCE.getArgs((Fragment) this)).getIndexId()), 1, null), "quickAddFragment").commit();
    }

    /* compiled from: IndexDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "Landroid/os/Parcelable;", "indexId", "Ljava/util/UUID;", "source", "Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;)V", "getIndexId", "()Ljava/util/UUID;", "getSource", "()Lcom/robinhood/android/indexes/contracts/IndexDetailPageSource;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID indexId;
        private final IndexDetailPageFragmentKey2 source;

        /* compiled from: IndexDetailPageFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (IndexDetailPageFragmentKey2) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, IndexDetailPageFragmentKey2 indexDetailPageFragmentKey2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.indexId;
            }
            if ((i & 2) != 0) {
                indexDetailPageFragmentKey2 = args.source;
            }
            return args.copy(uuid, indexDetailPageFragmentKey2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getIndexId() {
            return this.indexId;
        }

        /* renamed from: component2, reason: from getter */
        public final IndexDetailPageFragmentKey2 getSource() {
            return this.source;
        }

        public final Args copy(UUID indexId, IndexDetailPageFragmentKey2 source) {
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            Intrinsics.checkNotNullParameter(source, "source");
            return new Args(indexId, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.indexId, args.indexId) && Intrinsics.areEqual(this.source, args.source);
        }

        public int hashCode() {
            return (this.indexId.hashCode() * 31) + this.source.hashCode();
        }

        public String toString() {
            return "Args(indexId=" + this.indexId + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.indexId);
            dest.writeParcelable(this.source, flags);
        }

        public Args(UUID indexId, IndexDetailPageFragmentKey2 source) {
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            Intrinsics.checkNotNullParameter(source, "source");
            this.indexId = indexId;
            this.source = source;
        }

        public final UUID getIndexId() {
            return this.indexId;
        }

        public final IndexDetailPageFragmentKey2 getSource() {
            return this.source;
        }
    }

    /* compiled from: IndexDetailPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment;", "Lcom/robinhood/android/indexes/detail/IndexDetailPageFragment$Args;", "<init>", "()V", "QUICK_ADD_TAG", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<IndexDetailPageFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(IndexDetailPageFragment indexDetailPageFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, indexDetailPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndexDetailPageFragment newInstance(Args args) {
            return (IndexDetailPageFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndexDetailPageFragment indexDetailPageFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, indexDetailPageFragment, args);
        }
    }
}
