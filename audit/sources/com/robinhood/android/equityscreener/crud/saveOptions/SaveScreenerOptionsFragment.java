package com.robinhood.android.equityscreener.crud.saveOptions;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerOptionsContract;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SaveScreenerOptionsFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\r\u0010\u0016\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SaveScreenerOptionsFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SaveScreenerOptionsContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof SaveScreenerOptionsContract.Callbacks)) {
                parentFragment = null;
            }
            SaveScreenerOptionsContract.Callbacks callbacks = (SaveScreenerOptionsContract.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SaveScreenerOptionsContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SaveScreenerOptionsDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SaveScreenerOptionsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(SaveScreenerOptionsFragment saveScreenerOptionsFragment, int i, Composer composer, int i2) {
        saveScreenerOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveScreenerOptionsContract.Callbacks getCallbacks() {
        return (SaveScreenerOptionsContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveScreenerOptionsDuxo getDuxo() {
        return (SaveScreenerOptionsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C156831(null), 1, null);
    }

    /* compiled from: SaveScreenerOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$onViewCreated$1", m3645f = "SaveScreenerOptionsFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$onViewCreated$1 */
    static final class C156831 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156831(Continuation<? super C156831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SaveScreenerOptionsFragment.this.new C156831(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SaveScreenerOptionsViewState> stateFlow = SaveScreenerOptionsFragment.this.getDuxo().getStateFlow();
                final SaveScreenerOptionsFragment saveScreenerOptionsFragment = SaveScreenerOptionsFragment.this;
                FlowCollector<? super SaveScreenerOptionsViewState> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SaveScreenerOptionsViewState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SaveScreenerOptionsViewState saveScreenerOptionsViewState, Continuation<? super Unit> continuation) {
                        if (saveScreenerOptionsViewState.isSaved()) {
                            SaveScreenerOptionsContract.Callbacks callbacks = saveScreenerOptionsFragment.getCallbacks();
                            Companion companion = SaveScreenerOptionsFragment.INSTANCE;
                            callbacks.onSaved(((SaveScreenerOptionsContract.Key) companion.getArgs((Fragment) saveScreenerOptionsFragment)).getScreenerId(), ((SaveScreenerOptionsContract.Key) companion.getArgs((Fragment) saveScreenerOptionsFragment)).getDisplayName());
                            saveScreenerOptionsFragment.dismiss();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968298548);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968298548, i2, -1, "com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment.ComposeContent (SaveScreenerOptionsFragment.kt:53)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(139985569, true, new C156821(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveScreenerOptionsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SaveScreenerOptionsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$ComposeContent$1 */
    static final class C156821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<SaveScreenerOptionsViewState> $viewState$delegate;

        C156821(SnapshotState4<SaveScreenerOptionsViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(SaveScreenerOptionsFragment saveScreenerOptionsFragment) {
            saveScreenerOptionsFragment.getCallbacks().onSaveAs(((SaveScreenerOptionsContract.Key) SaveScreenerOptionsFragment.INSTANCE.getArgs((Fragment) saveScreenerOptionsFragment)).getScreenerId());
            saveScreenerOptionsFragment.getDuxo().onSaveAs();
            saveScreenerOptionsFragment.dismiss();
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(139985569, i, -1, "com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment.ComposeContent.<anonymous> (SaveScreenerOptionsFragment.kt:56)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final SaveScreenerOptionsFragment saveScreenerOptionsFragment = SaveScreenerOptionsFragment.this;
            SnapshotState4<SaveScreenerOptionsViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C15652R.string.save_options_title, composer, 0);
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, medium, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 24576, 0, 8110);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C15652R.string.save_options_description, composer, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8124);
            boolean z = (SaveScreenerOptionsFragment.ComposeContent$lambda$0(snapshotState4).isSaving() || SaveScreenerOptionsFragment.ComposeContent$lambda$0(snapshotState4).isSaved()) ? false : true;
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C15652R.string.save_options_update, composer, 0);
            Object duxo = saveScreenerOptionsFragment.getDuxo();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(duxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SaveScreenerOptionsFragment2(duxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            boolean zIsSaving = SaveScreenerOptionsFragment.ComposeContent$lambda$0(snapshotState4).isSaving();
            String strStringResource3 = StringResources_androidKt.stringResource(C15652R.string.save_options_new, composer, 0);
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(saveScreenerOptionsFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityscreener.crud.saveOptions.SaveScreenerOptionsFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveScreenerOptionsFragment.C156821.invoke$lambda$3$lambda$2$lambda$1(saveScreenerOptionsFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            boolean z2 = z;
            BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default2, null, null, false, null, null, function0, strStringResource2, zIsSaving, null, z2, (Function0) objRememberedValue2, strStringResource3, false, null, z2, composer, 0, 0, 25150);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveScreenerOptionsViewState ComposeContent$lambda$0(SnapshotState4<SaveScreenerOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: SaveScreenerOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equityscreener/crud/saveOptions/SaveScreenerOptionsFragment;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerOptionsContract$Key;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<SaveScreenerOptionsFragment, SaveScreenerOptionsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public SaveScreenerOptionsFragment createDialogFragment(SaveScreenerOptionsContract.Key key) {
            return (SaveScreenerOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SaveScreenerOptionsContract.Key getArgs(SaveScreenerOptionsFragment saveScreenerOptionsFragment) {
            return (SaveScreenerOptionsContract.Key) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, saveScreenerOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SaveScreenerOptionsFragment newInstance(SaveScreenerOptionsContract.Key key) {
            return (SaveScreenerOptionsFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SaveScreenerOptionsFragment saveScreenerOptionsFragment, SaveScreenerOptionsContract.Key key) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, saveScreenerOptionsFragment, key);
        }
    }
}
