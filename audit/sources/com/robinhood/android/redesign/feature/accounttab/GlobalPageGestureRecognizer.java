package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.Updater;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GlobalPageGestureRecognizer.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001a\u009d\u0001\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00002#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0013\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lkotlin/Function0;", "", "shouldConsumeVerticalScroll", "shouldProcessEvents", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "dy", "", "onVerticalScroll", "onGestureEnd", "isScrolling", "onScrollingChanged", "content", "GlobalPageGestureRecognizer", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "totalDx", "totalDy", "feature-account-selector_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GlobalPageGestureRecognizer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalPageGestureRecognizer$lambda$14(Function0 function0, Function0 function02, Modifier modifier, Function1 function1, Function0 function03, Function1 function12, Function2 function2, int i, int i2, Composer composer, int i3) {
        GlobalPageGestureRecognizer(function0, function02, modifier, function1, function03, function12, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalPageGestureRecognizer$lambda$1$lambda$0(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalPageGestureRecognizer$lambda$5$lambda$4(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GlobalPageGestureRecognizer(final Function0<Boolean> shouldConsumeVerticalScroll, final Function0<Boolean> shouldProcessEvents, Modifier modifier, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super Float, Unit> function13;
        int i5;
        Function0<Unit> function02;
        int i6;
        Function1<? super Boolean, Unit> function14;
        Modifier modifier3;
        Function1<? super Float, Unit> function15;
        Function0<Unit> function03;
        Function1<? super Boolean, Unit> function16;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue2;
        final SnapshotFloatState2 snapshotFloatState22;
        boolean z;
        Object obj;
        final Function1<? super Boolean, Unit> function17;
        Modifier modifier4;
        final Function0<Unit> function04;
        int i7;
        final Function1<? super Float, Unit> function18;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function1<? super Boolean, Unit> function19;
        final Function1<? super Float, Unit> function110;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(shouldConsumeVerticalScroll, "shouldConsumeVerticalScroll");
        Intrinsics.checkNotNullParameter(shouldProcessEvents, "shouldProcessEvents");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1317504795);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(shouldConsumeVerticalScroll) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(shouldProcessEvents) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        function14 = function12;
                    } else {
                        function14 = function12;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                        }
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return GlobalPageGestureRecognizer.GlobalPageGestureRecognizer$lambda$1$lambda$0(((Float) obj2).floatValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function15 = (Function1) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function15 = function13;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function03 = (Function0) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function03 = function02;
                        }
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        return GlobalPageGestureRecognizer.GlobalPageGestureRecognizer$lambda$5$lambda$4(((Boolean) obj2).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function16 = (Function1) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function16 = function14;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1317504795, i3, -1, "com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizer (GlobalPageGestureRecognizer.kt:38)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        z = ((458752 & i3) != 131072) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | ((57344 & i3) != 16384);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue6 == companion.getEmpty()) {
                            function17 = function16;
                            modifier4 = modifier3;
                            function04 = function03;
                            i7 = i3;
                            function18 = function15;
                            obj = new PointerInputEventHandler() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1

                                /* compiled from: GlobalPageGestureRecognizer.kt */
                                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1$1", m3645f = "GlobalPageGestureRecognizer.kt", m3646l = {49, 59}, m3647m = "invokeSuspend")
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1$1 */
                                static final class C264541 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Function0<Unit> $onGestureEnd;
                                    final /* synthetic */ Function1<Boolean, Unit> $onScrollingChanged;
                                    final /* synthetic */ Function1<Float, Unit> $onVerticalScroll;
                                    final /* synthetic */ Function0<Boolean> $shouldConsumeVerticalScroll;
                                    final /* synthetic */ Function0<Boolean> $shouldProcessEvents;
                                    final /* synthetic */ SnapshotFloatState2 $totalDx$delegate;
                                    final /* synthetic */ SnapshotFloatState2 $totalDy$delegate;
                                    private /* synthetic */ Object L$0;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    C264541(Function1<? super Boolean, Unit> function1, Function0<Boolean> function0, Function1<? super Float, Unit> function12, Function0<Boolean> function02, Function0<Unit> function03, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Continuation<? super C264541> continuation) {
                                        super(2, continuation);
                                        this.$onScrollingChanged = function1;
                                        this.$shouldProcessEvents = function0;
                                        this.$onVerticalScroll = function12;
                                        this.$shouldConsumeVerticalScroll = function02;
                                        this.$onGestureEnd = function03;
                                        this.$totalDx$delegate = snapshotFloatState2;
                                        this.$totalDy$delegate = snapshotFloatState22;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C264541 c264541 = new C264541(this.$onScrollingChanged, this.$shouldProcessEvents, this.$onVerticalScroll, this.$shouldConsumeVerticalScroll, this.$onGestureEnd, this.$totalDx$delegate, this.$totalDy$delegate, continuation);
                                        c264541.L$0 = obj;
                                        return c264541;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                        return ((C264541) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
                                    
                                        if (r13 != r0) goto L18;
                                     */
                                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:18:0x0062). Please report as a decompilation issue!!! */
                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invokeSuspend(Object obj) {
                                        C264541 c264541;
                                        AwaitPointerEventScope awaitPointerEventScope;
                                        Object next;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                            this.L$0 = awaitPointerEventScope2;
                                            this.label = 1;
                                            c264541 = this;
                                            if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c264541, 2, null) != coroutine_suspended) {
                                                awaitPointerEventScope = awaitPointerEventScope2;
                                            }
                                            return coroutine_suspended;
                                        }
                                        if (i != 1) {
                                            if (i != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                            ResultKt.throwOnFailure(obj);
                                            c264541 = this;
                                            PointerEvent pointerEvent = (PointerEvent) obj;
                                            Iterator<T> it = pointerEvent.getChanges().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                PointerInputChange pointerInputChange = (PointerInputChange) next;
                                                if (pointerInputChange.getPressed() && PointerEventKt.positionChanged(pointerInputChange)) {
                                                    break;
                                                }
                                            }
                                            PointerInputChange pointerInputChange2 = (PointerInputChange) next;
                                            if (c264541.$shouldProcessEvents.invoke().booleanValue() && pointerInputChange2 != null) {
                                                long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition());
                                                SnapshotFloatState2 snapshotFloatState2 = c264541.$totalDx$delegate;
                                                snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + Float.intBitsToFloat((int) (jM6546minusMKHz9U >> 32)));
                                                SnapshotFloatState2 snapshotFloatState22 = c264541.$totalDy$delegate;
                                                int i2 = (int) (jM6546minusMKHz9U & 4294967295L);
                                                snapshotFloatState22.setFloatValue(snapshotFloatState22.getFloatValue() + Float.intBitsToFloat(i2));
                                                if (Math.abs(c264541.$totalDy$delegate.getFloatValue()) > Math.abs(c264541.$totalDx$delegate.getFloatValue()) * 1.5f && Float.intBitsToFloat(i2) != 0.0f) {
                                                    c264541.$onVerticalScroll.invoke(boxing.boxFloat(Float.intBitsToFloat(i2)));
                                                    if (c264541.$shouldConsumeVerticalScroll.invoke().booleanValue()) {
                                                        pointerInputChange2.consume();
                                                    }
                                                }
                                            }
                                            List<PointerInputChange> changes = pointerEvent.getChanges();
                                            if (!(changes instanceof Collection) || !changes.isEmpty()) {
                                                Iterator<T> it2 = changes.iterator();
                                                while (it2.hasNext()) {
                                                    if (((PointerInputChange) it2.next()).getPressed()) {
                                                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                                                        c264541.L$0 = awaitPointerEventScope;
                                                        c264541.label = 2;
                                                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                                                    }
                                                }
                                            }
                                            c264541.$onGestureEnd.invoke();
                                            c264541.$onScrollingChanged.invoke(boxing.boxBoolean(false));
                                            return Unit.INSTANCE;
                                        }
                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        c264541 = this;
                                        c264541.$totalDx$delegate.setFloatValue(0.0f);
                                        c264541.$totalDy$delegate.setFloatValue(0.0f);
                                        c264541.$onScrollingChanged.invoke(boxing.boxBoolean(true));
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                        c264541.L$0 = awaitPointerEventScope;
                                        c264541.label = 2;
                                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                                    }
                                }

                                @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C264541(function17, shouldProcessEvents, function18, shouldConsumeVerticalScroll, function04, snapshotFloatState2, snapshotFloatState22, null), continuation);
                                    return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(obj);
                        } else {
                            function04 = function03;
                            obj = objRememberedValue6;
                            function17 = function16;
                            i7 = i3;
                            modifier4 = modifier3;
                            function18 = function15;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, unit, (PointerInputEventHandler) obj);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function19 = function17;
                        function110 = function18;
                        modifier5 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        function19 = function14;
                        function110 = function13;
                        function04 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return GlobalPageGestureRecognizer.GlobalPageGestureRecognizer$lambda$14(shouldConsumeVerticalScroll, shouldProcessEvents, modifier5, function110, function04, function19, content, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    z = ((458752 & i3) != 131072) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | ((i3 & 14) != 4) | ((57344 & i3) != 16384);
                    Object objRememberedValue62 = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        function17 = function16;
                        modifier4 = modifier3;
                        function04 = function03;
                        i7 = i3;
                        function18 = function15;
                        obj = new PointerInputEventHandler() { // from class: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1

                            /* compiled from: GlobalPageGestureRecognizer.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1$1", m3645f = "GlobalPageGestureRecognizer.kt", m3646l = {49, 59}, m3647m = "invokeSuspend")
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.redesign.feature.accounttab.GlobalPageGestureRecognizerKt$GlobalPageGestureRecognizer$4$1$1 */
                            static final class C264541 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Function0<Unit> $onGestureEnd;
                                final /* synthetic */ Function1<Boolean, Unit> $onScrollingChanged;
                                final /* synthetic */ Function1<Float, Unit> $onVerticalScroll;
                                final /* synthetic */ Function0<Boolean> $shouldConsumeVerticalScroll;
                                final /* synthetic */ Function0<Boolean> $shouldProcessEvents;
                                final /* synthetic */ SnapshotFloatState2 $totalDx$delegate;
                                final /* synthetic */ SnapshotFloatState2 $totalDy$delegate;
                                private /* synthetic */ Object L$0;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                C264541(Function1<? super Boolean, Unit> function1, Function0<Boolean> function0, Function1<? super Float, Unit> function12, Function0<Boolean> function02, Function0<Unit> function03, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Continuation<? super C264541> continuation) {
                                    super(2, continuation);
                                    this.$onScrollingChanged = function1;
                                    this.$shouldProcessEvents = function0;
                                    this.$onVerticalScroll = function12;
                                    this.$shouldConsumeVerticalScroll = function02;
                                    this.$onGestureEnd = function03;
                                    this.$totalDx$delegate = snapshotFloatState2;
                                    this.$totalDy$delegate = snapshotFloatState22;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    C264541 c264541 = new C264541(this.$onScrollingChanged, this.$shouldProcessEvents, this.$onVerticalScroll, this.$shouldConsumeVerticalScroll, this.$onGestureEnd, this.$totalDx$delegate, this.$totalDy$delegate, continuation);
                                    c264541.L$0 = obj;
                                    return c264541;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                    return ((C264541) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
                                
                                    if (r13 != r0) goto L18;
                                 */
                                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:18:0x0062). Please report as a decompilation issue!!! */
                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invokeSuspend(Object obj) {
                                    C264541 c264541;
                                    AwaitPointerEventScope awaitPointerEventScope;
                                    Object next;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                        this.L$0 = awaitPointerEventScope2;
                                        this.label = 1;
                                        c264541 = this;
                                        if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c264541, 2, null) != coroutine_suspended) {
                                            awaitPointerEventScope = awaitPointerEventScope2;
                                        }
                                        return coroutine_suspended;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        c264541 = this;
                                        PointerEvent pointerEvent = (PointerEvent) obj;
                                        Iterator<T> it = pointerEvent.getChanges().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            PointerInputChange pointerInputChange = (PointerInputChange) next;
                                            if (pointerInputChange.getPressed() && PointerEventKt.positionChanged(pointerInputChange)) {
                                                break;
                                            }
                                        }
                                        PointerInputChange pointerInputChange2 = (PointerInputChange) next;
                                        if (c264541.$shouldProcessEvents.invoke().booleanValue() && pointerInputChange2 != null) {
                                            long jM6546minusMKHz9U = Offset.m6546minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition());
                                            SnapshotFloatState2 snapshotFloatState2 = c264541.$totalDx$delegate;
                                            snapshotFloatState2.setFloatValue(snapshotFloatState2.getFloatValue() + Float.intBitsToFloat((int) (jM6546minusMKHz9U >> 32)));
                                            SnapshotFloatState2 snapshotFloatState22 = c264541.$totalDy$delegate;
                                            int i2 = (int) (jM6546minusMKHz9U & 4294967295L);
                                            snapshotFloatState22.setFloatValue(snapshotFloatState22.getFloatValue() + Float.intBitsToFloat(i2));
                                            if (Math.abs(c264541.$totalDy$delegate.getFloatValue()) > Math.abs(c264541.$totalDx$delegate.getFloatValue()) * 1.5f && Float.intBitsToFloat(i2) != 0.0f) {
                                                c264541.$onVerticalScroll.invoke(boxing.boxFloat(Float.intBitsToFloat(i2)));
                                                if (c264541.$shouldConsumeVerticalScroll.invoke().booleanValue()) {
                                                    pointerInputChange2.consume();
                                                }
                                            }
                                        }
                                        List<PointerInputChange> changes = pointerEvent.getChanges();
                                        if (!(changes instanceof Collection) || !changes.isEmpty()) {
                                            Iterator<T> it2 = changes.iterator();
                                            while (it2.hasNext()) {
                                                if (((PointerInputChange) it2.next()).getPressed()) {
                                                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                                    c264541.L$0 = awaitPointerEventScope;
                                                    c264541.label = 2;
                                                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                                                }
                                            }
                                        }
                                        c264541.$onGestureEnd.invoke();
                                        c264541.$onScrollingChanged.invoke(boxing.boxBoolean(false));
                                        return Unit.INSTANCE;
                                    }
                                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    c264541 = this;
                                    c264541.$totalDx$delegate.setFloatValue(0.0f);
                                    c264541.$totalDy$delegate.setFloatValue(0.0f);
                                    c264541.$onScrollingChanged.invoke(boxing.boxBoolean(true));
                                    PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
                                    c264541.L$0 = awaitPointerEventScope;
                                    c264541.label = 2;
                                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, this);
                                }
                            }

                            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C264541(function17, shouldProcessEvents, function18, shouldConsumeVerticalScroll, function04, snapshotFloatState2, snapshotFloatState22, null), continuation);
                                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default2, unit2, (PointerInputEventHandler) obj);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            content.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 18) & 14));
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function19 = function17;
                            function110 = function18;
                            modifier5 = modifier4;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
