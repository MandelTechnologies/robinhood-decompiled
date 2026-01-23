package com.truelayer.payments.p419ui.components.inputs.form;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FocusActionManager.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aa\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032,\u0010\r\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u0014\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"T", "", "items", "Lkotlin/Function0;", "", "shouldRequestFocus", "Lkotlin/Function2;", "Lcom/truelayer/payments/ui/components/inputs/form/FocusActionManagerScope;", "Lkotlin/ParameterName;", "name", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "Lkotlin/ExtensionFunctionType;", "itemContent", "FocusActionManager", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;", "Landroidx/compose/foundation/text/KeyboardActions;", "intoKeyboardActions", "(Lcom/truelayer/payments/ui/components/inputs/form/FocusActions;)Landroidx/compose/foundation/text/KeyboardActions;", "", "focusedIndex", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class FocusActionManager {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void FocusActionManager(final List<? extends T> items, Function0<Boolean> function0, final Function4<? super FocusActionManagerScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent, Composer composer, final int i, final int i2) {
        Object obj;
        int iM7747getDoneeUduSuo;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-733074722);
        Function0<Boolean> function02 = (i2 & 2) != 0 ? new Function0<Boolean>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt.FocusActionManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-733074722, i, -1, "com.truelayer.payments.ui.components.inputs.form.FocusActionManager (FocusActionManager.kt:37)");
        }
        FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
        int bottom = WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, composerStartRestartGroup, 8).getBottom((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
        final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<SnapshotState<Integer>>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$focusedIndex$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SnapshotState<Integer> invoke() {
                return SnapshotState3.mutableStateOf$default(-1, null, 2, null);
            }
        }, composerStartRestartGroup, 3080, 6);
        int size = items.size();
        composerStartRestartGroup.startReplaceableGroup(449661323);
        boolean zChanged = composerStartRestartGroup.changed(size);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (!zChanged) {
            obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int size2 = items.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList.add(new Tuples2(new FocusRequester(), BringIntoViewRequesterKt.BringIntoViewRequester()));
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                obj = arrayList;
            }
        }
        List list = (List) obj;
        composerStartRestartGroup.endReplaceableGroup();
        final Function0<Boolean> function03 = function02;
        EffectsKt.LaunchedEffect(Integer.valueOf(FocusActionManager$lambda$0(snapshotState)), new C429042(function03, items, focusManager, list, snapshotState, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(Integer.valueOf(bottom), Integer.valueOf(FocusActionManager$lambda$0(snapshotState)), new C429053(list, snapshotState, bottom, null), composerStartRestartGroup, 512);
        final int i4 = 0;
        for (T t : items) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) list.get(i4);
            FocusRequester focusRequester = (FocusRequester) tuples2.component1();
            BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) tuples2.component2();
            if (i4 != CollectionsKt.getLastIndex(items)) {
                iM7747getDoneeUduSuo = ImeAction.INSTANCE.m7749getNexteUduSuo();
            } else {
                iM7747getDoneeUduSuo = ImeAction.INSTANCE.m7747getDoneeUduSuo();
            }
            int i6 = iM7747getDoneeUduSuo;
            Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(FocusRequesterModifier3.focusRequester(Modifier.INSTANCE, focusRequester), bringIntoViewRequester);
            composerStartRestartGroup.startReplaceableGroup(-275879555);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(i4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$4$modifier$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        FocusActionManager.FocusActionManager$lambda$1(snapshotState, i4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnFocused = ModifiersKt.onFocused(modifierBringIntoViewRequester, (Function0) objRememberedValue2);
            composerStartRestartGroup.startReplaceableGroup(-275879474);
            boolean zChanged3 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$4$actions$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        SnapshotState<Integer> snapshotState2 = snapshotState;
                        FocusActionManager.FocusActionManager$lambda$1(snapshotState2, FocusActionManager.FocusActionManager$lambda$0(snapshotState2) + 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function04 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-275879432);
            boolean zChanged4 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$4$actions$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        FocusActionManager.FocusActionManager$lambda$1(snapshotState, FocusActionManager.FocusActionManager$lambda$0(r0) - 1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function05 = (Function0) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-275879389);
            boolean zChanged5 = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$4$actions$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        FocusActionManager.FocusActionManager$lambda$1(snapshotState, -1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            itemContent.invoke(new FocusActionManagerScope(i4, modifierOnFocused, new FocusActions(function04, function05, (Function0) objRememberedValue5), i6, null), t, composerStartRestartGroup, Integer.valueOf(i & 896));
            i4 = i5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt.FocusActionManager.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    FocusActionManager.FocusActionManager(items, function03, itemContent, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FocusActionManager$lambda$1(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* compiled from: FocusActionManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$2", m3645f = "FocusActionManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$2 */
    static final class C429042 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ SnapshotState<Integer> $focusedIndex$delegate;
        final /* synthetic */ List<T> $items;
        final /* synthetic */ List<Tuples2<FocusRequester, BringIntoViewRequester>> $requesters;
        final /* synthetic */ Function0<Boolean> $shouldRequestFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C429042(Function0<Boolean> function0, List<? extends T> list, FocusManager focusManager, List<? extends Tuples2<FocusRequester, ? extends BringIntoViewRequester>> list2, SnapshotState<Integer> snapshotState, Continuation<? super C429042> continuation) {
            super(2, continuation);
            this.$shouldRequestFocus = function0;
            this.$items = list;
            this.$focusManager = focusManager;
            this.$requesters = list2;
            this.$focusedIndex$delegate = snapshotState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C429042(this.$shouldRequestFocus, this.$items, this.$focusManager, this.$requesters, this.$focusedIndex$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C429042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                int iFocusActionManager$lambda$0 = FocusActionManager.FocusActionManager$lambda$0(this.$focusedIndex$delegate);
                if (!this.$shouldRequestFocus.invoke().booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (iFocusActionManager$lambda$0 < 0 || iFocusActionManager$lambda$0 >= this.$items.size()) {
                    FocusManager.clearFocus$default(this.$focusManager, false, 1, null);
                    return Unit.INSTANCE;
                }
                Tuples2 tuples2 = (Tuples2) CollectionsKt.getOrNull(this.$requesters, iFocusActionManager$lambda$0);
                if (tuples2 != null) {
                    ((FocusRequester) tuples2.component1()).requestFocus();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FocusActionManager.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$3", m3645f = "FocusActionManager.kt", m3646l = {66}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt$FocusActionManager$3 */
    static final class C429053 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState<Integer> $focusedIndex$delegate;
        final /* synthetic */ int $keyboardBottomPosition;
        final /* synthetic */ List<Tuples2<FocusRequester, BringIntoViewRequester>> $requesters;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C429053(List<? extends Tuples2<FocusRequester, ? extends BringIntoViewRequester>> list, SnapshotState<Integer> snapshotState, int i, Continuation<? super C429053> continuation) {
            super(2, continuation);
            this.$requesters = list;
            this.$focusedIndex$delegate = snapshotState;
            this.$keyboardBottomPosition = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C429053(this.$requesters, this.$focusedIndex$delegate, this.$keyboardBottomPosition, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C429053) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Tuples2 tuples2 = (Tuples2) CollectionsKt.getOrNull(this.$requesters, FocusActionManager.FocusActionManager$lambda$0(this.$focusedIndex$delegate));
                if (tuples2 != null) {
                    int i2 = this.$keyboardBottomPosition;
                    BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) tuples2.component2();
                    if (i2 > 0) {
                        this.label = 1;
                        if (BringIntoViewRequester.bringIntoView$default(bringIntoViewRequester, null, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

    public static final KeyboardActions intoKeyboardActions(final FocusActions focusActions) {
        Intrinsics.checkNotNullParameter(focusActions, "<this>");
        return new KeyboardActions(new Function1<KeyboardActions2, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt.intoKeyboardActions.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActions2 keyboardActions2) {
                invoke2(keyboardActions2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActions2 $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                focusActions.getClear().invoke();
            }
        }, null, new Function1<KeyboardActions2, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt.intoKeyboardActions.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActions2 keyboardActions2) {
                invoke2(keyboardActions2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActions2 $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                focusActions.getNext().invoke();
            }
        }, new Function1<KeyboardActions2, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.form.FocusActionManagerKt.intoKeyboardActions.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeyboardActions2 keyboardActions2) {
                invoke2(keyboardActions2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeyboardActions2 $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                focusActions.getPrev().invoke();
            }
        }, null, null, 50, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FocusActionManager$lambda$0(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }
}
