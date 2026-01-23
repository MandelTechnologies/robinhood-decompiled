package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: ChangeList.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\u0015\u0010/\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0003J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\u001d\u00106\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J%\u00106\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u0002042\u0006\u00109\u001a\u000208¢\u0006\u0004\b6\u0010:J\u0015\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020\u001c¢\u0006\u0004\b<\u0010(J)\u0010A\u001a\u00020\b2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0=2\u0006\u0010@\u001a\u00020>¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bD\u0010-J@\u0010J\u001a\u00020\b\"\u0004\b\u0000\u0010E\"\u0004\b\u0001\u0010F2\u0006\u0010\u0013\u001a\u00028\u00012\u001d\u0010I\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0G¢\u0006\u0002\bH¢\u0006\u0004\bJ\u0010KJ\u001d\u0010N\u001a\u00020\b2\u0006\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u00020\u001c¢\u0006\u0004\bN\u0010OJ%\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\bQ\u0010RJ\u0015\u0010T\u001a\u00020\b2\u0006\u0010S\u001a\u00020\u001c¢\u0006\u0004\bT\u0010(J\u0015\u0010U\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\bU\u0010(J\u001d\u0010X\u001a\u00020\b2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0V¢\u0006\u0004\bX\u0010YJ\u001b\u0010\\\u001a\u00020\b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0Z¢\u0006\u0004\b\\\u0010]J\u001d\u0010`\u001a\u00020\b2\u0006\u0010_\u001a\u00020^2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b`\u0010aJ%\u0010d\u001a\u00020\b2\u000e\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0b2\u0006\u0010c\u001a\u00020^¢\u0006\u0004\bd\u0010eJ/\u0010k\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010f2\u0006\u0010i\u001a\u00020h2\u0006\u00105\u001a\u00020j2\u0006\u0010P\u001a\u00020j¢\u0006\u0004\bk\u0010lJ%\u0010o\u001a\u00020\b2\u0006\u0010@\u001a\u00020m2\u0006\u0010i\u001a\u00020h2\u0006\u0010n\u001a\u00020j¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020\b¢\u0006\u0004\bq\u0010\u0003J!\u0010s\u001a\u00020\b2\u0006\u0010r\u001a\u00020\u00002\n\b\u0002\u0010c\u001a\u0004\u0018\u00010^¢\u0006\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006x"}, m3636d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "value", "pushRemember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "pushStartResumingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "pushEndResumingScope", "", "", "groupSlotIndex", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", WebsocketGatewayConstants.DATA_KEY, "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "offset", "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "node", "pushUseNode", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "pushRemoveNode", "(II)V", "to", "pushMoveNode", "(III)V", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ChangeList extends Operations2 {
    private final Operations operations = new Operations();

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final void pushRemember(RememberObserverHolder value) {
        Operations operations2 = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations2.pushOp(remember);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), value);
        operations2.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl scope) {
        Operations operations2 = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations2.pushOp(startResumingScope);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), scope);
        operations2.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl scope) {
        Operations operations2 = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations2.pushOp(endResumingScope);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), scope);
        operations2.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations operations2 = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations2.pushOp(updateValue);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        Operations.WriteScope.m6395setObjectDKhxnng(operationsM6394constructorimpl, Operation.ObjectParameter.m6392constructorimpl(0), value);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations2.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations2 = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations2.pushOp(updateAnchoredValue);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        Operations.WriteScope.m6396setObjects4uCC6AY(operationsM6394constructorimpl, Operation.ObjectParameter.m6392constructorimpl(0), value, Operation.ObjectParameter.m6392constructorimpl(1), anchor);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = groupSlotIndex;
        operations2.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations operations2 = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations2.pushOp(appendValue);
        Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), anchor, Operation.ObjectParameter.m6392constructorimpl(1), value);
        operations2.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushTrimValues(int count) {
        Operations operations2 = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations2.pushOp(trimParentValues);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = count;
        operations2.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object data) {
        Operations operations2 = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations2.pushOp(updateAuxData);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), data);
        operations2.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations2 = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations2.pushOp(ensureGroupStarted);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), anchor);
        operations2.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations operations2 = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations2.pushOp(insertSlots);
        Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), anchor, Operation.ObjectParameter.m6392constructorimpl(1), from);
        operations2.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations2 = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations2.pushOp(insertSlotsWithFixups);
        Operations.WriteScope.m6398setObjectst7hvbck(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), anchor, Operation.ObjectParameter.m6392constructorimpl(1), from, Operation.ObjectParameter.m6392constructorimpl(2), fixups);
        operations2.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations2 = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations2.pushOp(moveCurrentGroup);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = offset;
        operations2.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> action, Composition composition) {
        Operations operations2 = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations2.pushOp(endCompositionScope);
        Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), action, Operation.ObjectParameter.m6392constructorimpl(1), composition);
        operations2.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushUseNode(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V value, Function2<? super T, ? super V, Unit> block) {
        Operations operations2 = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations2.pushOp(updateNode);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        int iM6392constructorimpl = Operation.ObjectParameter.m6392constructorimpl(0);
        int iM6392constructorimpl2 = Operation.ObjectParameter.m6392constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m6396setObjects4uCC6AY(operationsM6394constructorimpl, iM6392constructorimpl, value, iM6392constructorimpl2, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        operations2.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations2 = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations2.pushOp(removeNode);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        int ints = operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM6394constructorimpl.intArgs;
        iArr[ints] = removeFrom;
        iArr[ints + 1] = moveCount;
        operations2.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations2 = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations2.pushOp(moveNode);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        int ints = operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM6394constructorimpl.intArgs;
        iArr[ints + 1] = to;
        iArr[ints] = from;
        iArr[ints + 2] = count;
        operations2.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations2 = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations2.pushOp(advanceSlotsBy);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = distance;
        operations2.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushUps(int count) {
        Operations operations2 = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations2.pushOp(ups);
        Operations operationsM6394constructorimpl = Operations.WriteScope.m6394constructorimpl(operations2);
        operationsM6394constructorimpl.intArgs[operationsM6394constructorimpl.intArgsSize - operationsM6394constructorimpl.opCodes[operationsM6394constructorimpl.opCodesSize - 1].getInts()] = count;
        operations2.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushDowns(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations2 = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations2.pushOp(downs);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), nodes);
        operations2.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushSideEffect(Function0<Unit> effect) {
        Operations operations2 = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations2.pushOp(sideEffect);
        Operations.WriteScope.m6395setObjectDKhxnng(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), effect);
        operations2.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations2 = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations2.pushOp(determineMovableContentNodeIndex);
        Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), effectiveNodeIndexOut, Operation.ObjectParameter.m6392constructorimpl(1), anchor);
        operations2.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        Operations operations2 = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations2.pushOp(copyNodesToNewAnchorLocation);
        Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(1), nodes, Operation.ObjectParameter.m6392constructorimpl(0), effectiveNodeIndex);
        operations2.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations2 = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations2.pushOp(copySlotTableToAnchorLocation);
        Operations.WriteScope.m6397setObjectsOGa0p1M(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), resolvedState, Operation.ObjectParameter.m6392constructorimpl(1), parentContext, Operation.ObjectParameter.m6392constructorimpl(3), to, Operation.ObjectParameter.m6392constructorimpl(2), from);
        operations2.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations2 = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations2.pushOp(releaseMovableGroupAtCurrent);
        Operations.WriteScope.m6398setObjectst7hvbck(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), composition, Operation.ObjectParameter.m6392constructorimpl(1), parentContext, Operation.ObjectParameter.m6392constructorimpl(2), reference);
        operations2.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations2 = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations2.pushOp(applyChangeList);
            Operations.WriteScope.m6396setObjects4uCC6AY(Operations.WriteScope.m6394constructorimpl(operations2), Operation.ObjectParameter.m6392constructorimpl(0), changeList, Operation.ObjectParameter.m6392constructorimpl(1), effectiveNodeIndex);
            operations2.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }
}
