package androidx.compose.p011ui.input.nestedscroll;

import androidx.compose.p011ui.node.ModifierNodeElement;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "connection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "()Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;", "node", "", "update", "(Landroidx/compose/ui/input/nestedscroll/NestedScrollNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getConnection", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollElement, reason: use source file name */
/* loaded from: classes4.dex */
final class NestedScrollModifier6 extends ModifierNodeElement<NestedScrollNode> {
    private final NestedScrollModifier connection;
    private final NestedScrollModifier2 dispatcher;

    public NestedScrollModifier6(NestedScrollModifier nestedScrollModifier, NestedScrollModifier2 nestedScrollModifier2) {
        this.connection = nestedScrollModifier;
        this.dispatcher = nestedScrollModifier2;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    /* renamed from: create */
    public NestedScrollNode getNode() {
        return new NestedScrollNode(this.connection, this.dispatcher);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(NestedScrollNode node) {
        node.updateNode$ui_release(this.connection, this.dispatcher);
    }

    public int hashCode() {
        int iHashCode = this.connection.hashCode() * 31;
        NestedScrollModifier2 nestedScrollModifier2 = this.dispatcher;
        return iHashCode + (nestedScrollModifier2 != null ? nestedScrollModifier2.hashCode() : 0);
    }

    public boolean equals(Object other) {
        if (!(other instanceof NestedScrollModifier6)) {
            return false;
        }
        NestedScrollModifier6 nestedScrollModifier6 = (NestedScrollModifier6) other;
        return Intrinsics.areEqual(nestedScrollModifier6.connection, this.connection) && Intrinsics.areEqual(nestedScrollModifier6.dispatcher, this.dispatcher);
    }
}
