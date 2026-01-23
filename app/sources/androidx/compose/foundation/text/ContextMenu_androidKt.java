package androidx.compose.foundation.text;

import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: ContextMenu.android.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "content", "ContextMenuArea", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "getContextMenuItemsAvailability", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ContextMenu_androidKt {

    /* compiled from: ContextMenu.android.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.text.ContextMenu_androidKt", m3645f = "ContextMenu.android.kt", m3646l = {167}, m3647m = "getContextMenuItemsAvailability")
    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$2 */
    static final class C13382 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C13382(Continuation<? super C13382> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContextMenu_androidKt.getContextMenuItemsAvailability(null, this);
        }
    }

    public static final void ContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1985516685);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985516685, i2, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ContextMenuState(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(MenuItemsAvailability.m5396boximpl(MenuItemsAvailability.INSTANCE.m5407getNoneJKCFgKw()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
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
                        ContextMenuState_androidKt.close(contextMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Function0 function0 = (Function0) objRememberedValue4;
            Function1<ContextMenuScope, Unit> function1ContextMenuBuilder = TextFieldSelectionManager_androidKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, snapshotState);
            boolean enabled = textFieldSelectionManager.getEnabled();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* compiled from: ContextMenu.android.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", m3645f = "ContextMenu.android.kt", m3646l = {56}, m3647m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1 */
                    static final class C13361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ TextFieldSelectionManager $manager;
                        final /* synthetic */ SnapshotState<MenuItemsAvailability> $menuItemsAvailability;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C13361(SnapshotState<MenuItemsAvailability> snapshotState, TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C13361> continuation) {
                            super(2, continuation);
                            this.$menuItemsAvailability = snapshotState;
                            this.$manager = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C13361(this.$menuItemsAvailability, this.$manager, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C13361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            SnapshotState snapshotState;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                SnapshotState<MenuItemsAvailability> snapshotState2 = this.$menuItemsAvailability;
                                TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                                this.L$0 = snapshotState2;
                                this.label = 1;
                                Object contextMenuItemsAvailability = ContextMenu_androidKt.getContextMenuItemsAvailability(textFieldSelectionManager, this);
                                if (contextMenuItemsAvailability == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                snapshotState = snapshotState2;
                                obj = contextMenuItemsAvailability;
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                snapshotState = (SnapshotState) this.L$0;
                                ResultKt.throwOnFailure(obj);
                            }
                            snapshotState.setValue(obj);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C13361(snapshotState, textFieldSelectionManager, null), 1, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            function22 = function2;
            ContextMenuArea_androidKt.ContextMenuArea(contextMenuState, function0, function1ContextMenuBuilder, null, enabled, (Function0) objRememberedValue5, function22, composerStartRestartGroup, ((i2 << 15) & 3670016) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function22 = function2;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea.3
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

                public final void invoke(Composer composer2, int i3) {
                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function22, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[PHI: r2 r5 r7 r8
      0x0093: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r5v3 int) = (r5v1 int), (r5v11 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r7v3 androidx.compose.foundation.text.selection.TextFieldSelectionManager) = 
      (r7v0 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
      (r7v9 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
     binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v10 int) = (r8v6 int), (r8v12 int) binds: [B:20:0x005e, B:34:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getContextMenuItemsAvailability(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super MenuItemsAvailability> continuation) {
        C13382 c13382;
        ?? r2;
        int i;
        int i2;
        TextFieldSelectionManager textFieldSelectionManager2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i7;
        if (continuation instanceof C13382) {
            c13382 = (C13382) continuation;
            int i8 = c13382.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c13382.label = i8 - Integer.MIN_VALUE;
            } else {
                c13382 = new C13382(continuation);
            }
        }
        Object obj = c13382.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = c13382.label;
        boolean z5 = false;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            r2 = textFieldSelectionManager.getVisualTransformation() instanceof VisualTransformation2;
            boolean zM7640getCollapsedimpl = TextRange.m7640getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
            i = !zM7640getCollapsedimpl ? 1 : 0;
            i2 = (zM7640getCollapsedimpl || r2 != 0) ? 0 : 1;
            if (textFieldSelectionManager.getEditable()) {
                Clipboard clipboard = textFieldSelectionManager.getClipboard();
                i6 = r2;
                i5 = i2;
                if (clipboard != null) {
                    c13382.L$0 = textFieldSelectionManager;
                    c13382.I$0 = r2;
                    c13382.I$1 = i;
                    c13382.I$2 = i2 == true ? 1 : 0;
                    c13382.label = 1;
                    Object clipEntry = clipboard.getClipEntry(c13382);
                    if (clipEntry == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    textFieldSelectionManager2 = textFieldSelectionManager;
                    i3 = i2 == true ? 1 : 0;
                    obj = clipEntry;
                    i4 = i;
                    i7 = r2;
                }
                z = false;
                r2 = i6;
                i2 = i5;
                if (z) {
                    z2 = true;
                    z4 = r2;
                    z3 = i2;
                }
                boolean z6 = i == 0 && textFieldSelectionManager.getEditable() && !z4;
                boolean z7 = TextRange.m7642getLengthimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) == textFieldSelectionManager.getValue$foundation_release().getText().length();
                if (textFieldSelectionManager.getEditable() && TextRange.m7640getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                    z5 = true;
                }
                return MenuItemsAvailability.m5396boximpl(MenuItemsAvailability.m5398constructorimpl(z3, z2, z6, z7, z5));
            }
            z2 = false;
            z4 = r2;
            z3 = i2;
            if (i == 0) {
            }
            if (TextRange.m7642getLengthimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) == textFieldSelectionManager.getValue$foundation_release().getText().length()) {
            }
            if (textFieldSelectionManager.getEditable()) {
                z5 = true;
            }
            return MenuItemsAvailability.m5396boximpl(MenuItemsAvailability.m5398constructorimpl(z3, z2, z6, z7, z5));
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3 = c13382.I$2;
        i4 = c13382.I$1;
        int i10 = c13382.I$0;
        textFieldSelectionManager2 = (TextFieldSelectionManager) c13382.L$0;
        ResultKt.throwOnFailure(obj);
        i7 = i10;
        ClipEntry clipEntry2 = (ClipEntry) obj;
        if (clipEntry2 == null || !ClipboardUtils_androidKt.hasText(clipEntry2)) {
            i5 = i3;
            textFieldSelectionManager = textFieldSelectionManager2;
            i = i4;
            i6 = i7;
            z = false;
            r2 = i6;
            i2 = i5;
            if (z) {
                z2 = false;
                z4 = r2;
                z3 = i2;
            }
            if (i == 0) {
            }
            if (TextRange.m7642getLengthimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) == textFieldSelectionManager.getValue$foundation_release().getText().length()) {
            }
            if (textFieldSelectionManager.getEditable()) {
            }
            return MenuItemsAvailability.m5396boximpl(MenuItemsAvailability.m5398constructorimpl(z3, z2, z6, z7, z5));
        }
        i2 = i3;
        textFieldSelectionManager = textFieldSelectionManager2;
        i = i4;
        z = true;
        r2 = i7;
        if (z) {
        }
        if (i == 0) {
        }
        if (TextRange.m7642getLengthimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) == textFieldSelectionManager.getValue$foundation_release().getText().length()) {
        }
        if (textFieldSelectionManager.getEditable()) {
        }
        return MenuItemsAvailability.m5396boximpl(MenuItemsAvailability.m5398constructorimpl(z3, z2, z6, z7, z5));
    }
}
