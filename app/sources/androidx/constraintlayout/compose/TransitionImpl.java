package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.TransitionParser;
import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Transition.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/constraintlayout/compose/Transition;", "Landroidx/constraintlayout/core/parser/CLObject;", "parsedTransition", "<init>", "(Landroidx/constraintlayout/core/parser/CLObject;)V", "Landroidx/constraintlayout/core/state/Transition;", NavTransition2.KEY_TRANSITION, "", "applyAllTo", "(Landroidx/constraintlayout/core/state/Transition;)V", "applyKeyFramesTo", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/constraintlayout/core/parser/CLObject;", "Companion", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class TransitionImpl implements Transition {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TransitionImpl EMPTY = new TransitionImpl(new CLObject(new char[0]));
    private final CLObject parsedTransition;

    public TransitionImpl(CLObject cLObject) {
        this.parsedTransition = cLObject;
    }

    public final void applyAllTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parse(this.parsedTransition, transition);
        } catch (CLParsingException e) {
            Log.e("CML", "Error parsing JSON " + e);
        }
    }

    public final void applyKeyFramesTo(androidx.constraintlayout.core.state.Transition transition) {
        try {
            TransitionParser.parseKeyFrames(this.parsedTransition, transition);
        } catch (CLParsingException e) {
            Log.e("CML", "Error parsing JSON " + e);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TransitionImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return Intrinsics.areEqual(this.parsedTransition, ((TransitionImpl) other).parsedTransition);
    }

    public int hashCode() {
        return this.parsedTransition.hashCode();
    }

    /* compiled from: Transition.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Landroidx/constraintlayout/compose/TransitionImpl$Companion;", "", "()V", "EMPTY", "Landroidx/constraintlayout/compose/TransitionImpl;", "getEMPTY$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/TransitionImpl;", "constraintlayout-compose_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TransitionImpl getEMPTY$constraintlayout_compose_release() {
            return TransitionImpl.EMPTY;
        }
    }
}
