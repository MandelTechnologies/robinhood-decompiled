package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.node.TraversableNode;
import androidx.compose.p011ui.node.TraversableNode3;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NestedScrollNode.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\"\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u000eJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b$\u0010\bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00104\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0014\u0010=\u001a\u00020:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, m3636d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/Modifier$Node;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "newDispatcher", "", "updateDispatcher", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "updateDispatcherFields", "()V", "resetDispatcherFields", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "onAttach", "onDetach", "updateNode$ui_release", "updateNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "setConnection", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;)V", "resolvedDispatcher", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "lastKnownParentNode", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "getLastKnownParentNode$ui_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "setLastKnownParentNode$ui_release", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "getParentConnection", "parentConnection", "Lkotlinx/coroutines/CoroutineScope;", "getNestedCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "nestedCoroutineScope", "getParentNestedScrollNode$ui_release", "parentNestedScrollNode", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollModifier {
    private NestedScrollModifier connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollModifier2 resolvedDispatcher;
    private final Object traverseKey;

    public NestedScrollNode(NestedScrollModifier nestedScrollModifier, NestedScrollModifier2 nestedScrollModifier2) {
        this.connection = nestedScrollModifier;
        this.resolvedDispatcher = nestedScrollModifier2 == null ? new NestedScrollModifier2() : nestedScrollModifier2;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final NestedScrollNode getParentNestedScrollNode$ui_release() {
        if (getIsAttached()) {
            return (NestedScrollNode) TraversableNode3.findNearestAncestor(this);
        }
        return null;
    }

    private final NestedScrollModifier getParentConnection() {
        if (getIsAttached()) {
            return getParentNestedScrollNode$ui_release();
        }
        return null;
    }

    @Override // androidx.compose.p011ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoroutineScope getNestedCoroutineScope() {
        CoroutineScope nestedCoroutineScope;
        NestedScrollNode parentNestedScrollNode$ui_release = getParentNestedScrollNode$ui_release();
        if (parentNestedScrollNode$ui_release != null && (nestedCoroutineScope = parentNestedScrollNode$ui_release.getNestedCoroutineScope()) != null) {
            return nestedCoroutineScope;
        }
        CoroutineScope scope = this.resolvedDispatcher.getScope();
        if (scope != null) {
            return scope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo5298onPreScrollOzD1aCk(long available, int source) {
        NestedScrollModifier parentConnection = getParentConnection();
        long jMo5298onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo5298onPreScrollOzD1aCk(available, source) : Offset.INSTANCE.m6553getZeroF1C5BW0();
        return Offset.m6547plusMKHz9U(jMo5298onPreScrollOzD1aCk, this.connection.mo5298onPreScrollOzD1aCk(Offset.m6546minusMKHz9U(available, jMo5298onPreScrollOzD1aCk), source));
    }

    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo5024onPostScrollDzOQY0M(long consumed, long available, int source) {
        long jM6553getZeroF1C5BW0;
        long jMo5024onPostScrollDzOQY0M = this.connection.mo5024onPostScrollDzOQY0M(consumed, available, source);
        NestedScrollModifier parentConnection = getParentConnection();
        if (parentConnection != null) {
            jM6553getZeroF1C5BW0 = parentConnection.mo5024onPostScrollDzOQY0M(Offset.m6547plusMKHz9U(consumed, jMo5024onPostScrollDzOQY0M), Offset.m6546minusMKHz9U(available, jMo5024onPostScrollDzOQY0M), source);
        } else {
            jM6553getZeroF1C5BW0 = Offset.INSTANCE.m6553getZeroF1C5BW0();
        }
        return Offset.m6547plusMKHz9U(jMo5024onPostScrollDzOQY0M, jM6553getZeroF1C5BW0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo5609onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        NestedScrollNode3 nestedScrollNode3;
        long jM8109getZero9UxMQ8M;
        NestedScrollNode nestedScrollNode;
        long j2;
        if (continuation instanceof NestedScrollNode3) {
            nestedScrollNode3 = (NestedScrollNode3) continuation;
            int i = nestedScrollNode3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode3.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode3 = new NestedScrollNode3(this, continuation);
            }
        }
        Object objMo5609onPreFlingQWom1Mo = nestedScrollNode3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollNode3.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo5609onPreFlingQWom1Mo);
            NestedScrollModifier parentConnection = getParentConnection();
            if (parentConnection != null) {
                nestedScrollNode3.L$0 = this;
                nestedScrollNode3.J$0 = j;
                nestedScrollNode3.label = 1;
                objMo5609onPreFlingQWom1Mo = parentConnection.mo5609onPreFlingQWom1Mo(j, nestedScrollNode3);
                if (objMo5609onPreFlingQWom1Mo != coroutine_suspended) {
                    nestedScrollNode = this;
                }
                return coroutine_suspended;
            }
            jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
            nestedScrollNode = this;
            long j3 = jM8109getZero9UxMQ8M;
            long j4 = j;
            j2 = j3;
            NestedScrollModifier nestedScrollModifier = nestedScrollNode.connection;
            long jM8104minusAH228Gc = Velocity.m8104minusAH228Gc(j4, j2);
            nestedScrollNode3.L$0 = null;
            nestedScrollNode3.J$0 = j2;
            nestedScrollNode3.label = 2;
            objMo5609onPreFlingQWom1Mo = nestedScrollModifier.mo5609onPreFlingQWom1Mo(jM8104minusAH228Gc, nestedScrollNode3);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = nestedScrollNode3.J$0;
                ResultKt.throwOnFailure(objMo5609onPreFlingQWom1Mo);
                return Velocity.m8095boximpl(Velocity.m8105plusAH228Gc(j2, ((Velocity) objMo5609onPreFlingQWom1Mo).getPackedValue()));
            }
            j = nestedScrollNode3.J$0;
            nestedScrollNode = (NestedScrollNode) nestedScrollNode3.L$0;
            ResultKt.throwOnFailure(objMo5609onPreFlingQWom1Mo);
        }
        jM8109getZero9UxMQ8M = ((Velocity) objMo5609onPreFlingQWom1Mo).getPackedValue();
        long j32 = jM8109getZero9UxMQ8M;
        long j42 = j;
        j2 = j32;
        NestedScrollModifier nestedScrollModifier2 = nestedScrollNode.connection;
        long jM8104minusAH228Gc2 = Velocity.m8104minusAH228Gc(j42, j2);
        nestedScrollNode3.L$0 = null;
        nestedScrollNode3.J$0 = j2;
        nestedScrollNode3.label = 2;
        objMo5609onPreFlingQWom1Mo = nestedScrollModifier2.mo5609onPreFlingQWom1Mo(jM8104minusAH228Gc2, nestedScrollNode3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        NestedScrollNode2 nestedScrollNode2;
        NestedScrollNode nestedScrollNode;
        long j3;
        long j4;
        long packedValue;
        long jM8109getZero9UxMQ8M;
        long j5;
        if (continuation instanceof NestedScrollNode2) {
            nestedScrollNode2 = (NestedScrollNode2) continuation;
            int i = nestedScrollNode2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode2.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode2 = new NestedScrollNode2(this, continuation);
            }
        }
        NestedScrollNode2 nestedScrollNode22 = nestedScrollNode2;
        Object objMo5023onPostFlingRZ2iAVY = nestedScrollNode22.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = nestedScrollNode22.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
            NestedScrollModifier nestedScrollModifier = this.connection;
            nestedScrollNode22.L$0 = this;
            nestedScrollNode22.J$0 = j;
            nestedScrollNode22.J$1 = j2;
            nestedScrollNode22.label = 1;
            objMo5023onPostFlingRZ2iAVY = nestedScrollModifier.mo5023onPostFlingRZ2iAVY(j, j2, nestedScrollNode22);
            if (objMo5023onPostFlingRZ2iAVY != coroutine_suspended) {
                nestedScrollNode = this;
                j3 = j;
                j4 = j2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = nestedScrollNode22.J$0;
            ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
            jM8109getZero9UxMQ8M = ((Velocity) objMo5023onPostFlingRZ2iAVY).getPackedValue();
            packedValue = j5;
            return Velocity.m8095boximpl(Velocity.m8105plusAH228Gc(packedValue, jM8109getZero9UxMQ8M));
        }
        j4 = nestedScrollNode22.J$1;
        j3 = nestedScrollNode22.J$0;
        nestedScrollNode = (NestedScrollNode) nestedScrollNode22.L$0;
        ResultKt.throwOnFailure(objMo5023onPostFlingRZ2iAVY);
        packedValue = ((Velocity) objMo5023onPostFlingRZ2iAVY).getPackedValue();
        NestedScrollModifier parentConnection = (!ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled || nestedScrollNode.getIsAttached()) ? nestedScrollNode.getParentConnection() : nestedScrollNode.lastKnownParentNode;
        NestedScrollModifier nestedScrollModifier2 = parentConnection;
        if (nestedScrollModifier2 != null) {
            long jM8105plusAH228Gc = Velocity.m8105plusAH228Gc(j3, packedValue);
            long jM8104minusAH228Gc = Velocity.m8104minusAH228Gc(j4, packedValue);
            nestedScrollNode22.L$0 = null;
            nestedScrollNode22.J$0 = packedValue;
            nestedScrollNode22.label = 2;
            objMo5023onPostFlingRZ2iAVY = nestedScrollModifier2.mo5023onPostFlingRZ2iAVY(jM8105plusAH228Gc, jM8104minusAH228Gc, nestedScrollNode22);
            if (objMo5023onPostFlingRZ2iAVY != coroutine_suspended) {
                j5 = packedValue;
                jM8109getZero9UxMQ8M = ((Velocity) objMo5023onPostFlingRZ2iAVY).getPackedValue();
                packedValue = j5;
                return Velocity.m8095boximpl(Velocity.m8105plusAH228Gc(packedValue, jM8109getZero9UxMQ8M));
            }
            return coroutine_suspended;
        }
        jM8109getZero9UxMQ8M = Velocity.INSTANCE.m8109getZero9UxMQ8M();
        return Velocity.m8095boximpl(Velocity.m8105plusAH228Gc(packedValue, jM8109getZero9UxMQ8M));
    }

    private final void updateDispatcher(NestedScrollModifier2 newDispatcher) {
        resetDispatcherFields();
        if (newDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollModifier2();
        } else if (!Intrinsics.areEqual(newDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = newDispatcher;
        }
        if (getIsAttached()) {
            updateDispatcherFields();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNode4.findNearestAttachedAncestor(this);
            this.lastKnownParentNode = nestedScrollNode;
            this.resolvedDispatcher.setLastKnownParentNode$ui_release(nestedScrollNode);
        }
        resetDispatcherFields();
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui_release(this);
        if (ComposeUiFlags.NewNestedScrollFlingDispatchingEnabled) {
            this.resolvedDispatcher.setLastKnownParentNode$ui_release(null);
            this.lastKnownParentNode = null;
        }
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui_release(new Function0<CoroutineScope>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNode.updateDispatcherFields.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CoroutineScope invoke() {
                return NestedScrollNode.this.getNestedCoroutineScope();
            }
        });
        this.resolvedDispatcher.setScope$ui_release(getCoroutineScope());
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui_release(null);
        }
    }

    public final void updateNode$ui_release(NestedScrollModifier connection, NestedScrollModifier2 dispatcher) {
        this.connection = connection;
        updateDispatcher(dispatcher);
    }
}
