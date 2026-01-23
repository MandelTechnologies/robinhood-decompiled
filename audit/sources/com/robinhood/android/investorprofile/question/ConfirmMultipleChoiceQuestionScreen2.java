package com.robinhood.android.investorprofile.question;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.profile.InvestmentProfileSettingsBonfireIdentiFragment;
import com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionDuxo;
import com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreen2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: ConfirmMultipleChoiceQuestionScreen.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m3636d2 = {"ConfirmMultipleChoiceQuestionScreen", "", "accountNumber", "", "context", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "showExistingAnswer", "", "modifier", "Landroidx/compose/ui/Modifier;", "callbacks", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionCallbacks;", "duxo", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;ZLandroidx/compose/ui/Modifier;Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionCallbacks;Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-investor-profile_externalDebug", "state", "Lcom/robinhood/android/investorprofile/question/ConfirmMultipleChoiceQuestionViewState;", "selectedAnswer"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ConfirmMultipleChoiceQuestionScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmMultipleChoiceQuestionScreen$lambda$8(String str, String str2, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, boolean z, Modifier modifier, ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen, ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo, int i, int i2, Composer composer, int i3) {
        ConfirmMultipleChoiceQuestionScreen(str, str2, multipleChoiceQuestion, z, modifier, confirmMultipleChoiceQuestionScreen, confirmMultipleChoiceQuestionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e A[PHI: r14
      0x009e: PHI (r14v42 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:55:0x009c, B:65:0x00b5, B:64:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmMultipleChoiceQuestionScreen(final String str, final String context, final UiQuestionnaireQuestion.MultipleChoiceQuestion question, final boolean z, Modifier modifier, ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen, ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo2;
        Modifier modifier3;
        int i5;
        int i6;
        ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        String str2;
        String str3;
        boolean z2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen2 = confirmMultipleChoiceQuestionScreen;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(question, "question");
        Composer composerStartRestartGroup = composer.startRestartGroup(1440376809);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(context) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(question) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            int i8 = 196608;
            if (i4 != 0) {
                i3 |= i8;
            } else if ((196608 & i) == 0) {
                i8 = (i & 262144) == 0 ? composerStartRestartGroup.changed(confirmMultipleChoiceQuestionScreen2) : composerStartRestartGroup.changedInstance(confirmMultipleChoiceQuestionScreen2) ? 131072 : 65536;
                i3 |= i8;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    confirmMultipleChoiceQuestionDuxo2 = confirmMultipleChoiceQuestionDuxo;
                    int i9 = composerStartRestartGroup.changedInstance(confirmMultipleChoiceQuestionDuxo2) ? 1048576 : 524288;
                    i3 |= i9;
                } else {
                    confirmMultipleChoiceQuestionDuxo2 = confirmMultipleChoiceQuestionDuxo;
                }
                i3 |= i9;
            } else {
                confirmMultipleChoiceQuestionDuxo2 = confirmMultipleChoiceQuestionDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        confirmMultipleChoiceQuestionScreen2 = null;
                    }
                    if ((i2 & 64) == 0) {
                        String str4 = "confirm-multiple-choice-" + question.getKey();
                        ConfirmMultipleChoiceQuestionDuxo.InitArgs initArgs = new ConfirmMultipleChoiceQuestionDuxo.InitArgs(context, str, question);
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i5 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ConfirmMultipleChoiceQuestionDuxo.class), current, str4, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$ConfirmMultipleChoiceQuestionScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$ConfirmMultipleChoiceQuestionScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        ConfirmMultipleChoiceQuestionDuxo confirmMultipleChoiceQuestionDuxo5 = (ConfirmMultipleChoiceQuestionDuxo) baseDuxo;
                        i6 = i3 & (-3670017);
                        confirmMultipleChoiceQuestionDuxo3 = confirmMultipleChoiceQuestionDuxo5;
                    } else {
                        i5 = -1633490746;
                        i6 = i3;
                        confirmMultipleChoiceQuestionDuxo3 = confirmMultipleChoiceQuestionDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i6 = i3;
                    modifier3 = modifier2;
                    confirmMultipleChoiceQuestionDuxo3 = confirmMultipleChoiceQuestionDuxo2;
                    i5 = -1633490746;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1440376809, i6, -1, "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreen (ConfirmMultipleChoiceQuestionScreen.kt:44)");
                }
                int i10 = i6;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(confirmMultipleChoiceQuestionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr = {ConfirmMultipleChoiceQuestionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInitialAnswer()};
                composerStartRestartGroup.startReplaceGroup(i5);
                zChanged = ((i10 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$2$lambda$1(z, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                String title = question.getTitle();
                String subtitle = question.getSubtitle();
                String disclosureMarkdown = question.getDisclosureMarkdown();
                String strStringResource = StringResources_androidKt.stringResource(C19641R.string.confirm_multiple_choice_cta, composerStartRestartGroup, 0);
                if (ConfirmMultipleChoiceQuestionScreen$lambda$3(snapshotState) == null) {
                    str2 = title;
                    str3 = strStringResource;
                    z2 = true;
                } else {
                    str2 = title;
                    str3 = strStringResource;
                    z2 = false;
                }
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(question) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i10 & 458752) != 131072 || ((i10 & 262144) != 0 && composerStartRestartGroup.changedInstance(confirmMultipleChoiceQuestionScreen2)));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$7$lambda$6(question, confirmMultipleChoiceQuestionScreen2, snapshotState, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier3;
                Composer composer2 = composerStartRestartGroup;
                ConfirmQuestionLayout.ConfirmQuestionLayout(str2, subtitle, disclosureMarkdown, str3, (Function0) objRememberedValue2, z2, modifier5, ComposableLambda3.rememberComposableLambda(334907947, true, new C196502(question, snapshotState), composerStartRestartGroup, 54), composer2, (3670016 & (i10 << 6)) | 12582912, 0);
                composerStartRestartGroup = composer2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                confirmMultipleChoiceQuestionDuxo4 = confirmMultipleChoiceQuestionDuxo3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                confirmMultipleChoiceQuestionDuxo4 = confirmMultipleChoiceQuestionDuxo2;
            }
            final ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen3 = confirmMultipleChoiceQuestionScreen2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$8(str, context, question, z, modifier4, confirmMultipleChoiceQuestionScreen3, confirmMultipleChoiceQuestionDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i2 & 32;
        int i82 = 196608;
        if (i4 != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i102 = i6;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(confirmMultipleChoiceQuestionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Object[] objArr2 = {ConfirmMultipleChoiceQuestionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInitialAnswer()};
                composerStartRestartGroup.startReplaceGroup(i5);
                zChanged = ((i102 & 7168) != 2048) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$2$lambda$1(z, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    String title2 = question.getTitle();
                    String subtitle2 = question.getSubtitle();
                    String disclosureMarkdown2 = question.getDisclosureMarkdown();
                    String strStringResource2 = StringResources_androidKt.stringResource(C19641R.string.confirm_multiple_choice_cta, composerStartRestartGroup, 0);
                    if (ConfirmMultipleChoiceQuestionScreen$lambda$3(snapshotState) == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    if ((i102 & 458752) != 131072) {
                        zChangedInstance = composerStartRestartGroup.changedInstance(question) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i102 & 458752) != 131072 || ((i102 & 262144) != 0 && composerStartRestartGroup.changedInstance(confirmMultipleChoiceQuestionScreen2)));
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$7$lambda$6(question, confirmMultipleChoiceQuestionScreen2, snapshotState, snapshotState4CollectAsStateWithLifecycle);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier3;
                            Composer composer22 = composerStartRestartGroup;
                            ConfirmQuestionLayout.ConfirmQuestionLayout(str2, subtitle2, disclosureMarkdown2, str3, (Function0) objRememberedValue2, z2, modifier52, ComposableLambda3.rememberComposableLambda(334907947, true, new C196502(question, snapshotState), composerStartRestartGroup, 54), composer22, (3670016 & (i102 << 6)) | 12582912, 0);
                            composerStartRestartGroup = composer22;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            confirmMultipleChoiceQuestionDuxo4 = confirmMultipleChoiceQuestionDuxo3;
                            modifier4 = modifier52;
                        }
                    }
                }
            }
        }
        final ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen32 = confirmMultipleChoiceQuestionScreen2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ConfirmMultipleChoiceQuestionScreen$lambda$2$lambda$1(boolean z, SnapshotState4 snapshotState4) {
        return z ? SnapshotState3.mutableStateOf$default(ConfirmMultipleChoiceQuestionScreen$lambda$0(snapshotState4).getInitialAnswer(), null, 2, null) : SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* compiled from: ConfirmMultipleChoiceQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$ConfirmMultipleChoiceQuestionScreen$2 */
    static final class C196502 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UiQuestionnaireQuestion.MultipleChoiceQuestion $question;
        final /* synthetic */ SnapshotState<String> $selectedAnswer$delegate;

        C196502(UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, SnapshotState<String> snapshotState) {
            this.$question = multipleChoiceQuestion;
            this.$selectedAnswer$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(334907947, i, -1, "com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreen.<anonymous> (ConfirmMultipleChoiceQuestionScreen.kt:59)");
            }
            for (final UiQuestionContent.MultipleChoiceContent.Answer answer : this.$question.getContent().getAnswerChoices()) {
                String title = answer.getTitle();
                String subtitle = answer.getSubtitle();
                composer2.startReplaceGroup(-276002579);
                BentoBaseRowState.Meta.Icon icon = Intrinsics.areEqual(ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$3(this.$selectedAnswer$delegate), answer.getKey()) ? new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, StringResources_androidKt.stringResource(C19641R.string.confirm_multiple_choice_checkmark_content_description, composer2, 0), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21456getPositive0d7_KjU()), (Function0) null, 8, (DefaultConstructorMarker) null) : null;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(this.$selectedAnswer$delegate) | composer2.changedInstance(answer);
                final SnapshotState<String> snapshotState = this.$selectedAnswer$delegate;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.ConfirmMultipleChoiceQuestionScreenKt$ConfirmMultipleChoiceQuestionScreen$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConfirmMultipleChoiceQuestionScreen2.C196502.invoke$lambda$1$lambda$0(answer, snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, title, subtitle, null, icon, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, BentoBaseRowState.Meta.Icon.$stable << 15, 0, 2003);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UiQuestionContent.MultipleChoiceContent.Answer answer, SnapshotState snapshotState) {
            ConfirmMultipleChoiceQuestionScreen2.ConfirmMultipleChoiceQuestionScreen$lambda$4(snapshotState, answer.getKey());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmMultipleChoiceQuestionScreen$lambda$7$lambda$6(UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, ConfirmMultipleChoiceQuestionScreen confirmMultipleChoiceQuestionScreen, SnapshotState snapshotState, SnapshotState4 snapshotState4) {
        Object next;
        Iterator<T> it = multipleChoiceQuestion.getContent().getAnswerChoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((UiQuestionContent.MultipleChoiceContent.Answer) next).getKey(), ConfirmMultipleChoiceQuestionScreen$lambda$3(snapshotState))) {
                break;
            }
        }
        UiQuestionContent.MultipleChoiceContent.Answer answer = (UiQuestionContent.MultipleChoiceContent.Answer) next;
        if (answer != null) {
            boolean z = Intrinsics.areEqual(multipleChoiceQuestion.getKey(), "annual_income") && Intrinsics.areEqual(ConfirmMultipleChoiceQuestionScreen$lambda$0(snapshotState4).getInitialAnswer(), InvestmentProfileSettingsBonfireIdentiFragment.ANNUAL_INCOME_LESS_THAN_TWENTY_FIVE_THOUSAND) && !Intrinsics.areEqual(answer.getKey(), InvestmentProfileSettingsBonfireIdentiFragment.ANNUAL_INCOME_LESS_THAN_TWENTY_FIVE_THOUSAND);
            if (confirmMultipleChoiceQuestionScreen != null) {
                confirmMultipleChoiceQuestionScreen.onConfirmMultipleChoiceQuestionAnswered(new QuestionnaireAnswer.MultipleChoiceAnswer(multipleChoiceQuestion, !z, answer.getId()));
            }
        }
        return Unit.INSTANCE;
    }

    private static final ConfirmMultipleChoiceQuestionViewState ConfirmMultipleChoiceQuestionScreen$lambda$0(SnapshotState4<ConfirmMultipleChoiceQuestionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ConfirmMultipleChoiceQuestionScreen$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConfirmMultipleChoiceQuestionScreen$lambda$4(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
