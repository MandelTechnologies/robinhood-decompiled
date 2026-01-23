package com.robinhood.android.investorprofile.p162ui.review;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewEvent;
import com.robinhood.android.investorprofile.p162ui.review.QuestionnaireReviewScreen4;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireReview;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: QuestionnaireReviewScreen.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u007f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0018\u00010\u0004j\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001au\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\n2\u001c\u0010\u001c\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u001d\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010 *\u0016\u0010\u0000\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0010\u0003\"\u0004\u0018\u00010\u00042\u0004\u0018\u00010\u0004¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002²\u0006\u0012\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u008a\u0084\u0002"}, m3636d2 = {"QuestionAnswers", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview$QuestionAnswer;", "RedirectUrl", "", "QuestionnaireReviewScreen", "", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "onQuestionSelected", "Lkotlin/Function2;", "", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$Supported;", "onConfirmSuccess", "Lkotlin/Function1;", "Lcom/robinhood/android/investorprofile/ui/review/RedirectUrl;", "onConfirmError", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewDuxo;", "(Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewDuxo;Landroidx/compose/runtime/Composer;II)V", "QuestionnaireReview", "reviewPage", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;", "isCtaLoading", "", "onClickConfirm", "Lcom/robinhood/android/investorprofile/ui/review/QuestionAnswers;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireReview;ZLcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-investor-profile_externalDebug", "viewState", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireReviewScreen4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$7(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireReview$lambda$6(UiQuestionnaireReview uiQuestionnaireReview, boolean z, QuestionnaireLoggingInfo questionnaireLoggingInfo, Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuestionnaireReview(uiQuestionnaireReview, z, questionnaireLoggingInfo, function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireReviewScreen$lambda$5(QuestionnaireLoggingInfo questionnaireLoggingInfo, Function2 function2, Function1 function1, Function1 function12, Modifier modifier, QuestionnaireReviewDuxo questionnaireReviewDuxo, int i, int i2, Composer composer, int i3) {
        QuestionnaireReviewScreen(questionnaireLoggingInfo, function2, function1, function12, modifier, questionnaireReviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuestionnaireReviewScreen(final QuestionnaireLoggingInfo loggingInfo, final Function2<? super UiQuestionnaireReview.QuestionAnswer, ? super Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> onQuestionSelected, final Function1<? super String, Unit> onConfirmSuccess, final Function1<? super Throwable, Unit> onConfirmError, Modifier modifier, QuestionnaireReviewDuxo questionnaireReviewDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        QuestionnaireReviewDuxo questionnaireReviewDuxo2;
        Composer composer2;
        Modifier modifier3;
        int i4;
        CreationExtras defaultViewModelCreationExtras;
        QuestionnaireReviewDuxo questionnaireReviewDuxo3;
        final Event<QuestionnaireReviewEvent> eventQuestionnaireReviewScreen$lambda$1;
        final Event<QuestionnaireReviewEvent> eventQuestionnaireReviewScreen$lambda$12;
        UiQuestionnaireReview reviewPage;
        QuestionnaireReviewDuxo questionnaireReviewDuxo4;
        Modifier modifier4;
        Composer composer3;
        final Modifier modifier5;
        final QuestionnaireReviewDuxo questionnaireReviewDuxo5;
        EventConsumer<QuestionnaireReviewEvent> eventConsumerInvoke;
        EventConsumer<QuestionnaireReviewEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        Intrinsics.checkNotNullParameter(onQuestionSelected, "onQuestionSelected");
        Intrinsics.checkNotNullParameter(onConfirmSuccess, "onConfirmSuccess");
        Intrinsics.checkNotNullParameter(onConfirmError, "onConfirmError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044799401);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loggingInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuestionSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmSuccess) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmError) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    questionnaireReviewDuxo2 = questionnaireReviewDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(questionnaireReviewDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    questionnaireReviewDuxo2 = questionnaireReviewDuxo;
                }
                i3 |= i6;
            } else {
                questionnaireReviewDuxo2 = questionnaireReviewDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i4 = i3;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(QuestionnaireReviewDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                        composer2.endReplaceGroup();
                        Modifier modifier7 = modifier6;
                        i4 = i3 & (-458753);
                        questionnaireReviewDuxo3 = (QuestionnaireReviewDuxo) baseDuxo;
                        modifier3 = modifier7;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1044799401, i4, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreen (QuestionnaireReviewScreen.kt:48)");
                        }
                        Composer composer4 = composer2;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(questionnaireReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(questionnaireReviewDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                        eventQuestionnaireReviewScreen$lambda$1 = QuestionnaireReviewScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventQuestionnaireReviewScreen$lambda$1 != null && (eventQuestionnaireReviewScreen$lambda$1.getData() instanceof QuestionnaireReviewEvent.Confirmed) && (eventConsumerInvoke2 = eventQuestionnaireReviewScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventQuestionnaireReviewScreen$lambda$1, new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15710invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15710invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onConfirmSuccess.invoke(((QuestionnaireReviewEvent.Confirmed) eventQuestionnaireReviewScreen$lambda$1.getData()).getRedirectUrl());
                                }
                            });
                        }
                        eventQuestionnaireReviewScreen$lambda$12 = QuestionnaireReviewScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventQuestionnaireReviewScreen$lambda$12 != null && (eventQuestionnaireReviewScreen$lambda$12.getData() instanceof QuestionnaireReviewEvent.Error) && (eventConsumerInvoke = eventQuestionnaireReviewScreen$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventQuestionnaireReviewScreen$lambda$12, new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m15711invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m15711invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onConfirmError.invoke(((QuestionnaireReviewEvent.Error) eventQuestionnaireReviewScreen$lambda$12.getData()).getCause());
                                }
                            });
                        }
                        reviewPage = QuestionnaireReviewScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getReviewPage();
                        if (reviewPage == null) {
                            composer2.startReplaceGroup(9834042);
                            boolean zIsCtaLoading = QuestionnaireReviewScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).isCtaLoading();
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer2.changedInstance(questionnaireReviewDuxo3);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new QuestionnaireReviewScreen8(questionnaireReviewDuxo3);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            Composer composer5 = composer2;
                            questionnaireReviewDuxo4 = questionnaireReviewDuxo3;
                            QuestionnaireReview(reviewPage, zIsCtaLoading, loggingInfo, onQuestionSelected, (Function1) ((KFunction) objRememberedValue2), modifier3, composer5, ((i4 << 6) & 8064) | ((i4 << 3) & 458752), 0);
                            modifier4 = modifier3;
                            composer5.endReplaceGroup();
                            composer3 = composer5;
                        } else {
                            questionnaireReviewDuxo4 = questionnaireReviewDuxo3;
                            modifier4 = modifier3;
                            composer2.startReplaceGroup(10138090);
                            Composer composer6 = composer2;
                            LoadingScreenComposablesKt.ListLoadingScreenComposable(modifier4, true, true, 0, composer6, ((i4 >> 12) & 14) | 432, 8);
                            composer3 = composer6;
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        questionnaireReviewDuxo5 = questionnaireReviewDuxo4;
                    } else {
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier6;
                        i4 = i3;
                    }
                }
                questionnaireReviewDuxo3 = questionnaireReviewDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer42 = composer2;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(questionnaireReviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(questionnaireReviewDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                eventQuestionnaireReviewScreen$lambda$1 = QuestionnaireReviewScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventQuestionnaireReviewScreen$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventQuestionnaireReviewScreen$lambda$1, new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15710invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15710invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onConfirmSuccess.invoke(((QuestionnaireReviewEvent.Confirmed) eventQuestionnaireReviewScreen$lambda$1.getData()).getRedirectUrl());
                        }
                    });
                }
                eventQuestionnaireReviewScreen$lambda$12 = QuestionnaireReviewScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventQuestionnaireReviewScreen$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventQuestionnaireReviewScreen$lambda$12, new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReviewScreen$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m15711invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m15711invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onConfirmError.invoke(((QuestionnaireReviewEvent.Error) eventQuestionnaireReviewScreen$lambda$12.getData()).getCause());
                        }
                    });
                }
                reviewPage = QuestionnaireReviewScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getReviewPage();
                if (reviewPage == null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier4;
                questionnaireReviewDuxo5 = questionnaireReviewDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                modifier5 = modifier2;
                questionnaireReviewDuxo5 = questionnaireReviewDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireReviewScreen4.QuestionnaireReviewScreen$lambda$5(loggingInfo, onQuestionSelected, onConfirmSuccess, onConfirmError, modifier5, questionnaireReviewDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final QuestionnaireReviewViewState QuestionnaireReviewScreen$lambda$0(SnapshotState4<QuestionnaireReviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<QuestionnaireReviewEvent> QuestionnaireReviewScreen$lambda$1(SnapshotState4<Event<QuestionnaireReviewEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuestionnaireReview(final UiQuestionnaireReview uiQuestionnaireReview, final boolean z, final QuestionnaireLoggingInfo questionnaireLoggingInfo, final Function2<? super UiQuestionnaireReview.QuestionAnswer, ? super Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> function2, final Function1<? super List<UiQuestionnaireReview.QuestionAnswer>, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        UiQuestionnaireReview uiQuestionnaireReview2;
        int i3;
        boolean z2;
        Function2<? super UiQuestionnaireReview.QuestionAnswer, ? super Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> function22;
        Function1<? super List<UiQuestionnaireReview.QuestionAnswer>, Unit> function12;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-671341994);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            uiQuestionnaireReview2 = uiQuestionnaireReview;
        } else {
            uiQuestionnaireReview2 = uiQuestionnaireReview;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(uiQuestionnaireReview2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(questionnaireLoggingInfo) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-671341994, i3, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReview (QuestionnaireReviewScreen.kt:86)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INVESTOR_PROFILE_REVIEW, null, null, null, 14, null), null, questionnaireLoggingInfo.toEventContext(uiQuestionnaireReview2.getRedFlagStatus()), null, null, 53, null), ComposableLambda3.rememberComposableLambda(2112144779, true, new C198601(modifier4, uiQuestionnaireReview2, z2, function22, function12), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireReviewScreen4.QuestionnaireReview$lambda$6(uiQuestionnaireReview, z, questionnaireLoggingInfo, function2, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.INVESTOR_PROFILE_REVIEW, null, null, null, 14, null), null, questionnaireLoggingInfo.toEventContext(uiQuestionnaireReview2.getRedFlagStatus()), null, null, 53, null), ComposableLambda3.rememberComposableLambda(2112144779, true, new C198601(modifier4, uiQuestionnaireReview2, z2, function22, function12), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: QuestionnaireReviewScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1 */
    static final class C198601 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $isCtaLoading;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<List<UiQuestionnaireReview.QuestionAnswer>, Unit> $onClickConfirm;
        final /* synthetic */ Function2<UiQuestionnaireReview.QuestionAnswer, Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> $onQuestionSelected;
        final /* synthetic */ UiQuestionnaireReview $reviewPage;

        /* JADX WARN: Multi-variable type inference failed */
        C198601(Modifier modifier, UiQuestionnaireReview uiQuestionnaireReview, boolean z, Function2<? super UiQuestionnaireReview.QuestionAnswer, ? super Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> function2, Function1<? super List<UiQuestionnaireReview.QuestionAnswer>, Unit> function1) {
            this.$modifier = modifier;
            this.$reviewPage = uiQuestionnaireReview;
            this.$isCtaLoading = z;
            this.$onQuestionSelected = function2;
            this.$onClickConfirm = function1;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2112144779, i, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReview.<anonymous> (QuestionnaireReviewScreen.kt:95)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(this.$modifier, null, 1, null);
            final UiQuestionnaireReview uiQuestionnaireReview = this.$reviewPage;
            final boolean z = this.$isCtaLoading;
            final Function2<UiQuestionnaireReview.QuestionAnswer, Map<String, ? extends UiQuestionnaireQuestion.Supported>, Unit> function2 = this.$onQuestionSelected;
            final Function1<List<UiQuestionnaireReview.QuestionAnswer>, Unit> function1 = this.$onClickConfirm;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion2, 1.0f, false, 2, null);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(uiQuestionnaireReview) | composer.changed(z) | composer.changed(function2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QuestionnaireReviewScreen4.C198601.invoke$lambda$6$lambda$3$lambda$2(uiQuestionnaireReview, z, function2, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoMarkdownText2.BentoMarkdownText(uiQuestionnaireReview.getDisclosureMarkdown(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SUBMIT, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), true, false, false, true, false, null, 108, null);
            String ctaText = uiQuestionnaireReview.getCtaText();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(uiQuestionnaireReview);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuestionnaireReviewScreen4.C198601.invoke$lambda$6$lambda$5$lambda$4(function1, uiQuestionnaireReview);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, ctaText, modifierAutoLogEvents$default, null, null, false, z, null, null, null, null, false, null, composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2(final UiQuestionnaireReview uiQuestionnaireReview, final boolean z, final Function2 function2, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(132542294, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(132542294, i, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReview.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireReviewScreen.kt:102)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoMarkdownText2.BentoMarkdownText(uiQuestionnaireReview.getTitleMarkdown(), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), 0, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-297409779, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-297409779, i, -1, "com.robinhood.android.investorprofile.ui.review.QuestionnaireReview.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireReviewScreen.kt:115)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoMarkdownText2.BentoMarkdownText(uiQuestionnaireReview.getSubtitleMarkdown(), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextM(), 0, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final List<UiQuestionnaireReview.QuestionAnswer> questionAnswers = uiQuestionnaireReview.getQuestionAnswers();
            final C19853xb19b7a9d c19853xb19b7a9d = new Function1() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$invoke$lambda$6$lambda$3$lambda$2$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(UiQuestionnaireReview.QuestionAnswer questionAnswer) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UiQuestionnaireReview.QuestionAnswer) obj);
                }
            };
            LazyColumn.items(questionAnswers.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$invoke$lambda$6$lambda$3$lambda$2$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c19853xb19b7a9d.invoke(questionAnswers.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$invoke$lambda$6$lambda$3$lambda$2$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    String value;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    final UiQuestionnaireReview.QuestionAnswer questionAnswer = (UiQuestionnaireReview.QuestionAnswer) questionAnswers.get(i);
                    composer.startReplaceGroup(-1418016437);
                    String title = questionAnswer.getTitle();
                    UiQuestionnaireReview.Answer answer = questionAnswer.getAnswer();
                    if (answer == null || (value = answer.getValue()) == null) {
                        value = "";
                    }
                    String str = value;
                    composer.startReplaceGroup(-1224400529);
                    boolean zChanged = composer.changed(z) | composer.changed(function2) | composer.changedInstance(questionAnswer) | composer.changedInstance(uiQuestionnaireReview);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final boolean z2 = z;
                        final Function2 function22 = function2;
                        final UiQuestionnaireReview uiQuestionnaireReview2 = uiQuestionnaireReview;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$QuestionnaireReview$1$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (z2) {
                                    return;
                                }
                                function22.invoke(questionAnswer, uiQuestionnaireReview2.getQuestionGraph());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSettingsRowKt.BentoSettingsRow((Modifier) null, title, str, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, (Function0<Unit>) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, UiQuestionnaireReview uiQuestionnaireReview) {
            function1.invoke(uiQuestionnaireReview.getQuestionAnswers());
            return Unit.INSTANCE;
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1864465538);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1864465538, i, -1, "com.robinhood.android.investorprofile.ui.review.Preview (QuestionnaireReviewScreen.kt:179)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, QuestionnaireReviewScreen.INSTANCE.getLambda$1770341946$feature_investor_profile_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.review.QuestionnaireReviewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireReviewScreen4.Preview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
