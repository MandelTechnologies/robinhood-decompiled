package com.robinhood.android.equityscreener.crud.save;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter;
import com.robinhood.android.common.emojipicker.Emoji;
import com.robinhood.android.common.emojipicker.EmojiPickerBottomSheetFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.equities.contracts.screeners.SaveScreenerContract;
import com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetViewState;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SaveScreenerBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001bH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\"²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "openEmojiPicker", "currentEmoji", "", "onEmojiItemClick", "clickedEmoji", "Lcom/robinhood/android/common/emojipicker/Emoji;", "onShowMoreClick", "key", "Companion", "feature-equity-screener_externalDebug", "viewState", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SaveScreenerBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements CuratedListEmojiAdapter.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SaveScreenerContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof SaveScreenerContract.Callbacks)) {
                parentFragment = null;
            }
            SaveScreenerContract.Callbacks callbacks = (SaveScreenerContract.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SaveScreenerContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, SaveScreenerBottomSheetDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SaveScreenerBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment, int i, Composer composer, int i2) {
        saveScreenerBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter.Callbacks
    public void onShowMoreClick(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveScreenerContract.Callbacks getCallbacks() {
        return (SaveScreenerContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SaveScreenerBottomSheetDuxo getDuxo() {
        return (SaveScreenerBottomSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseDialogFragment.collectDuxoState$default(this, null, new C156761(null), 1, null);
    }

    /* compiled from: SaveScreenerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1", m3645f = "SaveScreenerBottomSheetFragment.kt", m3646l = {38}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1 */
    static final class C156761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C156761(Continuation<? super C156761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SaveScreenerBottomSheetFragment.this.new C156761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C156761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<SaveScreenerBottomSheetViewState> stateFlow = SaveScreenerBottomSheetFragment.this.getDuxo().getStateFlow();
                Flow<SaveScreenerBottomSheetViewState.Ready> flow = new Flow<SaveScreenerBottomSheetViewState.Ready>() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "SaveScreenerBottomSheetFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$onViewCreated$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewState = (SaveScreenerBottomSheetViewState) obj;
                                SaveScreenerBottomSheetViewState.Ready ready = saveScreenerBottomSheetViewState instanceof SaveScreenerBottomSheetViewState.Ready ? (SaveScreenerBottomSheetViewState.Ready) saveScreenerBottomSheetViewState : null;
                                if (ready != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(ready, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super SaveScreenerBottomSheetViewState.Ready> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                final SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment = SaveScreenerBottomSheetFragment.this;
                FlowCollector<? super SaveScreenerBottomSheetViewState.Ready> flowCollector = new FlowCollector() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment.onViewCreated.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SaveScreenerBottomSheetViewState.Ready) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SaveScreenerBottomSheetViewState.Ready ready, Continuation<? super Unit> continuation) {
                        if (ready.getSavedScreenerId() != null) {
                            saveScreenerBottomSheetFragment.getDuxo().logOnEditName(ready.getDisplayName());
                            saveScreenerBottomSheetFragment.getCallbacks().onScreenerSaved(ready.getSavedScreenerId());
                            saveScreenerBottomSheetFragment.dismiss();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211514904);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1211514904, i2, -1, "com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment.ComposeContent (SaveScreenerBottomSheetFragment.kt:48)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveScreenerBottomSheetFragment.ComposeContent$lambda$2$lambda$1(this.f$0, snapshotState4CollectAsStateWithLifecycle);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            SaveScreenerBottomSheetDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new SaveScreenerBottomSheetFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SaveScreenerBottomSheetFragment.ComposeContent$lambda$5$lambda$4(this.f$0, snapshotState4CollectAsStateWithLifecycle);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new SaveScreenerBottomSheetFragment3(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            SaveScreenerComposable.SaveScreenerComposable(saveScreenerBottomSheetViewStateComposeContent$lambda$0, function0, function1, function02, (Function0) ((KFunction) objRememberedValue4), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.crud.save.SaveScreenerBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveScreenerBottomSheetFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment, SnapshotState4 snapshotState4) {
        SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4);
        if (saveScreenerBottomSheetViewStateComposeContent$lambda$0 instanceof SaveScreenerBottomSheetViewState.Ready) {
            saveScreenerBottomSheetFragment.openEmojiPicker(((SaveScreenerBottomSheetViewState.Ready) saveScreenerBottomSheetViewStateComposeContent$lambda$0).getEmoji());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment, SnapshotState4 snapshotState4) {
        SaveScreenerBottomSheetViewState saveScreenerBottomSheetViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4);
        if (saveScreenerBottomSheetViewStateComposeContent$lambda$0 instanceof SaveScreenerBottomSheetViewState.Ready) {
            SaveScreenerBottomSheetViewState.Ready ready = (SaveScreenerBottomSheetViewState.Ready) saveScreenerBottomSheetViewStateComposeContent$lambda$0;
            saveScreenerBottomSheetFragment.getDuxo().saveScreener(ready.getDisplayName(), ready.getEmoji());
        }
        return Unit.INSTANCE;
    }

    private final void openEmojiPicker(String currentEmoji) {
        EmojiPickerBottomSheetFragment emojiPickerBottomSheetFragmentNewInstance = EmojiPickerBottomSheetFragment.INSTANCE.newInstance(currentEmoji);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        emojiPickerBottomSheetFragmentNewInstance.show(childFragmentManager, "emoji-picker");
    }

    @Override // com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter.Callbacks
    public void onEmojiItemClick(Emoji clickedEmoji) {
        Intrinsics.checkNotNullParameter(clickedEmoji, "clickedEmoji");
        getDuxo().setEmoji(clickedEmoji);
    }

    /* compiled from: SaveScreenerBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equityscreener/crud/save/SaveScreenerBottomSheetFragment;", "Lcom/robinhood/android/equities/contracts/screeners/SaveScreenerContract$Key;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<SaveScreenerBottomSheetFragment, SaveScreenerContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public SaveScreenerBottomSheetFragment createDialogFragment(SaveScreenerContract.Key key) {
            return (SaveScreenerBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SaveScreenerContract.Key getArgs(SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment) {
            return (SaveScreenerContract.Key) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, saveScreenerBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SaveScreenerBottomSheetFragment newInstance(SaveScreenerContract.Key key) {
            return (SaveScreenerBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SaveScreenerBottomSheetFragment saveScreenerBottomSheetFragment, SaveScreenerContract.Key key) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, saveScreenerBottomSheetFragment, key);
        }
    }

    private static final SaveScreenerBottomSheetViewState ComposeContent$lambda$0(SnapshotState4<? extends SaveScreenerBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
