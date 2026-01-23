package com.robinhood.android.gold.sage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.gold.contracts.GoldSageRateFragmentKey;
import com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks;
import com.robinhood.android.gold.sage.GoldSageRateFragment;
import com.robinhood.android.gold.sage.GoldSageRateViewState;
import com.robinhood.android.navigation.FragmentResolverCompanion;
import com.robinhood.android.newsfeed.view.util.LoggedCustomTabs;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.extensions.HttpUrl2;
import gold.proto.p464v1.GetSageRateResponse;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldSageRateFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001eJ\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\"\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001c\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010%H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/gold/lib/sage/GoldSageWebViewCallbacks;", "<init>", "()V", "loggedCustomTabs", "Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "getLoggedCustomTabs", "()Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;", "setLoggedCustomTabs", "(Lcom/robinhood/android/newsfeed/view/util/LoggedCustomTabs;)V", "duxo", "Lcom/robinhood/android/gold/sage/GoldSageRateDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/sage/GoldSageRateDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onAttach", "", "context", "Landroid/content/Context;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "openUrlInApp", "uri", "Landroid/net/Uri;", "openUrlExternally", "onSageExit", "redirectUrl", "", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", "Companion", "feature-gold-sage_externalRelease", "viewState", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldSageRateFragment extends GenericComposeFragment implements AutoLoggableFragment, GoldSageWebViewCallbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, GoldSageRateDuxo.class);
    private final Screen eventScreen = new Screen(Screen.Name.GOLD_SAGE_APPLICATION, null, null, null, 14, null);
    public LoggedCustomTabs loggedCustomTabs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(GoldSageRateFragment goldSageRateFragment, int i, Composer composer, int i2) {
        goldSageRateFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
    public void onPageFinished(WebView view, String url) {
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.gold.lib.sage.GoldSageWebViewCallbacks
    public void onSageExit(String redirectUrl) {
        if (redirectUrl != null) {
            openUrlExternally(Uri.parse(redirectUrl));
        }
        requireActivity().finish();
    }

    public final LoggedCustomTabs getLoggedCustomTabs() {
        LoggedCustomTabs loggedCustomTabs = this.loggedCustomTabs;
        if (loggedCustomTabs != null) {
            return loggedCustomTabs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loggedCustomTabs");
        return null;
    }

    public final void setLoggedCustomTabs(LoggedCustomTabs loggedCustomTabs) {
        Intrinsics.checkNotNullParameter(loggedCustomTabs, "<set-?>");
        this.loggedCustomTabs = loggedCustomTabs;
    }

    private final GoldSageRateDuxo getDuxo() {
        return (GoldSageRateDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), DayNightOverlay.DAY, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().showCloseIcon();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975165795);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975165795, i2, -1, "com.robinhood.android.gold.sage.GoldSageRateFragment.ComposeContent (GoldSageRateFragment.kt:48)");
            }
            final GoldSageRateViewState goldSageRateViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (Intrinsics.areEqual(goldSageRateViewStateComposeContent$lambda$0, GoldSageRateViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(-831451172);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-561276779, true, new C178851(), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(goldSageRateViewStateComposeContent$lambda$0 instanceof GoldSageRateViewState.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(-831452449);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-831423815);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1950838319, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment.ComposeContent.2
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
                            ComposerKt.traceEventStart(-1950838319, i3, -1, "com.robinhood.android.gold.sage.GoldSageRateFragment.ComposeContent.<anonymous> (GoldSageRateFragment.kt:75)");
                        }
                        GetSageRateResponse sageRateResponse = ((GoldSageRateViewState.Loaded) goldSageRateViewStateComposeContent$lambda$0).getSageRateResponse();
                        GoldSageRateFragment goldSageRateFragment = this;
                        String cta_text = sageRateResponse.getCta_text();
                        Object objRequireActivity = goldSageRateFragment.requireActivity();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(objRequireActivity);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new GoldSageRateFragment2(objRequireActivity);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        KFunction kFunction = (KFunction) objRememberedValue;
                        composer2.endReplaceGroup();
                        String url = sageRateResponse.getUrl();
                        ImmutableList3 persistentList = extensions2.toPersistentList(sageRateResponse.getAllowed_urls());
                        ImmutableList3 persistentList2 = extensions2.toPersistentList(sageRateResponse.getAllowed_urls_to_open_externally());
                        ImmutableList3 persistentList3 = extensions2.toPersistentList(sageRateResponse.getAllowed_urls_to_open_in_app());
                        Object objRequireActivity2 = goldSageRateFragment.requireActivity();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(objRequireActivity2);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new GoldSageRateFragment3(objRequireActivity2);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        KFunction kFunction2 = (KFunction) objRememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(goldSageRateFragment);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new GoldSageRateFragment4(goldSageRateFragment);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        KFunction kFunction3 = (KFunction) objRememberedValue3;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(goldSageRateFragment);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new GoldSageRateFragment5(goldSageRateFragment);
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        GoldSageRateComposable.GoldSageRateComposable(cta_text, (Function0) kFunction, goldSageRateFragment, url, persistentList, persistentList2, persistentList3, (Function1) kFunction3, (Function1) ((KFunction) objRememberedValue4), (Function0) kFunction2, null, composer2, 0, 0, 1024);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageRateFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldSageRateFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$1 */
    static final class C178851 implements Function2<Composer, Integer, Unit> {
        C178851() {
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
                ComposerKt.traceEventStart(-561276779, i, -1, "com.robinhood.android.gold.sage.GoldSageRateFragment.ComposeContent.<anonymous> (GoldSageRateFragment.kt:53)");
            }
            GetSageRateResponse sageRateResponse = GoldSageRateViewState.INSTANCE.getLoadingMock().getSageRateResponse();
            GoldSageRateFragment goldSageRateFragment = GoldSageRateFragment.this;
            String cta_text = sageRateResponse.getCta_text();
            String url = sageRateResponse.getUrl();
            ImmutableList3 persistentList = extensions2.toPersistentList(sageRateResponse.getAllowed_urls());
            ImmutableList3 persistentList2 = extensions2.toPersistentList(sageRateResponse.getAllowed_urls_to_open_externally());
            ImmutableList3 persistentList3 = extensions2.toPersistentList(sageRateResponse.getAllowed_urls_to_open_in_app());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageRateFragment.C178851.invoke$lambda$8$lambda$3$lambda$2((Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldSageRateFragment.C178851.invoke$lambda$8$lambda$5$lambda$4((Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function1 function12 = (Function1) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.gold.sage.GoldSageRateFragment$ComposeContent$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            GoldSageRateComposable.GoldSageRateComposable(cta_text, function0, goldSageRateFragment, url, persistentList, persistentList2, persistentList3, function1, function12, (Function0) objRememberedValue4, null, composer, 918552624, 0, 1024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$3$lambda$2(Uri uri) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(Uri uri) {
            return Unit.INSTANCE;
        }
    }

    private static final GoldSageRateViewState ComposeContent$lambda$0(SnapshotState4<? extends GoldSageRateViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrlInApp(Uri uri) {
        if (uri != null) {
            LoggedCustomTabs loggedCustomTabs = getLoggedCustomTabs();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            LoggedCustomTabs.viewUrl$default(loggedCustomTabs, contextRequireContext, HttpUrl2.toHttpUrl(uri), "GOLD_SAGE_RATE", null, null, null, null, null, null, null, null, 2040, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openUrlExternally(Uri uri) {
        startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    /* compiled from: GoldSageRateFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverCompanion;", "Lcom/robinhood/android/gold/sage/GoldSageRateFragment;", "Lcom/robinhood/android/gold/contracts/GoldSageRateFragmentKey;", "<init>", "()V", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverCompanion<GoldSageRateFragment, GoldSageRateFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(GoldSageRateFragmentKey goldSageRateFragmentKey) {
            return FragmentResolverCompanion.DefaultImpls.createFragment(this, goldSageRateFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((GoldSageRateFragment) fragment);
        }

        public Void getArgs(GoldSageRateFragment goldSageRateFragment) {
            return FragmentResolverCompanion.DefaultImpls.getArgs(this, goldSageRateFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldSageRateFragment newInstance() {
            return (GoldSageRateFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldSageRateFragment newInstance(Void r1) {
            return (GoldSageRateFragment) FragmentResolverCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
