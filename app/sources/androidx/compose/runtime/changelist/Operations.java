package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Operations.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\"\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&R\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130'8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u0003R\u0016\u0010+\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u0011\u00108\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, m3636d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "currentSize", "requiredSize", "determineNewSize", "(II)I", "", "resizeOpCodes", "resizeIntArgs", "(II)V", "resizeObjectArgs", "", "isEmpty", "()Z", "isNotEmpty", "clear", "Landroidx/compose/runtime/changelist/Operation;", "operation", "pushOp", "(Landroidx/compose/runtime/changelist/Operation;)V", "push", "ensureAllArgumentsPushedFor", "other", "popInto", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingOperations", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "", "toString", "()Ljava/lang/String;", "", "opCodes", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime_release$annotations", "opCodesSize", "I", "", "intArgs", "[I", "intArgsSize", "", "objectArgs", "[Ljava/lang/Object;", "objectArgsSize", "pushedIntMask", "getSize", "()I", "size", "OpIterator", "WriteScope", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Operations extends Operations2 {

    @JvmField
    public int intArgsSize;

    @JvmField
    public int objectArgsSize;

    @JvmField
    public int opCodesSize;
    private int pushedIntMask;

    @JvmField
    public Operation[] opCodes = new Operation[16];

    @JvmField
    public int[] intArgs = new int[16];

    @JvmField
    public Object[] objectArgs = new Object[16];

    /* renamed from: getSize, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getOpCodesSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getOpCodesSize() != 0;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(Operation operation2) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = this.intArgsSize + operation2.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = this.objectArgsSize + operation2.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        operationArr[i] = operation2;
        this.intArgsSize += operation2.getInts();
        this.objectArgsSize += operation2.getObjects();
    }

    private final int determineNewSize(int currentSize, int requiredSize) {
        return RangesKt.coerceAtLeast(currentSize + RangesKt.coerceAtMost(currentSize, 1024), requiredSize);
    }

    private final void resizeOpCodes() {
        int iCoerceAtMost = RangesKt.coerceAtMost(this.opCodesSize, 1024);
        int i = this.opCodesSize;
        Operation[] operationArr = new Operation[iCoerceAtMost + i];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i);
        this.opCodes = operationArr;
    }

    private final void resizeIntArgs(int currentSize, int requiredSize) {
        int[] iArr = new int[determineNewSize(currentSize, requiredSize)];
        ArraysKt.copyInto(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void resizeObjectArgs(int currentSize, int requiredSize) {
        Object[] objArr = new Object[determineNewSize(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    public final void push(Operation operation2) {
        pushOp(operation2);
    }

    public final void ensureAllArgumentsPushedFor(Operation operation2) {
        int i = this.pushedIntMask;
        int ints = operation2.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation2.getObjects();
        }
    }

    public final void popInto(Operations other) {
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation2 = operationArr[i];
        operationArr[i] = null;
        other.pushOp(operation2);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - operation2.getObjects();
        int objects2 = this.objectArgsSize - operation2.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        ArraysKt.fill(this.objectArgs, (Object) null, this.objectArgsSize - operation2.getObjects(), this.objectArgsSize);
        ArraysKt.copyInto(this.intArgs, other.intArgs, other.intArgsSize - operation2.getInts(), this.intArgsSize - operation2.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation2.getObjects();
        this.intArgsSize -= operation2.getInts();
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().execute(opIterator, applier, slots, rememberManager);
            } while (opIterator.next());
        }
        clear();
    }

    /* compiled from: Operations.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0012\u001a\u00028\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jd\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0012\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0018\u001a\u00028\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0080\u0001\u0010\u0015\u001a\u00020\n\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u000e\"\u0004\b\u0002\u0010\u0016\"\u0004\b\u0003\u0010\u001b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0010\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u0012\u001a\u00028\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0006\u0010\u0018\u001a\u00028\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00030\u00072\u0006\u0010\u001d\u001a\u00028\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m3636d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", "stack", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "parameter", "value", "", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "U", "parameter1", "value1", "parameter2", "value2", "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "setObjects", "V", "parameter3", "value3", "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class WriteScope {
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Operations m6394constructorimpl(Operations operations2) {
            return operations2;
        }

        /* renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m6395setObjectDKhxnng(Operations operations2, int i, T t) {
            operations2.objectArgs[(operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getObjects()) + i] = t;
        }

        /* renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m6396setObjects4uCC6AY(Operations operations2, int i, T t, int i2, U u) {
            int objects = operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getObjects();
            Object[] objArr = operations2.objectArgs;
            objArr[i + objects] = t;
            objArr[objects + i2] = u;
        }

        /* renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m6398setObjectst7hvbck(Operations operations2, int i, T t, int i2, U u, int i3, V v) {
            int objects = operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getObjects();
            Object[] objArr = operations2.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[objects + i3] = v;
        }

        /* renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m6397setObjectsOGa0p1M(Operations operations2, int i, T t, int i2, U u, int i3, V v, int i4, W w) {
            int objects = operations2.objectArgsSize - operations2.opCodes[operations2.opCodesSize - 1].getObjects();
            Object[] objArr = operations2.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[i3 + objects] = v;
            objArr[objects + i4] = w;
        }
    }

    /* compiled from: Operations.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m3636d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "", "next", "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "opIdx", "I", "intIdx", "objIdx", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "operation", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation2 = getOperation();
            this.intIdx += operation2.getInts();
            this.objIdx += operation2.getObjects();
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < Operations.this.opCodesSize;
        }

        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public int getInt(int parameter) {
            return Operations.this.intArgs[this.intIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* renamed from: getObject-31yXWZQ */
        public <T> T mo6393getObject31yXWZQ(int parameter) {
            return (T) Operations.this.objectArgs[this.objIdx + parameter];
        }
    }

    @Deprecated
    public String toString() {
        return super.toString();
    }
}
