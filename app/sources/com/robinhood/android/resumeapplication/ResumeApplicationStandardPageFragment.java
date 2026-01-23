package com.robinhood.android.resumeapplication;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.resumeapplication.experiments.ResurrectionDismissOnDeeplinkExp;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.noties.markwon.Markwon;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ResumeApplicationStandardPageFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\r\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010 R\u001e\u0010\u0006\u001a\u00020\u00078\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationStandardPageFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/StandardPageFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "handle", "", "action", "checkExperimentAndDismiss", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ResumeApplicationStandardPageFragment extends StandardPageFragment<GenericAction> implements AutoLoggableFragment {
    public ExperimentsStore experimentStore;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment, int i, Composer composer, int i2) {
        resumeApplicationStandardPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final ExperimentsStore getExperimentStore() {
        ExperimentsStore experimentsStore = this.experimentStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentStore");
        return null;
    }

    public final void setExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentStore = experimentsStore;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String logging_screen_identifier = ((ResumeApplicationStandardPageKey) INSTANCE.getArgs((Fragment) this)).getContent().getLogging_screen_identifier();
        if (logging_screen_identifier == null) {
            logging_screen_identifier = "resume_application_sdui";
        }
        return new Screen(Screen.Name.RESUME_APPLICATION_V2_TAKEOVER, null, logging_screen_identifier, null, 10, null);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment
    public StandardPageTemplate<GenericAction> getContent() {
        return ((ResumeApplicationStandardPageKey) INSTANCE.getArgs((Fragment) this)).getContent();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            boolean zHandleDeeplink = ActionHandlingFragment2.handleDeeplink(this, ((GenericAction.Deeplink) action).getValue2(), Boolean.FALSE);
            if (zHandleDeeplink) {
                checkExperimentAndDismiss();
            }
            return zHandleDeeplink;
        }
        if (action instanceof GenericAction.Dismiss) {
            requireActivity().getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        if (action instanceof GenericAction.InfoAlert) {
            return ActionHandlingFragment.handleAlert$default(this, ((GenericAction.InfoAlert) action).getValue2(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: ResumeApplicationStandardPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$checkExperimentAndDismiss$1", m3645f = "ResumeApplicationStandardPageFragment.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$checkExperimentAndDismiss$1 */
    static final class C269451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C269451(Continuation<? super C269451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ResumeApplicationStandardPageFragment.this.new C269451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCoStreamVariant$default = ExperimentsProvider.DefaultImpls.coStreamVariant$default(ResumeApplicationStandardPageFragment.this.getExperimentStore(), ResurrectionDismissOnDeeplinkExp.INSTANCE, SimpleVariant.CONTROL, false, 4, null);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(flowCoStreamVariant$default, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((SimpleVariant) obj) == SimpleVariant.MEMBER) {
                    ResumeApplicationStandardPageFragment.this.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    private final void checkExperimentAndDismiss() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C269451(null), 3, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        boolean zIsDay;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1066571986);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1066571986, i2, -1, "com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment.ComposeContent (ResumeApplicationStandardPageFragment.kt:87)");
            }
            PageThemeOverride theme_override = ((ResumeApplicationStandardPageKey) INSTANCE.getArgs((Fragment) this)).getContent().getTheme_override();
            if (theme_override == null) {
                zIsDay = DayNightChanges.isDay(getScarletManager());
            } else {
                zIsDay = theme_override == PageThemeOverride.LIGHT;
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(zIsDay), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(415698550, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment.ComposeContent.1
                public final void invoke(Composer composer2, int i3) {
                    ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment;
                    Arrangement.Vertical top;
                    ImmutableList3 immutableList3PersistentListOf;
                    Composer composer3 = composer2;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(415698550, i3, -1, "com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment.ComposeContent.<anonymous> (ResumeApplicationStandardPageFragment.kt:95)");
                    }
                    final Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(companion), 0.0f, 1, null);
                    ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment2 = ResumeApplicationStandardPageFragment.this;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer3.startReplaceGroup(365493378);
                    if (((ResumeApplicationStandardPageKey) ResumeApplicationStandardPageFragment.INSTANCE.getArgs((Fragment) resumeApplicationStandardPageFragment2)).getContent().getHide_back_button()) {
                        resumeApplicationStandardPageFragment = resumeApplicationStandardPageFragment2;
                    } else {
                        ResumeApplicationStandardPageFragment2 resumeApplicationStandardPageFragment22 = ResumeApplicationStandardPageFragment2.INSTANCE;
                        resumeApplicationStandardPageFragment = resumeApplicationStandardPageFragment2;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(resumeApplicationStandardPageFragment22.m2420x96a35316(), companion, resumeApplicationStandardPageFragment22.m2421xc5361083(), null, null, false, false, null, null, 0L, null, composer2, 1573302, 0, 1976);
                        composer3 = composer2;
                    }
                    composer3.endReplaceGroup();
                    final StandardPageTemplate<GenericAction> content = resumeApplicationStandardPageFragment.getContent();
                    composer3.startReplaceGroup(5004770);
                    final ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment3 = resumeApplicationStandardPageFragment;
                    boolean zChangedInstance = composer3.changedInstance(resumeApplicationStandardPageFragment3);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$ComposeContent$1$1$1$1
                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(GenericAction it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return resumeApplicationStandardPageFragment3.mo15941handle(it);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-962331744);
                    PageThemeOverride theme_override2 = content.getTheme_override();
                    if (theme_override2 != null) {
                        composer3.startReplaceGroup(82012030);
                        BentoTheme2.BentoTheme(Boolean.valueOf(theme_override2 == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$ComposeContent$1$invoke$lambda$1$$inlined$SduiStandardPage$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: SduiStandardPage.kt */
                            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$ComposeContent$1$invoke$lambda$1$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ long $backgroundedColor;
                                final /* synthetic */ SystemUiController $systemUiController;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                                    super(2, continuation);
                                    this.$systemUiController = systemUiController;
                                    this.$backgroundedColor = j;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(Composer composer4, int i4) {
                                Arrangement.Vertical top3;
                                ImmutableList3 immutableList3PersistentListOf2;
                                if ((i4 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(873647597, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                                }
                                StandardPageTemplate standardPageTemplate = content;
                                SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                                Modifier modifier = companion;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i5 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU(), null, 2, null);
                                composer4.startReplaceGroup(-430325605);
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top4 = arrangement2.getTop();
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top4, companion4.getStart(), composer4, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default2);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                if (standardPageTemplate instanceof CenterAlignedListPage) {
                                    top3 = arrangement2.getCenter();
                                } else {
                                    if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    top3 = arrangement2.getTop();
                                }
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion6, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top3, companion4.getCenterHorizontally(), composer4, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor3);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                                composer4.startReplaceGroup(-1772220517);
                                HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                SduiColumns.SduiColumn(persistentList, GenericAction.class, companion6, null, sduiActionHandler2, horizontalPadding, arrangement2.getTop(), companion4.getStart(), true, composer4, 100663296, 0);
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                List footer = standardPageTemplate.getFooter();
                                if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                                    immutableList3PersistentListOf2 = extensions2.persistentListOf();
                                }
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer4, i5).m21590getDefaultD9Ej5fM(), 1, null);
                                composer4.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(immutableList3PersistentListOf2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement2.getTop(), companion4.getStart(), true, composer4, 100666368, 0);
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                composer4.endReplaceGroup();
                                SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer4, 0, 1);
                                long jM21371getBg0d7_KjU = bentoTheme.getColors(composer4, i5).m21371getBg0d7_KjU();
                                Unit unit = Unit.INSTANCE;
                                composer4.startReplaceGroup(-1633490746);
                                boolean zChanged = composer4.changed(systemUiControllerRememberSystemUiController) | composer4.changed(jM21371getBg0d7_KjU);
                                Object objRememberedValue2 = composer4.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                                    composer4.updateRememberedValue(objRememberedValue2);
                                }
                                composer4.endReplaceGroup();
                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer3.endReplaceGroup();
                    } else {
                        Composer composer4 = composer3;
                        composer4.startReplaceGroup(82611105);
                        composer4.startReplaceGroup(-430325605);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        if (content instanceof CenterAlignedListPage) {
                            top = arrangement.getCenter();
                        } else {
                            if (!(content instanceof TopAlignedListPage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top = arrangement.getTop();
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top, companion2.getCenterHorizontally(), composer4, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor3);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        ImmutableList3 persistentList = extensions2.toPersistentList(content.getBody());
                        composer4.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, companion, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        Iterable footer = content.getFooter();
                        if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                            immutableList3PersistentListOf = extensions2.persistentListOf();
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100666368, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.resumeapplication.ResumeApplicationStandardPageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResumeApplicationStandardPageFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ResumeApplicationStandardPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResumeApplicationStandardPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationStandardPageFragment;", "Lcom/robinhood/android/resumeapplication/ResumeApplicationStandardPageKey;", "<init>", "()V", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ResumeApplicationStandardPageFragment, ResumeApplicationStandardPageKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ResumeApplicationStandardPageKey resumeApplicationStandardPageKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, resumeApplicationStandardPageKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ResumeApplicationStandardPageKey getArgs(ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment) {
            return (ResumeApplicationStandardPageKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, resumeApplicationStandardPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ResumeApplicationStandardPageFragment newInstance(ResumeApplicationStandardPageKey resumeApplicationStandardPageKey) {
            return (ResumeApplicationStandardPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, resumeApplicationStandardPageKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ResumeApplicationStandardPageFragment resumeApplicationStandardPageFragment, ResumeApplicationStandardPageKey resumeApplicationStandardPageKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, resumeApplicationStandardPageFragment, resumeApplicationStandardPageKey);
        }
    }
}
