package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.tabs.Scrollable;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.redesign.accounttab.AccountSelectorFragmentKey;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.scrollstate.AccountSelectorScrollable;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: AccountSelectorFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001;B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0010\u0010-\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0018\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u0002002\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0010\u00101\u001a\u00020&2\u0006\u0010,\u001a\u00020\u0015H\u0016J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u000eH\u0016J\r\u00104\u001a\u00020&H\u0017¢\u0006\u0002\u00105J\b\u00106\u001a\u00020&H\u0016J\b\u00107\u001a\u00020&H\u0016J\u0010\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR/\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;", "Lcom/robinhood/android/common/ui/tabs/Scrollable;", "Lcom/robinhood/shared/home/contracts/AccountSelectorTabLinkIntentHandler;", "<init>", "()V", "accountTabDuxo", "Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "getAccountTabDuxo", "()Lcom/robinhood/android/redesign/accounttab/duxo/AccountTabDuxo;", "accountTabDuxo$delegate", "Lkotlin/Lazy;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "scrollableStateCache", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "Lcom/robinhood/android/redesign/accounttab/scrollstate/AccountSelectorScrollable;", "<set-?>", "isInnerScrollActive", "setInnerScrollActive", "(Z)V", "isInnerScrollActive$delegate", "Landroidx/compose/runtime/MutableState;", "currentSelectedTabId", "getCurrentSelectedTabId", "()Ljava/lang/String;", "setCurrentSelectedTabId", "(Ljava/lang/String;)V", "currentSelectedTabId$delegate", "pagerScrollToPage", "Lkotlin/Function1;", "", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onLazyListStateCreated", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "id", "onLazyListStateDestroyed", "onVerticalListStateCreated", "scrollState", "Landroidx/compose/foundation/ScrollState;", "onVerticalListStateDestroyed", "onInnerElementScrollStateChanged", "scrolling", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDestroyView", "scrollToTop", "handleDeeplinkAccountTabSwitch", "tabIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "Companion", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class AccountSelectorFragment extends GenericComposeFragment implements AccountTabScrollInteractions, Scrollable, AccountSelectorTabLinkIntentHandler {
    private CoroutineScope coroutineScope;
    private Function1<? super Integer, Unit> pagerScrollToPage;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: accountTabDuxo$delegate, reason: from kotlin metadata */
    private final Lazy accountTabDuxo = DuxosKt.duxo(this, AccountTabDuxo.class);
    private final boolean useDesignSystemToolbar = true;
    private final SnapshotStateMap<String, AccountSelectorScrollable> scrollableStateCache = SnapshotStateKt.mutableStateMapOf();

    /* renamed from: isInnerScrollActive$delegate, reason: from kotlin metadata */
    private final SnapshotState isInnerScrollActive = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: currentSelectedTabId$delegate, reason: from kotlin metadata */
    private final SnapshotState currentSelectedTabId = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(AccountSelectorFragment accountSelectorFragment, int i, Composer composer, int i2) {
        accountSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final AccountTabDuxo getAccountTabDuxo() {
        return (AccountTabDuxo) this.accountTabDuxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isInnerScrollActive() {
        return ((Boolean) this.isInnerScrollActive.getValue()).booleanValue();
    }

    private final void setInnerScrollActive(boolean z) {
        this.isInnerScrollActive.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getCurrentSelectedTabId() {
        return (String) this.currentSelectedTabId.getValue();
    }

    private final void setCurrentSelectedTabId(String str) {
        this.currentSelectedTabId.setValue(str);
    }

    @Override // com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions
    public void onLazyListStateCreated(LazyListState lazyListState, String id) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(id, "id");
        Timber.INSTANCE.mo3350d("onLazyListStateCreated(" + id + ")", new Object[0]);
        this.scrollableStateCache.put(id, new AccountSelectorScrollable.LazyList(lazyListState));
    }

    @Override // com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions
    public void onLazyListStateDestroyed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Timber.INSTANCE.mo3350d("onLazyListStateDestroyed(" + id + ")", new Object[0]);
        this.scrollableStateCache.remove(id);
    }

    @Override // com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions
    public void onVerticalListStateCreated(ScrollState scrollState, String id) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(id, "id");
        Timber.INSTANCE.mo3350d("onVerticalListStateCreated(" + id + ")", new Object[0]);
        this.scrollableStateCache.put(id, new AccountSelectorScrollable.Column(scrollState));
    }

    @Override // com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions
    public void onVerticalListStateDestroyed(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Timber.INSTANCE.mo3350d("onVerticalListStateDestroyed(" + id + ")", new Object[0]);
        this.scrollableStateCache.remove(id);
    }

    @Override // com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions
    public void onInnerElementScrollStateChanged(boolean scrolling) {
        setInnerScrollActive(scrolling);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2084149592);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2084149592, i2, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment.ComposeContent (AccountSelectorFragment.kt:83)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            this.coroutineScope = coroutineScope;
            boolean zIsInnerScrollActive = isInnerScrollActive();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            AccountTabDuxo accountTabDuxo = getAccountTabDuxo();
            ImmutableMap immutableMap = extensions2.toImmutableMap(this.scrollableStateCache);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorFragment.ComposeContent$lambda$1$lambda$0(coroutineScope, this, ((Integer) obj).intValue(), (AccountTabInfo) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function2 function2 = (Function2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorFragment.ComposeContent$lambda$3$lambda$2(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorFragment.ComposeContent$lambda$5$lambda$4(this.f$0, (Function1) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            AccountSelectorComposableKt.AccountSelectorComposable(childFragmentManager, function2, immutableMap, null, zIsInnerScrollActive, accountTabDuxo, function1, (Function1) objRememberedValue4, composerStartRestartGroup, (AccountSelectorScrollable.$stable << 6) | (AccountTabDuxo.$stable << 15), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(CoroutineScope coroutineScope, AccountSelectorFragment accountSelectorFragment, int i, AccountTabInfo tabInfo) {
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountSelectorFragment2(accountSelectorFragment, tabInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(AccountSelectorFragment accountSelectorFragment, String str) {
        accountSelectorFragment.setCurrentSelectedTabId(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(AccountSelectorFragment accountSelectorFragment, Function1 func) {
        Intrinsics.checkNotNullParameter(func, "func");
        accountSelectorFragment.pagerScrollToPage = func;
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.pagerScrollToPage = null;
        this.coroutineScope = null;
    }

    @Override // com.robinhood.android.common.p088ui.tabs.Scrollable
    public void scrollToTop() {
        String currentSelectedTabId = getCurrentSelectedTabId();
        AccountSelectorScrollable accountSelectorScrollable = currentSelectedTabId != null ? this.scrollableStateCache.get(currentSelectedTabId) : null;
        if (accountSelectorScrollable != null && accountSelectorScrollable.isAtTop()) {
            Function1<? super Integer, Unit> function1 = this.pagerScrollToPage;
            if (function1 != null) {
                function1.invoke(0);
                return;
            }
            return;
        }
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C264381(accountSelectorScrollable, null), 3, null);
        }
    }

    /* compiled from: AccountSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$scrollToTop$1", m3645f = "AccountSelectorFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorFragment$scrollToTop$1 */
    static final class C264381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccountSelectorScrollable $currentScrollableState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C264381(AccountSelectorScrollable accountSelectorScrollable, Continuation<? super C264381> continuation) {
            super(2, continuation);
            this.$currentScrollableState = accountSelectorScrollable;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C264381(this.$currentScrollableState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountSelectorScrollable accountSelectorScrollable = this.$currentScrollableState;
                if (accountSelectorScrollable != null) {
                    this.label = 1;
                    if (accountSelectorScrollable.animateToTop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    @Override // com.robinhood.shared.home.contracts.AccountSelectorTabLinkIntentHandler
    public void handleDeeplinkAccountTabSwitch(TabLinkIntentKey tabIntentKey) {
        Intrinsics.checkNotNullParameter(tabIntentKey, "tabIntentKey");
        Timber.INSTANCE.tag("AccountTabSwitcher").mo3350d("Request to switch tab: " + tabIntentKey, new Object[0]);
        getAccountTabDuxo().enqueueSwitchTabDeeplinkRequest(tabIntentKey);
    }

    /* compiled from: AccountSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/redesign/feature/accounttab/AccountSelectorFragment;", "Lcom/robinhood/android/redesign/accounttab/AccountSelectorFragmentKey;", "<init>", "()V", "feature-account-selector_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AccountSelectorFragment, AccountSelectorFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountSelectorFragmentKey getArgs(AccountSelectorFragment accountSelectorFragment) {
            return (AccountSelectorFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, accountSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountSelectorFragment newInstance(AccountSelectorFragmentKey accountSelectorFragmentKey) {
            return (AccountSelectorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, accountSelectorFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountSelectorFragment accountSelectorFragment, AccountSelectorFragmentKey accountSelectorFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, accountSelectorFragment, accountSelectorFragmentKey);
        }
    }
}
